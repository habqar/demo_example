package com.itv.demo.core.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface ScrapePageService {
    long scrapeNbrImgs(Document page);
    long scrapeNbrTags(Document page);
    long scrapeNbrH1(Document page);
    long scrapeNbrH2(Document page);
    long scrapeNbrH3(Document page);
    long scrapeNbrH4(Document page);
    long scrapeNbrJs(Document page);
    long scrapeNbrCSS(Document page);
    long scrapeNbrExetrnalCalls(Document page);
    long scrapeNbrTokens(Document page);
    long scrapeSizeHTML(Document page);
    long scrapeSizzeText(Document page);
}
