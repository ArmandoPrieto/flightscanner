package com.prieto;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StockIndexService {

    @GET("stock?symbol=SNAP,TWTR,VOD.L&api_token=" + Repository.API_KEY)
    Call<StockIndexResponse> getStockIndex();
}
