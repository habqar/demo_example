package com.itv.demo.core.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

@Component
public interface ScrapePageService {
    int scrapeNbrImgs(Document page);
    int scrapeNbrTags(Document page);
    int scrapeNbrH1(Document page);
    int scrapeNbrH2(Document page);
    int scrapeNbrH3(Document page);
    int scrapeNbrH4(Document page);
    int scrapeNbrJs(Document page);
    int scrapeNbrCSS(Document page);
    int scrapeNbrExetrnalCalls(Document page);
    int scrapeNbrTokens(Document page);
    int scrapeSizeHTML(Document page);
    int scrapeSizeText(Document page);
    int scrapeH1titleLength(Document page);
    int scrapeTitleLength(Document page);
    int scrapeDescriptionLength(Document page);
}
