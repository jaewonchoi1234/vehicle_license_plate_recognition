package com.sparta.vehicle_license_plate_recognition.controller;

import com.sparta.vehicle_license_plate_recognition.dto.PostPictureResponseDto;
import com.sparta.vehicle_license_plate_recognition.service.PictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/picture")
@RequiredArgsConstructor
public class PictureController {

    private final PictureService pictureService;

    @PostMapping()
    public ResponseEntity<PostPictureResponseDto> recognitionPicture(@RequestBody MultipartFile file) {
        return new ResponseEntity<>(pictureService.recognitionPicure(), HttpStatus.OK);
    }


}
