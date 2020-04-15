package com.moodle.moodledataSQL.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moodle.moodledataSQL.models.Subject;
import com.moodle.moodledataSQL.repositories.SubjectRepository;

@RestController
@RequestMapping(path="/subject")
public class SubjectController {
	
	@Autowired
	private SubjectRepository subjectRepository; 
	
	@PostMapping(path="/add")
	public @ResponseBody String addSubject(@RequestBody Subject subject) {
		System.out.println("Inside Subject Controller");
		subjectRepository.save(subject);
		return ("Subject saved successfully");
	}
	
	@GetMapping(path="/findAll")
	public List<Subject> findAll(){
		System.out.println("Inside Subject Controller");
		List<Subject> response = new ArrayList<>(); 
		Iterable<Subject> it = subjectRepository.findAll();
		it.forEach(item -> response.add(item));
		return response;
	}

}
