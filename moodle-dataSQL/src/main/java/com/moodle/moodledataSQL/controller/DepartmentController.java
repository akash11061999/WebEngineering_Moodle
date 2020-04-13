package com.moodle.moodledataSQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moodle.moodledataSQL.models.Department;
import com.moodle.moodledataSQL.service.DepartmentRepository;

@Controller
@RequestMapping(path="/department")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addUser(@RequestBody Department department) {
		System.out.println("Inside Department Controller");
		departmentRepository.save(department);
		return "Department Added Successfully";
	}

}


