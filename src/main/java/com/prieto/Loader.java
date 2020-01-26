package com.prieto;

import com.prieto.model.response.StockCurrencyResponse;
import com.prieto.service.StockCurrencyService;
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
    private static final String stockExchangePrinter = "Stock: %s\n";
    private static final String stockCurrencyPrinter = "Currency: %s, Value: %s\n";

    @Inject
    Retrofit retrofit;

    @Override
    @Async
    public void onApplicationEvent(ServiceStartedEvent event) {
        //LOADING StockIndex
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
       //LOADING StockExchange
        /*
        StockExchangeService service = retrofit.create(StockExchangeService.class);
        Call<StockExchangeResponse> callSync = service.getStockExchange();

        try {
            Response<StockExchangeResponse> response = callSync.execute();
            Map<String, StockExchange> stockExchangeResponse = response.body();
            assert stockExchangeResponse != null;
            stockExchangeResponse.forEach((k, v)->{
                    System.out.printf(stockExchangePrinter, k);
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */
        StockCurrencyService service = retrofit.create(StockCurrencyService.class);
        Call<StockCurrencyResponse> callSync = service.getStockCurrency();

        try {
            Response<StockCurrencyResponse> response = callSync.execute();
            StockCurrencyResponse stockCurrencyResponse = response.body();
            assert stockCurrencyResponse != null;
            stockCurrencyResponse.getData().forEach((k, v)->{
                System.out.printf(stockCurrencyPrinter, k, v);
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
