package com.orangedusk.mytemplate.covid.service;

import com.orangedusk.mytemplate.covid.vo.CovidResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidService {

    @GET("data.json")
    Call<CovidResponse> getCovidData();
}
