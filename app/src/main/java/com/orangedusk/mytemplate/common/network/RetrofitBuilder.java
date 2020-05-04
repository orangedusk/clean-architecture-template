package com.orangedusk.mytemplate.common.network;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitBuilder {

    private static Retrofit retrofitInstance;
    private static final String BASE_URL= "https://api.covid19india.org/";

    public static Retrofit getInstance(){
        if(retrofitInstance==null) {
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();
        }
        return retrofitInstance;
    }
}
