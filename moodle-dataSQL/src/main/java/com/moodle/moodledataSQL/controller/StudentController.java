package com.moodle.moodledataSQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moodle.moodledataSQL.models.Student;
import com.moodle.moodledataSQL.service.StudentRepository;

@Controller
@RequestMapping(path="/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping(path="/create")
	public @ResponseBody String addUser(@RequestBody Student student) {
		System.out.println("Inside Student Controller");
		studentRepository.save(student);
		return "Student Created Successfully";
	}

}
