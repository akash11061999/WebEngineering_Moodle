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

import com.moodle.moodledataSQL.models.Student;
import com.moodle.moodledataSQL.service.StudentRepository;

@Controller
@RequestMapping(path="/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//create 
	@PostMapping(path="/create")
	public @ResponseBody String addUser(@RequestBody Student student) {
		System.out.println("Inside Student Controller");
		studentRepository.save(student);
		return "Student Created Successfully";
	}
	
	//read
	@GetMapping(path="/create")
	public Set<Student> getAllStudents(){
		return (Set<Student>) studentRepository.findAll();
	}
	
	@GetMapping(path="/create/{enrollmentNumber}")
	Student getStudentById(@PathVariable String enrollmentNumber) {
		return studentRepository.findById(enrollmentNumber).get();
	}
	
	//update
	@PutMapping(path="/create/{enrollmentNumber}")
	Student updateStudent(@RequestBody Student newStudent, @PathVariable String enrollmentNumber) {
		 
        return studentRepository.findById(enrollmentNumber).map(Student -> {
            Student.setName(newStudent.getName());
            Student.setEmailId(newStudent.getEmailId());
            Student.setContactNo(newStudent.getContactNo());
            Student.setBranch(newStudent.getBranch());
            Student.setYear(newStudent.getYear());
            Student.setSemester(newStudent.getSemester());
            Student.setCourse(newStudent.getCourse());
            Student.setBatch(newStudent.getBatch());
            
            return studentRepository.save(Student);
        }).orElseGet(() -> {
            newStudent.setEnrollmentNumber(enrollmentNumber);
            return studentRepository.save(newStudent);
        });
    }
	
	//delete
	@DeleteMapping(path="/create/{enrollmentNumber}")
    void deleteStudent(@PathVariable String enrollmentNumber) {
        studentRepository.deleteById(enrollmentNumber);
    }

}
