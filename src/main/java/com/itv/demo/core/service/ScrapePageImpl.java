package com.itv.demo.core.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class ScrapePageImpl implements ScrapePageService {
   
    @Override
    public long scrapeNbrImgs(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrTags(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrH1(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrH2(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrH3(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrH4(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrJs(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrCSS(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrExetrnalCalls(Document page) {
        return 0;
    }

    @Override
    public long scrapeNbrTokens(Document page) {
        return 0;
    }

    @Override
    public long scrapeSizeHTML(Document page) {
        return 0;
    }

    @Override
    public long scrapeSizzeText(Document page) {
        return 0;
    }
}
