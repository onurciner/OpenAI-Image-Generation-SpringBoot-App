package com.onurciner.imagegeneration.dto;

import lombok.Data;

@Data
public class ImageRequestDto {
    private String prompt;
    private String size;
    private int n;
}