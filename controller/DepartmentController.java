package com.moodle.moodledataSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moodle.moodledataSQL.models.Department;
import com.moodle.moodledataSQL.repositories.DepartmentRepository;

@RestController
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
	
	@GetMapping(path="/{id}")
	public @ResponseBody Department findDepartmentById(@PathVariable String id){
		System.out.println("Inside Department Controller");
		return departmentRepository.findByDepartmentId(id);
	}
	
	@GetMapping(path="/findAll")
	public @ResponseBody List<Department> findAll(){
		System.out.println("Inside Department Controller");
		return (List<Department>) departmentRepository.findAll();
	}

}


