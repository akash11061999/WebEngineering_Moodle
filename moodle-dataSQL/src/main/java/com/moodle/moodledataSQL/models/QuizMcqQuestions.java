package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class QuizMcqQuestions implements Serializable {
	
	@Id
	int quizMcqQuestionId;
  
	// or both id+quiz  id will form composite primary key
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Quiz quiz;
	
	
	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@Column(nullable=false)
	String sectionName;
	
	@Column(nullable=false)
	int questionNo;
	
	@Column(nullable=false)
	String question;
	
	@Column(nullable=false)
	String optionA;
	
	@Column(nullable=false)
	String optionB;
	
	@Column(nullable=false)
	String optionC;
	
	@Column(nullable=false)
	String optionD;
	
	@Column(nullable=false)
	String correctAns;
	
	@Column(nullable=false)
	Date creationDate;

	public int getQuizMcqQuestionId() {
		return quizMcqQuestionId;
	}

	public void setQuizMcqQuestionId(int quizMcqQuestionId) {
		this.quizMcqQuestionId = quizMcqQuestionId;
	}

//	public int getQuizId() {
//		return quizId;
//	}
//
//	public void setQuizId(int quizId) {
//		this.quizId = quizId;
//	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
	


}
