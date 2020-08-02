package com.prieto.service;

import com.prieto.Repository;
import com.prieto.model.response.StockExchangeResponse;
import io.micronaut.core.annotation.Introspected;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Introspected
public interface StockExchangeService {

    @GET("exchanges")
    Call<StockExchangeResponse> getStockExchange(@Query("access_key") String apiKey);
}
