package com.prieto.service;

import com.prieto.Repository;
import com.prieto.model.response.StockIndexResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface StockIndexService {

    @GET("eod?symbols=SNAP&access_key=" + Repository.API_KEY)
    Call<StockIndexResponse> getStockIndex();
}
