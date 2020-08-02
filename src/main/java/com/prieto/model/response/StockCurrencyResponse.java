package com.prieto.model.response;

import com.prieto.model.StockCurrency;

import java.util.List;

public class StockCurrencyResponse {

    private List<StockCurrency> data;

    public List<StockCurrency> getData() {
        return data;
    }

    public void setData(List<StockCurrency> data) {
        this.data = data;
    }
}
