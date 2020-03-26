package com.moodle.moodledataSQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moodle.moodledataSQL.models.Teacher;
import com.moodle.moodledataSQL.service.TeacherRepository;

@Controller
@RequestMapping(path="/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addUser(@RequestBody Teacher teacher) {
		System.out.println("Inside Teacher Controller");
		teacherRepository.save(teacher);
		return "Teacher Added Successfully";
	}

}
