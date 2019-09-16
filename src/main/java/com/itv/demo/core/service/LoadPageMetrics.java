package com.itv.demo.core.service;

import com.itv.demo.entity.PageMetrics;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoadPageMetrics {
    private final ScrapePageService scrapePageService;

    private Document getPageSource(String url){
        try {
            log.info("Scrapping source of Page ["+url+"]");
            return Jsoup.connect(url)
                        .followRedirects(true)
                        .get();
        } catch (IOException e) {
            log.error("Cannot get source from page : ["+url+"] - Error :" + e.getMessage() );
            return null;
        }
    }
    PageMetrics loadPageMetrics(String url){
        Document page = getPageSource(url);
        log.info("Load Metrics for Page ["+url+"] ..");
        return PageMetrics.builder()
                .titleLength(scrapePageService.scrapeTitleLength(page))
                .descriptionLength(scrapePageService.scrapeDescriptionLength(page))
                .titleH1Length(scrapePageService.scrapeH1titleLength(page))
                .nbrH1(scrapePageService.scrapeNbrH1(page))
                .nbrH2(scrapePageService.scrapeNbrH2(page))
                .nbrH3(scrapePageService.scrapeNbrH3(page))
                .nbrH4(scrapePageService.scrapeNbrH4(page))
                .nbrCSS(scrapePageService.scrapeNbrCSS(page))
                .nbrExternalCalls(scrapePageService.scrapeNbrExetrnalCalls(page))
                .nbrJS(scrapePageService.scrapeNbrJs(page))
                .nbrTags(scrapePageService.scrapeNbrTags(page))
                .nbrImgs(scrapePageService.scrapeNbrImgs(page))
                .build();
    }
}
