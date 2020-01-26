package com.prieto.model.response;

import com.prieto.model.StockCurrency;

public class StockCurrencyResponse {

    String symbolsReturned;
    String base;
    StockCurrency data;

    public String getSymbolsReturned() {
        return symbolsReturned;
    }

    public void setSymbolsReturned(String symbolsReturned) {
        this.symbolsReturned = symbolsReturned;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public StockCurrency getData() {
        return data;
    }

    public void setData(StockCurrency data) {
        this.data = data;
    }
}
