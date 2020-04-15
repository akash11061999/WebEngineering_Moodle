package com.moodle.moodledataSQL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moodle.moodledataSQL.models.LoginCredentials;

public interface LoginCredentialsRepository extends CrudRepository<LoginCredentials, String> {

}
