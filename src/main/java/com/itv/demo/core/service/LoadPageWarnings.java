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
public class LoadPageWarnings {

     void buildPageWarnings(PageValue pageValue){
        List<PageWarning> pageWarnings = new ArrayList<>();
        log.info("Inspecting Page warnings ...");
        if (pageValue.getPageMetrics().getDescriptionLength()>125){
            pageWarnings.add(new PageWarning(Warning.DESCRIPTION_LARGE,null));
        }
        if (pageValue.getPageMetrics().getTitleLength()>65)
            pageWarnings.add(new PageWarning(Warning.TITLE_LARGE,null));
        if (pageValue.getPageMetrics().getNbrTags()>700)
            pageWarnings.add(new PageWarning(Warning.DOM_TO_LARGE,null));

        if (pageValue.getPageMetrics().getNbrExternalCalls()>20)
            pageWarnings.add(new PageWarning(Warning.EXCESSED_RESSOURCES_CALL,null));

        pageValue.setPageWarnings(pageWarnings);
    }
}
