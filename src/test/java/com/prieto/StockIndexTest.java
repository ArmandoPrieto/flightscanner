package com.prieto;

import com.prieto.model.response.StockIndexResponse;
import com.prieto.service.StockIndexService;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.inject.Inject;
import java.io.IOException;

@MicronautTest
public class StockIndexTest {

    @Inject
    Retrofit retrofit;

    @Inject
    Repository repository;

    @Test
    void stockIndex_test() throws IOException {
        StockIndexService service = retrofit.create(StockIndexService.class);
        Call<StockIndexResponse> callSync = service.getStockIndex(repository.getKey());
        Response<StockIndexResponse> response = callSync.execute();
        StockIndexResponse stockIndexResponse = response.body();
        assert stockIndexResponse.getData() != null;
    }
}
