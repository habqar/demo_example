package com.itv.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageMetrics {
    private long nbrTags;
    private long nbrImgs;
    private long sizeText;
    private long sizeHTML;
    private long titleLength;
    private long descriptionLength;
    private long titleH1Length;
    private long nbrH1;
    private long nbrH2;
    private long nbrH3;
    private long nbrH4;
    private long nbrJS;
    private long nbrCSS;
    private long nbrExternalCalls;
    private long nbrTokens;
}
