package com.onurciner.imagegeneration.api;

import com.onurciner.imagegeneration.service.ImageService;
import com.onurciner.imagegeneration.dto.ImageRequestDto;
import com.onurciner.imagegeneration.dto.ImageResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class ImageGeneratorController {

    private final ImageService imageService;

    @PostMapping("generate")
    public ResponseEntity<ImageResponseDto> generateImage(@RequestBody final ImageRequestDto request) {
        return ResponseEntity.ok(imageService.generateImage(request));
    }

}