package com.itv.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageValue {

    private String id;
    private String link;
    private List<PageWarning> pageWarnings;
    private PageMetrics pageMetrics;

    public PageValue(String link) {
        this.link = link;
        this.id = hashCode()+"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageValue pageValue = (PageValue) o;
        return link.equals(pageValue.link) &&
                pageWarnings.equals(pageValue.pageWarnings) &&
                pageMetrics.equals(pageValue.pageMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link);
    }
}
