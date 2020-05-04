package com.orangedusk.mytemplate.covid.domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.orangedusk.mytemplate.common.util.AsyncTransformations;
import com.orangedusk.mytemplate.common.util.Constants;
import com.orangedusk.mytemplate.common.vo.Resource;
import com.orangedusk.mytemplate.common.vo.Status;
import com.orangedusk.mytemplate.covid.repository.CovidDataRepository;
import com.orangedusk.mytemplate.covid.uimodel.CovidListItemUiModel;
import com.orangedusk.mytemplate.covid.vo.Statewise;

import java.util.ArrayList;
import java.util.List;

public class CovidInteractorImpl implements CovidInteractor{

    private CovidDataRepository repository ;
    private MediatorLiveData<Resource<List<CovidListItemUiModel>>> mObservableCovidUiModels = new MediatorLiveData<>();
    private MutableLiveData<Boolean> refreshData = new MutableLiveData<Boolean>();

    private static CovidInteractorImpl covidInteractor;
    public static CovidInteractor getInstance() {
        if(covidInteractor==null){
            covidInteractor= new CovidInteractorImpl();
        }
        return covidInteractor;
    }

    public CovidInteractorImpl() {
        repository= CovidDataRepository.getInstance();
        LiveData<Resource<List<Statewise>>> stateWiseList= Transformations.switchMap(refreshData,refresh->repository.getStateWiseList());
        AsyncTransformations.map(stateWiseList,mObservableCovidUiModels,this::createCovidUiModels);
    }

    @Override
    public LiveData<Resource<List<CovidListItemUiModel>>> getCovidUiModelList() {
        //Call refresh data the first time the method is called to trigger fetching data
        refreshData();
        return mObservableCovidUiModels;
    }

    @Override
    public void refreshData() {
      refreshData.setValue(true);
    }


    public Resource<List<CovidListItemUiModel>> createCovidUiModels(Resource<List<Statewise>> stateWiseListResource){
        List<CovidListItemUiModel> covidListItemUiModels = new ArrayList<>();
        if(stateWiseListResource.status == Status.ERROR){
            return Resource.error(stateWiseListResource.message,covidListItemUiModels);
        }

        if(stateWiseListResource.status== Status.LOADING){
            return  Resource.loading(covidListItemUiModels);
        }

        List<Statewise> statewiseList= stateWiseListResource.data;
        if(statewiseList==null || statewiseList.isEmpty()){
            return Resource.error(Constants.EMPTY_LIST,covidListItemUiModels);
        }

        for(Statewise statewise : statewiseList){
            CovidListItemUiModel uiModel = new CovidListItemUiModel();
            uiModel.setConfirmedCases(statewise.getConfirmed());
            uiModel.setDeaths(statewise.getDeaths());
            uiModel.setStateName(statewise.getState());
            uiModel.setLastUpdated(statewise.getLastupdatedtime());
            covidListItemUiModels.add(uiModel);
        }

        return Resource.success(covidListItemUiModels);
    }




}
