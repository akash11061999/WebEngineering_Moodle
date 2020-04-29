package com.moodle.moodledataSQL.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.moodle.moodledataSQL.models.AssignmentSubmission;
import com.moodle.moodledataSQL.models.AssignmentSubmissionId;

import java.util.List; //change import settings

//import antlr.collections.List;


public interface AssignmentSubmissionRepository extends CrudRepository<AssignmentSubmission, AssignmentSubmissionId> {

	
//List<AssignmentSubmission> findBystudentIdAndassignmentId(String studentId, String assignmentId);
}




