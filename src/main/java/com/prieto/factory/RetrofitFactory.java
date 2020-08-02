package com.prieto.factory;

import com.prieto.Repository;
import io.micronaut.context.annotation.Factory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Factory
public class RetrofitFactory {

    @Inject
    Repository repository;

    @Singleton
    Retrofit getRetrofit(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        return new Retrofit.Builder()
            .baseUrl(repository.getUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();
    }
}
