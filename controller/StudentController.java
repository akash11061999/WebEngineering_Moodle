package com.moodle.moodledataSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moodle.moodledataSQL.models.LoginCredentials;
import com.moodle.moodledataSQL.models.Student;
import com.moodle.moodledataSQL.repositories.LoginCredentialsRepository;
import com.moodle.moodledataSQL.repositories.StudentRepository;

@RestController
@RequestMapping(path="/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private LoginCredentialsRepository lcr; 

	@PostMapping(path="/add")
	public @ResponseBody String addUser(@RequestBody Student student) {
		System.out.println("Inside Student Controller");
		studentRepository.save(student);
		lcr.save(new LoginCredentials(student, "abc123") );
		return "Student Created Successfully";
	}
	
	@GetMapping(path="/findAll")
	public @ResponseBody List<Student> findAll(){
		System.out.println("Inside Student Controller");
		return (List<Student>) studentRepository.findAll();
	}

}
