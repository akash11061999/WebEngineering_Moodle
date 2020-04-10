package com.moodle.moodledataSQL.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {
	
	Set<Subject> findByDepartmentId(String DepartmentId);
	Optional<Subject> findByIdAndDepartmentId(String subjectId, String DepartmentId);

}
