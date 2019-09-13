package com.itv.demo.core.service;

import com.itv.demo.entity.PageValue;
import com.itv.demo.entity.PageWarning;
import com.itv.demo.entity.Warning;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnalysisPage {

    private final LoadPageMetrics loadPageMetrics;
    private final LoadPageWarnings loadPageWarnings;

    public PageValue analysePage(String url){
        log.info("Starting analysing Page ...");
        PageValue pageValue = new PageValue(url);

        log.info("Setting Page Metrics");
        pageValue.setPageMetrics(loadPageMetrics.loadPageMetrics(url));

        log.info("Setting Page Warnings");
        loadPageWarnings.buildPageWarnings(pageValue);
        log.info("Analysing Page is finished");
        return pageValue;
    }

}
