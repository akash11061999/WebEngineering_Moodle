package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.Resource;

public interface ResourceRepository extends CrudRepository<Resource, String> {

}
