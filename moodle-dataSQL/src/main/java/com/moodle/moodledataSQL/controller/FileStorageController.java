package com.moodle.moodledataSQL.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.moodle.moodledataSQL.models.FileStorage;
import com.moodle.moodledataSQL.services.FileStorageService;

@RestController
public class FileStorageController {
	
	@Autowired
	private FileStorageService fileStorageService;
	
	@PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        FileStorage fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
            .path("/downloadFile/")
            .path(fileName.getFileName())
            .toUriString();
        
        return "Success";
    }

    @PostMapping("/uploadMultipleFiles")
    public void uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        Arrays.asList(files).stream().map((file) -> uploadFile(file));
    }
    
    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity < Resource > downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        FileStorage databaseFile = fileStorageService.getFile(fileName);

        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType(databaseFile.getFileType()))
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + databaseFile.getFileName() + "\"")
            .body(new ByteArrayResource(databaseFile.getData()));
    }
}
