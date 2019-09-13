package com.itv.demo.controler;

import com.itv.demo.core.service.AnalysisPage;
import com.itv.demo.entity.PageValue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PageValueControler {
    private final AnalysisPage analysisPage;

    @GetMapping("/analysePage")
    public PageValue analysePage(@RequestParam("url") String url){
        return analysisPage.analysePage(url);
    }
}
