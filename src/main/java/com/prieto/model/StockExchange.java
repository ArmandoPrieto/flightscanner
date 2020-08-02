package com.prieto.model;

public class StockExchange {

    private String name;
    private String acronym;
    private String mic;
    private String country;
    private String countryCode;
    private String city;
    private String website;
    private StockTimezone timeZone;
    private StockCurrency currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getMic() {
        return mic;
    }

    public void setMic(String mic) {
        this.mic = mic;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public StockTimezone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(StockTimezone timeZone) {
        this.timeZone = timeZone;
    }

    public StockCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(StockCurrency currency) {
        this.currency = currency;
    }
}
