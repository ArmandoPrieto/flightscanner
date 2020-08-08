package com.prieto;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("repository.api")
public class Repository {

    private String key;
    private String url;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
