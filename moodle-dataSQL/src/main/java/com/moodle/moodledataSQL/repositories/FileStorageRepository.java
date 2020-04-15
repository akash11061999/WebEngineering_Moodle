package com.moodle.moodledataSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moodle.moodledataSQL.models.FileStorage;

public interface FileStorageRepository extends JpaRepository<FileStorage, String> {
	
}
