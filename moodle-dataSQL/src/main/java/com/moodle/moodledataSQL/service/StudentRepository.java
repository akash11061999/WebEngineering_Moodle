package com.moodle.moodledataSQL.service;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

}
