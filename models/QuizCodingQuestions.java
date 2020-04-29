package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@IdClass(QuizCodingQuestionId.class)
public class QuizCodingQuestions implements Serializable{


	@Id
	@Column(updatable = false)
	private int codingQuestionId;

	@Id
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "quiz_CodingQuestionId", nullable=false)
	private Quiz quiz;


	@Column(nullable=false)
	private String sectionName;

	@Column(nullable=false)
	private int questionNo;

	@Column(nullable=false)
	private String question;

	@Column(nullable=false)
	private String inputFormat;

	@Column(nullable=false)
	private String outputFormat;

	@Column(nullable=false)
	private String constraints;

	@Column(nullable=false)
	private String inputTestCases;


	@Column(nullable=false)
	private String outputTestCases;

	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;

	public QuizCodingQuestions() {

	}
	
	public QuizCodingQuestions(int codingQuestionId, String sectionName, int questionNo, String question, String inputFormat, String outputFormat, String constraints, String inputTestCases, String outputTestCases){ 
		this.codingQuestionId = codingQuestionId;
		this.sectionName = sectionName;
		this.questionNo = questionNo;
		this.question = question;
		this.inputFormat = inputFormat;
		this.outputFormat = outputFormat;
		this.constraints = constraints;
		this.inputTestCases = inputTestCases;
		this.outputTestCases = outputTestCases;
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

	public String getSectionName() {
		return sectionName;
	}


	public int getCodingQuestionId() {
		return codingQuestionId;
	}

	public void setCodingQuestionId(int codingQuestionId) {
		this.codingQuestionId = codingQuestionId;
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

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Timestamp updationDate) {
		this.updationDate = updationDate;
	}

}
