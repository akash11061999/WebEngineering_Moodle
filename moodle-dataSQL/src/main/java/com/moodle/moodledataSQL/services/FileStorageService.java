package com.moodle.moodledataSQL.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.moodle.moodledataSQL.exception.FileNotFoundException;
import com.moodle.moodledataSQL.exception.FileStorageException;
import com.moodle.moodledataSQL.models.FileStorage;
import com.moodle.moodledataSQL.repositories.FileStorageRepository;

@Service
public class FileStorageService {

	@Autowired
	private FileStorageRepository fileStorageRepository; 

	public FileStorage storeFile(MultipartFile file) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			FileStorage dbFile = new FileStorage(fileName, file.getContentType(), file.getBytes());

			return fileStorageRepository.save(dbFile);
		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	public FileStorage getFile(String fileId) {
		return fileStorageRepository.findById(fileId).orElseThrow(() -> new FileNotFoundException("File not found with id " + fileId));
	}
}
