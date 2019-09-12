package com.itv.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageWarning {
    private String message;
    private SEVERITY severity;

    private enum SEVERITY {LOW, MEDIUM, HIGH}
}
