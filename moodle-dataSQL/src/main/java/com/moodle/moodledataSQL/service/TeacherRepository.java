package com.moodle.moodledataSQL.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, String> {
	
	Set<Teacher> findByDepartmentId(String DepartmentId);
	Optional<Teacher> findByIdAndDepartmentId(String teacherId, String DepartmentId);

}
