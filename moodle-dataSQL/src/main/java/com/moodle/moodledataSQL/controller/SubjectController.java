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

import com.moodle.moodledataSQL.models.Subject;
import com.moodle.moodledataSQL.service.SubjectRepository;

@Controller
@RequestMapping(path="/subject")
public class SubjectController {
	
	@Autowired
	private SubjectRepository subjectRepository;
		
	//create 
	@PostMapping(path="/add")
	public @ResponseBody String addSubject(@RequestBody Subject subject) {
		System.out.println("Inside Subject Controller");
		subjectRepository.save(subject);
		return "Subject added Successfully";
	}
	
	//read
	@GetMapping(path="/add")
	public Set<Subject> getAllSubjects(){
		return (Set<Subject>) subjectRepository.findAll();
	}
	
	@GetMapping(path="/add/{subjectId}")
	Subject getSubjectById(@PathVariable String subjectId) {
		return subjectRepository.findById(subjectId).get();
	}
	
	//update
	@PutMapping(path="/add/{subjectId}")
	Subject updateSubject(@RequestBody Subject newSubject, @PathVariable String subjectId) {
		 
        return subjectRepository.findById(subjectId).map(Subject -> {
            Subject.setSubjectId(newSubject.getSubjectId());
        	Subject.setName(newSubject.getName());
            Subject.setDescription(newSubject.getDescription());
            Subject.setIntendedYear(newSubject.getIntendedYear());
            Subject.setIntendedSemester(newSubject.getIntendedSemester());
            
            return subjectRepository.save(Subject);
        }).orElseGet(() -> {
            newSubject.setSubjectId(subjectId);
            return subjectRepository.save(newSubject);
        });
    }
	
	//delete
	@DeleteMapping(path="/add/{subjectId}")
    void deleteSubject(@PathVariable String subjectId) {
        subjectRepository.deleteById(subjectId);
    }


}
