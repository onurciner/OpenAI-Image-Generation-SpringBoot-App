package com.onurciner.imagegeneration.dto;

import lombok.Data;

@Data
public class ImageDto {
    private String url; // OpenAI tarafından sonuc olarak gonderilecek url bilgisi.
                        // bu url sayesinde gorsele ulasacagiz.
}