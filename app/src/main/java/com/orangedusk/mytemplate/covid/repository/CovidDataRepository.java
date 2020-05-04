package com.orangedusk.mytemplate.covid.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.orangedusk.mytemplate.common.network.RetrofitBuilder;
import com.orangedusk.mytemplate.common.util.Constants;
import com.orangedusk.mytemplate.common.vo.Resource;
import com.orangedusk.mytemplate.covid.service.CovidService;
import com.orangedusk.mytemplate.covid.vo.CovidResponse;
import com.orangedusk.mytemplate.covid.vo.Statewise;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CovidDataRepository {
    private static final String TAG = CovidDataRepository.class.getSimpleName();
    private static CovidDataRepository repository;
    private MutableLiveData<Resource<List<Statewise>>> mObservableStatewiseList = new MutableLiveData<>();
    private CovidService covidService;
    private List<Statewise> mStateWiseData;

    public static CovidDataRepository getInstance(){
        if(repository==null){
            repository = new CovidDataRepository();
        }
        return repository;
    }

    private CovidDataRepository(){
        covidService = RetrofitBuilder.getInstance().create(CovidService.class);
    }

    public MutableLiveData<Resource<List<Statewise>>> getStateWiseList(){
        mObservableStatewiseList.setValue(Resource.loading(mStateWiseData));
        covidService.getCovidData().enqueue(new Callback<CovidResponse>() {
            @Override
            public void onResponse(Call<CovidResponse> call, Response<CovidResponse> response) {
                Log.d(TAG, "Response:"+ response.body().toString());
                mStateWiseData = response.body().getStatewise();
                mObservableStatewiseList.setValue(Resource.success(mStateWiseData));
            }

            @Override
            public void onFailure(Call<CovidResponse> call, Throwable t) {
                Log.e(TAG, "Error:"+ t.getMessage());
                mObservableStatewiseList.setValue(Resource.error(Constants.GENERIC_ERROR,mStateWiseData));
            }
        });
        return mObservableStatewiseList;
    }

}
