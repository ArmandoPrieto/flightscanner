package com.prieto;

import com.prieto.model.response.StockExchangeResponse;
import com.prieto.service.StockExchangeService;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.inject.Inject;
import java.io.IOException;

@MicronautTest
public class StockExchangeTest {

    @Inject
    Retrofit retrofit;

    @Inject
    Repository repository;

    @Test
    void stockExhange_test() throws IOException {
        StockExchangeService service = retrofit.create(StockExchangeService.class);
        Call<StockExchangeResponse> callSync = service.getStockExchange(repository.getKey());
        Response<StockExchangeResponse> response = callSync.execute();
        StockExchangeResponse stockExchangeResponse = response.body();
        assert stockExchangeResponse != null;
    }
}
