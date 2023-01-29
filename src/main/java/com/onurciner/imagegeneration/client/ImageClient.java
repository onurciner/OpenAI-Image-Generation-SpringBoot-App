package com.onurciner.imagegeneration.client;

import com.onurciner.imagegeneration.config.ImageGeneratorConfig;
import com.onurciner.imagegeneration.dto.ImageRequestDto;
import com.onurciner.imagegeneration.dto.ImageResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "imageGenerator", url = "${openai.image.url}", configuration = ImageGeneratorConfig.class)
public interface ImageClient {
    @PostMapping(value = "/v1/images/generations")
    ImageResponseDto generateImage(@RequestBody final ImageRequestDto request);
}