package com.prieto.service;

import com.prieto.Repository;
import com.prieto.model.response.StockIndexResponse;
import io.micronaut.core.annotation.Introspected;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Introspected
public interface StockIndexService {

    @GET("eod?symbols=SNAP")
    Call<StockIndexResponse> getStockIndex(@Query("access_key") String apiKey);
}
