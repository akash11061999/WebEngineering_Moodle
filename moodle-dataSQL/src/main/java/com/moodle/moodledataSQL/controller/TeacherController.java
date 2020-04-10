package com.moodle.moodledataSQL.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
//	@PostMapping(path="/add")
//	public @ResponseBody String addUser(@RequestBody Teacher teacher) {
//		System.out.println("Inside Teacher Controller");
//		teacherRepository.save(teacher);
//		return "Teacher Added Successfully";
//	}
	
	//create 
	@PostMapping(path="/add")
	public @ResponseBody String addTeacher(@RequestBody Teacher teacher) {
		System.out.println("Inside Teacher Controller");
		teacherRepository.save(teacher);
		return "Teacher added Successfully";
	}
	
	//read
	@GetMapping(path="/add")
	public Set<Teacher> getAllTeachers(){
		return (Set<Teacher>) teacherRepository.findAll();
	}
	
	@GetMapping(path="/add/{teacherId}")
	Teacher getTeacherById(@PathVariable String teacherId) {
		return teacherRepository.findById(teacherId).get();
	}
	
	//update
	@PutMapping(path="/add/{teacherId}")
	Teacher updateTeacher(@RequestBody Teacher newTeacher, @PathVariable String teacherId) {
		 
        return teacherRepository.findById(teacherId).map(Teacher -> {
            Teacher.setTeacherId(newTeacher.getTeacherId());
        	Teacher.setName(newTeacher.getName());
            Teacher.setEmailId(newTeacher.getEmailId());
            Teacher.setContactNo(newTeacher.getContactNo());
            
            return teacherRepository.save(Teacher);
        }).orElseGet(() -> {
            newTeacher.setTeacherId(teacherId);
            return teacherRepository.save(newTeacher);
        });
    }
	
	//delete
	@DeleteMapping(path="/add/{teacherId}")
    void deleteTeacher(@PathVariable String teacherId) {
        teacherRepository.deleteById(teacherId);
    }


}
