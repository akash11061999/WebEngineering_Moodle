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

import com.moodle.moodledataSQL.models.Quiz;
import com.moodle.moodledataSQL.service.QuizRepository;

@Controller
@RequestMapping(path="/quiz")
public class QuizController {

	@Autowired
	private QuizRepository quizRepository;
		
    //create 
	@PostMapping(path="/add")
	public @ResponseBody String addQuiz(@RequestBody Quiz quiz) {
		System.out.println("Inside Quiz Controller");
		quizRepository.save(quiz);
		return "Quiz added Successfully";
	}
	
	//read
	@GetMapping(path="/add")
	public Set<Quiz> getAllQuizes(){
		return (Set<Quiz>) quizRepository.findAll();
	}
	
	@GetMapping(path="/add/{quizId}")
	Quiz getQuizById(@PathVariable String quizId) {
		return quizRepository.findById(quizId).get();
	}
	
	//update
	@PutMapping(path="/add/{quizId}")
	Quiz updateQuiz(@RequestBody Quiz newQuiz, @PathVariable String quizId) {
		 
        return quizRepository.findById(quizId).map(Quiz -> {
            Quiz.setQuizId(newQuiz.getQuizId());
            Quiz.setName(newQuiz.getName());
            Quiz.setPassword(newQuiz.getPassword());
            Quiz.setBatch(newQuiz.getBatch());
            Quiz.setStartTime(newQuiz.getStartTime());
            Quiz.setEndTime(newQuiz.getEndTime());
            Quiz.setDuration(newQuiz.getDuration());
            Quiz.setScheduledDate(newQuiz.getScheduledDate());
            Quiz.setCreationDate(newQuiz.getCreationDate());

            return quizRepository.save(Quiz);
        }).orElseGet(() -> {
            newQuiz.setQuizId(quizId);
            return quizRepository.save(newQuiz);
        });
    }
	
	//delete
	@DeleteMapping(path="/add/{quizId}")
    void deleteQuiz(@PathVariable String quizId) {
        quizRepository.deleteById(quizId);
    }


}


