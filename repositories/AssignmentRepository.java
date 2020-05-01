package com.moodle.moodledataSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, String> {

}
