package com.moodle.moodledataSQL.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.moodle.moodledataSQL.exception.FileNotFoundException;
import com.moodle.moodledataSQL.exception.AssignmentFileStorageException;
import com.moodle.moodledataSQL.models.AssignmentFileStorage;
import com.moodle.moodledataSQL.repositories.AssignmentFileStorageRepository;

@Service
public class AssignmentFileStorageService {

	@Autowired
	private AssignmentFileStorageRepository assignmentFileStorageRepository; 

	public AssignmentFileStorage storeFile(MultipartFile file) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new AssignmentFileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			AssignmentFileStorage dbFile = new AssignmentFileStorage(fileName, file.getContentType(), file.getBytes());
		//	AssignmentFileStorage dbFile = new AssignmentFileStorage(fileName, file.getContentType(), file.getBytes());
			return assignmentFileStorageRepository.save(dbFile);
		} catch (IOException ex) {
			throw new AssignmentFileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	public AssignmentFileStorage getFile(String fileId) {
		return assignmentFileStorageRepository.findById(fileId).orElseThrow(() -> new FileNotFoundException("File not found with id " + fileId));
	}
}
