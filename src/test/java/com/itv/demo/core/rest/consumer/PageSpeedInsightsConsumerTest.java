package com.itv.demo.core.rest.consumer;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication
@RunWith(SpringRunner.class)
public class PageSpeedInsightsConsumerTest {

    @Autowired
    private PageSpeedInsightsConsumer pageSpeedInsightsConsumer;

    @Test
    @Ignore
    public void consumrPagSpeedInsight() {
        System.out.println(pageSpeedInsightsConsumer.consumrPagSpeedInsight("https://www.avito.ma/"));
    }
}
