package com.prieto.service;

import com.prieto.Repository;
import com.prieto.model.response.StockCurrencyResponse;
import io.micronaut.core.annotation.Introspected;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import javax.inject.Inject;

@Introspected
public interface StockCurrencyService {

    @GET("currencies?base=USD")
    Call<StockCurrencyResponse> getStockCurrency(@Query("access_key") String apiKey);

}
