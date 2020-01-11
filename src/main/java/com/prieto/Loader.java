package com.prieto;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.discovery.event.ServiceStartedEvent;
import io.micronaut.scheduling.annotation.Async;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Loader implements ApplicationEventListener<ServiceStartedEvent> {

    private static final Logger log = LoggerFactory.getLogger(Loader.class);
    private static final String stockIndexPrinter = "Symbol: %s, Name: %s, Currency: %s\n";

    @Inject
    Retrofit retrofit;

    @Override
    @Async
    public void onApplicationEvent(ServiceStartedEvent event) {
       /* StockIndexService service = retrofit.create(StockIndexService.class);
        Call<StockIndexResponse> callSync = service.getStockIndex();

        try {
            Response<StockIndexResponse> response = callSync.execute();
            StockIndexResponse stockIndexResponse = response.body();
            stockIndexResponse.data.forEach(stockIndex -> {
                System.out.printf(stockIndexPrinter, stockIndex.symbol, stockIndex.name, stockIndex.currency);
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */
    }
}
