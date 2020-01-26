package com.prieto.service;

import com.prieto.Repository;
import com.prieto.model.response.StockCurrencyResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface StockCurrencyService {

    @GET("forex?base=USD&api_token=" + Repository.API_KEY)
    Call<StockCurrencyResponse> getStockCurrency();

}
