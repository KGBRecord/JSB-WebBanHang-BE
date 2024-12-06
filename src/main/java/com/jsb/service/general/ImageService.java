package com.jsb.service.general;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.jsb.dto.general.UploadedImageResponse;

public interface ImageService {

    UploadedImageResponse store(MultipartFile image);

    Resource load(String imageName);

    void delete(String imageName);

}
