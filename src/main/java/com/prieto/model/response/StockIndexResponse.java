package com.prieto.model.response;

import com.prieto.model.StockIndex;

import java.util.List;

public class StockIndexResponse {

    String symbolsRequested;
    String symbolsReturned;
    List<StockIndex> data;

    public List<StockIndex> getData() {
        return data;
    }

    public void setData(List<StockIndex> data) {
        this.data = data;
    }

    public String getSymbolsRequested() {
        return symbolsRequested;
    }

    public void setSymbolsRequested(String symbolsRequested) {
        this.symbolsRequested = symbolsRequested;
    }

    public String getSymbolsReturned() {
        return symbolsReturned;
    }

    public void setSymbolsReturned(String symbolsReturned) {
        this.symbolsReturned = symbolsReturned;
    }


}
