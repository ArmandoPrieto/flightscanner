package com.prieto;

import com.prieto.model.StockIndex;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.RxStreamingHttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import io.netty.handler.timeout.TimeoutException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;


import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class StockHistoryControllerTest {

    @Inject
    EmbeddedServer embeddedServer;

    private static final Logger LOGGER = LoggerFactory.getLogger(StockIndex.class);

    @Test
    public void testIndex() throws Exception {
        try(RxHttpClient client = embeddedServer.getApplicationContext().createBean(RxHttpClient.class, embeddedServer.getURL())) {
            assertEquals(HttpStatus.OK, client.toBlocking().exchange("/stockHistory").status());
        }
    }

    @Test
    public void testFindAllStream() throws MalformedURLException, TimeoutException, InterruptedException {
        try(RxStreamingHttpClient client = embeddedServer.getApplicationContext()
                .createBean(RxStreamingHttpClient.class, embeddedServer.getURL())) {
            client.jsonStream(HttpRequest.GET("/stockHistory"), StockIndex.class)
                    .subscribe(stockIndex -> LOGGER.info("Json element: {}", stockIndex.getSymbol()),
                            error -> LOGGER.info("error consuming item {}", error));
            LOGGER.info("here is a log");
            Thread.sleep(10000);
            LOGGER.info("finish");
        }
    }
}
