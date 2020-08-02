package com.prieto.model.response;

import com.prieto.model.StockExchange;

import java.util.HashMap;
import java.util.List;

public class StockExchangeResponse {

    private List<StockExchange> data;

    public List<StockExchange> getStockExchanges() {
        return data;
    }

    public void setStockExchanges(List<StockExchange> data) {
        this.data = data;
    }
}
