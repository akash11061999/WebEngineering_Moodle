package com.moodle.moodledataSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moodle.moodledataSQL.models.AssignmentFileStorage;

public interface AssignmentFileStorageRepository extends JpaRepository<AssignmentFileStorage, String> {
	
}
