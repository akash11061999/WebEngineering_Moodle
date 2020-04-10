package com.moodle.moodledataSQL.service;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, String>{

}
