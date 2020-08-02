package com.prieto;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class RepositoryTestConfiguration {

    @Test
    void testRepositoryConfiguration() {

        Map<String, Object> items = new HashMap<>();
        items.put("repository.api.key", "keyValue");
        items.put("repository.api.url", "urlValue");
        ApplicationContext ctx = ApplicationContext.run(ApplicationContext.class, items);
        Repository repository = ctx.getBean(Repository.class);

        assertEquals("keyValue", repository.getKey());
        assertEquals("urlValue", repository.getUrl());
        ctx.close();
    }
}

