package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.AssignmentSubmission;
import com.moodle.moodledataSQL.models.AssignmentSubmissionId;

public interface AssignmentSubmissionRepository extends CrudRepository<AssignmentSubmission, AssignmentSubmissionId> {

}
