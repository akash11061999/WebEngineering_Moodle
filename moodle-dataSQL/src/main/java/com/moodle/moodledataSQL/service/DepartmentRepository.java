package com.moodle.moodledataSQL.service;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Department;

public interface DepartmentRepository extends CrudRepository<Department, String>{

}
