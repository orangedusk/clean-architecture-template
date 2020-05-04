package com.orangedusk.mytemplate.covid.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.orangedusk.mytemplate.common.viewmodel.BaseViewModel;
import com.orangedusk.mytemplate.common.vo.Resource;
import com.orangedusk.mytemplate.covid.domain.CovidInteractor;
import com.orangedusk.mytemplate.covid.domain.CovidInteractorImpl;
import com.orangedusk.mytemplate.covid.uimodel.CovidListItemUiModel;

import java.util.List;

public class ListFragmentViewModel extends BaseViewModel {
    private final CovidInteractor covidInteractor;

    private LiveData<Resource<List<CovidListItemUiModel>>> mObservableCovidDataList;

    public ListFragmentViewModel() {
        this.covidInteractor = CovidInteractorImpl.getInstance();
        mObservableCovidDataList= covidInteractor.getCovidUiModelList();
    }

    @Override
    public void refreshData() {
        covidInteractor.refreshData();
    }

    public LiveData<Resource<List<CovidListItemUiModel>>> getCovidData() {
        return mObservableCovidDataList;
    }

}
