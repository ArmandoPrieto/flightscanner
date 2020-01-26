package com.prieto.service;

import com.prieto.Repository;
import com.prieto.model.response.StockExchangeResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface StockExchangeService {

    @GET("exchange_list?api_token=" + Repository.API_KEY)
    Call<StockExchangeResponse> getStockExchange();
}
