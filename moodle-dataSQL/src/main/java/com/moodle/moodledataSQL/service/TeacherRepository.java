package com.moodle.moodledataSQL.service;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, String> {

}
