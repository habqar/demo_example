package com.itv.demo.core.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class LoadPageMetricsTest {

    @Autowired
    private LoadPageMetrics loadPageMetrics;

    @Test
    public void loadPageMetricsNullTest() {
        log.info("Testing if the loadPageMetrics Bean");
        Assert.assertNotNull(loadPageMetrics);
    }

    @Test
    public void setLoadPageMetrics(){
        Assert.assertNotNull(loadPageMetrics.loadPageMetrics("https://itvalue-consulting.com"));
    }
}
