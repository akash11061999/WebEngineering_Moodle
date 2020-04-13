package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {

}
