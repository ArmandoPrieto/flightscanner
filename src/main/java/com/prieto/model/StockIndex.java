package com.prieto.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StockIndex {

    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double volume;
    private Double adjOpen;
    private Double adjHigh;
    private Double adjLow;
    private Double adjClose;
    private Double adjVolume;
    private String symbol;
    private String exchange;
    private String date;

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getAdjOpen() {
        return adjOpen;
    }

    public void setAdjOpen(Double adjOpen) {
        this.adjOpen = adjOpen;
    }

    public Double getAdjHigh() {
        return adjHigh;
    }

    public void setAdjHigh(Double adjHigh) {
        this.adjHigh = adjHigh;
    }

    public Double getAdjLow() {
        return adjLow;
    }

    public void setAdjLow(Double adjLow) {
        this.adjLow = adjLow;
    }

    public Double getAdjClose() {
        return adjClose;
    }

    public void setAdjClose(Double adjClose) {
        this.adjClose = adjClose;
    }

    public Double getAdjVolume() {
        return adjVolume;
    }

    public void setAdjVolume(Double adjVolume) {
        this.adjVolume = adjVolume;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public LocalDateTime getDate() {
        return LocalDateTime.parse(date, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public void setDate(String date) {
        this.date = date;
    }
}
