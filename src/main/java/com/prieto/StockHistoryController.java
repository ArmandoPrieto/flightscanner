package com.prieto;

import com.prieto.model.StockCurrency;
import com.prieto.model.StockIndex;
import com.prieto.model.response.StockIndexResponse;
import com.prieto.service.StockIndexService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.reactivex.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


@Controller("/")
public class StockHistoryController {

    @Inject
    Retrofit retrofit;

    @Inject
    Repository repository;

    private static final Logger LOGGER = LoggerFactory.getLogger(StockHistoryController.class);

    @Get(value = "/stockHistory")
    public Flowable<StockCurrency> index() {
       List<StockCurrency> currencyList = new ArrayList<>();
       currencyList.add(new StockCurrency("stock1","STC1","stock1"));
       currencyList.add(new StockCurrency("stock2","STC2","stock2"));
       currencyList.add(new StockCurrency("stock3","STC3","stock3"));
       return Flowable.fromIterable(currencyList).delay(3,TimeUnit.SECONDS);

    }


}