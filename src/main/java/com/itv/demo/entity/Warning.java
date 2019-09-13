package com.itv.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Warning {

    DOM_TO_LARGE("your DOM elements is too large. The page should not exceed 700 elements",8),
    EXCESSED_RESSOURCES_CALL("The external resources should not be more than 20", 6),
    TITLE_LARGE("The meta title is long.",10),
    DESCRIPTION_LARGE("The meta description is long.",10);

    private String message;
    private int severity;

}
