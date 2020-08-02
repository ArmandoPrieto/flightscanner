package com.prieto;

import com.prieto.model.StockExchange;
import com.prieto.model.response.StockCurrencyResponse;
import com.prieto.model.response.StockExchangeResponse;
import com.prieto.model.response.StockIndexResponse;
import com.prieto.service.StockCurrencyService;
import com.prieto.service.StockExchangeService;
import com.prieto.service.StockIndexService;
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
import java.util.Map;

@Singleton
public class Loader implements ApplicationEventListener<ServiceStartedEvent> {

    private static final Logger log = LoggerFactory.getLogger(Loader.class);
    private static final String stockIndexPrinter = "Symbol: %s, Exchange: %s \n";
    private static final String stockExchangePrinter = "Name: %s, Acronym %s \n";
    private static final String stockCurrencyPrinter = "Currency: %s, Name: %s\n";

    @Inject
    Retrofit retrofit;

    @Override
    @Async
    public void onApplicationEvent(ServiceStartedEvent event) {
        //LOADING StockIndex
        StockIndexService service = retrofit.create(StockIndexService.class);
        Call<StockIndexResponse> callSync = service.getStockIndex();

        try {
            Response<StockIndexResponse> response = callSync.execute();
            StockIndexResponse stockIndexResponse = response.body();
            stockIndexResponse.getData().forEach(stockIndex -> {
                System.out.printf(stockIndexPrinter, stockIndex.getSymbol(), stockIndex.getExchange());
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

       //LOADING StockExchange

        StockExchangeService service1 = retrofit.create(StockExchangeService.class);
        Call<StockExchangeResponse> callSync1 = service1.getStockExchange();

        try {
            Response<StockExchangeResponse> response1 = callSync1.execute();
            StockExchangeResponse stockExchangeResponse = response1.body();
            assert stockExchangeResponse != null;
            stockExchangeResponse.getStockExchanges().forEach( k -> {
                    System.out.printf(stockExchangePrinter, k.getName(), k.getAcronym());
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        StockCurrencyService service2 = retrofit.create(StockCurrencyService.class);
        Call<StockCurrencyResponse> callSync2 = service2.getStockCurrency();

        try {
            Response<StockCurrencyResponse> response2 = callSync2.execute();
            StockCurrencyResponse stockCurrencyResponse = response2.body();
            assert stockCurrencyResponse != null;
            stockCurrencyResponse.getData().forEach(k ->{
                System.out.printf(stockCurrencyPrinter, k.getCode(), k.getName());
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
