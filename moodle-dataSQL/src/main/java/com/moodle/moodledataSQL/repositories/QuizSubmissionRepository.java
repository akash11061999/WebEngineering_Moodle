package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.QuizSubmissions;
import com.moodle.moodledataSQL.models.QuizSubmissionsId;

public interface QuizSubmissionRepository extends CrudRepository<QuizSubmissions, QuizSubmissionsId> {

}
