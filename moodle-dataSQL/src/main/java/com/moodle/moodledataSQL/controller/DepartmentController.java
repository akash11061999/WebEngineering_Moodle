package com.moodle.moodledataSQL.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
//	@PostMapping(path="/add")
//	public @ResponseBody String addUser(@RequestBody Department department) {
//		System.out.println("Inside Department Controller");
//		departmentRepository.save(department);
//		return "Department Added Successfully";
//	}
	
    //create 
	@PostMapping(path="/add")
	public @ResponseBody String addDepartment(@RequestBody Department department) {
		System.out.println("Inside Department Controller");
		departmentRepository.save(department);
		return "Department added Successfully";
	}
	
	//read
	@GetMapping(path="/add")
	public Set<Department> getAllDepartments(){
		return (Set<Department>) departmentRepository.findAll();
	}
	
	@GetMapping(path="/add/{departmentId}")
	Department getDepartmentById(@PathVariable String departmentId) {
		return departmentRepository.findById(departmentId).get();
	}
	
	//update
	@PutMapping(path="/add/{departmentId}")
	Department updateDepartment(@RequestBody Department newDepartment, @PathVariable String departmentId) {
		 
        return departmentRepository.findById(departmentId).map(Department -> {
            Department.setDepartmentId(newDepartment.getDepartmentId());
            Department.setDepartmentName(newDepartment.getDepartmentName());
            
            return departmentRepository.save(Department);
        }).orElseGet(() -> {
            newDepartment.setDepartmentId(departmentId);
            return departmentRepository.save(newDepartment);
        });
    }
	
	//delete
	@DeleteMapping(path="/add/{departmentId}")
    void deleteDepartment(@PathVariable String departmentId) {
        departmentRepository.deleteById(departmentId);
    }


}


