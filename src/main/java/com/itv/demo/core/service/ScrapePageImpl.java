package com.itv.demo.core.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class ScrapePageImpl implements ScrapePageService {
   
    @Override
    public int scrapeNbrImgs(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrTags(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrH1(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrH2(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrH3(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrH4(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrJs(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrCSS(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrExetrnalCalls(Document page) {
        return 0;
    }

    @Override
    public int scrapeNbrTokens(Document page) {
        return 0;
    }

    @Override
    public int scrapeSizeHTML(Document page) {
        return 0;
    }

    @Override
    public int scrapeSizeText(Document page) {
        return 0;
    }

    @Override
    public int scrapeH1titleLength(Document page) {
        return 0;
    }

    @Override
    public int scrapeTitleLength(Document page) {
        return 0;
    }

    @Override
    public int scrapeDescriptionLength(Document page) {
        return 0;
    }
}
