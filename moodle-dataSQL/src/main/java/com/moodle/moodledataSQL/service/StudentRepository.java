package com.moodle.moodledataSQL.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Student;

public interface StudentRepository extends CrudRepository<Student, String> {
	
	Set<Student> findByDepartmentId(String DepartmentId);
	Optional<Student> findByIdAndDepartmentId(String enrollmentNumber, String DepartmentId);

}
