package com.prieto.service;

import com.prieto.Repository;
import com.prieto.model.response.StockIndexResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface StockIndexService {

    @GET("stock?symbol=SNAP,TWTR,VOD.L&api_token=" + Repository.API_KEY)
    Call<StockIndexResponse> getStockIndex();
}
