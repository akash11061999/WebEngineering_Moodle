package com.moodle.moodledataSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MoodleDataSqlApplication {

	public static void main(String[] args)   {
		SpringApplication.run(MoodleDataSqlApplication.class, args);
		System.out.println("Application started...........");
		
	}

}
