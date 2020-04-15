package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.SubjectInstructors;
import com.moodle.moodledataSQL.models.SubjectInstructorsId;

public interface SubjectInstructorsRepository extends CrudRepository<SubjectInstructors, SubjectInstructorsId> {

}
