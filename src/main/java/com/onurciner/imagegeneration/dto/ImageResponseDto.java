package com.onurciner.imagegeneration.dto;

import lombok.Data;

import java.util.List;

@Data
public class ImageResponseDto {
    private List<ImageDto> data; // OpenAI response olarak birden fazla gorsel obje iceren bir list gonderecektir.
}