package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.QuizMcqQuestionId;
import com.moodle.moodledataSQL.models.QuizMcqQuestions;

public interface QuizMcqQuestionsRepository extends CrudRepository<QuizMcqQuestions, QuizMcqQuestionId> {

}
