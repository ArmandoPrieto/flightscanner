package com.prieto;

import com.prieto.model.response.StockCurrencyResponse;
import com.prieto.service.StockCurrencyService;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.inject.Inject;
import java.io.IOException;

@MicronautTest
public class StockCurrencyTest {

    @Inject
    Retrofit retrofit;

    @Inject
    Repository repository;

    @Test
    void stockCurrency_test() throws IOException {
        StockCurrencyService service = retrofit.create(StockCurrencyService.class);
        Call<StockCurrencyResponse> callSync = service.getStockCurrency(repository.getKey());
        Response<StockCurrencyResponse> response = callSync.execute();
        StockCurrencyResponse stockExchangeResponse = response.body();
        assert stockExchangeResponse != null;
    }
}
