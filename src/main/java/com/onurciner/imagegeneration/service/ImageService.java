package com.onurciner.imagegeneration.service;

import com.onurciner.imagegeneration.client.ImageClient;
import com.onurciner.imagegeneration.dto.ImageRequestDto;
import com.onurciner.imagegeneration.dto.ImageResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageClient imageClient;

    public ImageResponseDto generateImage(final ImageRequestDto request) {
        return imageClient.generateImage(request);
    }

}