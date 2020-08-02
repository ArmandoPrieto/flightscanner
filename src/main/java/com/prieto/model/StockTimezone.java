package com.prieto.model;

public class StockTimezone {

    private String timezone;
    private String abbr;
    private String abbr_dst;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr_dst() {
        return abbr_dst;
    }

    public void setAbbr_dst(String abbr_dst) {
        this.abbr_dst = abbr_dst;
    }
}
