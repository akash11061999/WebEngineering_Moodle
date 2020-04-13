package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.QuizCodingQuestionId;
import com.moodle.moodledataSQL.models.QuizCodingQuestions;

public interface QuizCodingQuestionsRepository extends CrudRepository<QuizCodingQuestions, QuizCodingQuestionId> {

}
