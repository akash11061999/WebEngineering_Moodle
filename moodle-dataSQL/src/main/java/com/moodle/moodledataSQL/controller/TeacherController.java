package com.moodle.moodledataSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moodle.moodledataSQL.models.Teacher;
import com.moodle.moodledataSQL.repositories.TeacherRepository;

@RestController
@RequestMapping(path="/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addTeacher(@RequestBody Teacher teacher) {
		System.out.println("Inside Teacher Controller");
		teacherRepository.save(teacher);
		return "Teacher Added Successfully";
	}
	
	@GetMapping(path="/findAll")
	public @ResponseBody List<Teacher> findAll() {
		System.out.println("Inside Teacher Controller");
		return (List<Teacher>) teacherRepository.findAll();
	}

}
