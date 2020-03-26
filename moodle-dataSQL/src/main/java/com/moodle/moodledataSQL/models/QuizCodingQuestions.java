package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class QuizCodingQuestions implements Serializable{
	
	
	@Id
	int quizCodingQuestionId;
  
	// or both id+quiz  id will form composite primary key
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Quiz quiz;
	
	
	@Column(nullable=false)
	String sectionName;
	
	@Column(nullable=false)
	int questionNo;
	
	@Column(nullable=false)
	String question;
	
	@Column(nullable=false)
	String inputFormat;
	
	@Column(nullable=false)
	String outputFormat;
	
	@Column(nullable=false)
	String constraints;
	
	@Column(nullable=false)
	String inputTestCases;
	

	@Column(nullable=false)
	String outputTestCases;
	
	@Column(nullable=false)   // not a foreign key but will be fetched from quiz table
	  Date creationDate;

	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setQuizCodingQuestionId(int quizCodingQuestionId) {
		this.quizCodingQuestionId = quizCodingQuestionId;
	}
	
	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public String getConstraints() {
		return constraints;
	}

	public void setConstraints(String constraints) {
		this.constraints = constraints;
	}

	public int getQuizCodingQuestionId() {
		return quizCodingQuestionId;
	}


//	public int getQuizId() {
//		return quizId;
//	}
//
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


	public String getInputFormat() {
		return inputFormat;
	}


	public void setInputFormat(String inputFormat) {
		this.inputFormat = inputFormat;
	}


	public String getOutputFormat() {
		return outputFormat;
	}


	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}


	public String getConstraint() {
		return constraints;
	}


	public void setConstraint(String constraints) {
		this.constraints = constraints;
	}


	public String getInputTestCases() {
		return inputTestCases;
	}


	public void setInputTestCases(String inputTestCases) {
		this.inputTestCases = inputTestCases;
	}


	public String getOutputTestCases() {
		return outputTestCases;
	}


	public void setOutputTestCases(String outputTestCases) {
		this.outputTestCases = outputTestCases;
	}


	

	

}
