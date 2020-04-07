package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(QuizMcqQuestionId.class)
public class QuizMcqQuestions implements Serializable {

	@Id
	private int mcqQuestionId;

	@Id
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "quizMcqQuestionId", nullable=false)
	private Quiz quiz;

	@Column(nullable=false)
	private String sectionName;

	@Column(nullable=false)
	private int questionNo;

	@Column(nullable=false)
	private String question;

	@Column(nullable=false)
	private String optionA;

	@Column(nullable=false)
	private String optionB;

	@Column(nullable=false)
	private String optionC;

	@Column(nullable=false)
	private String optionD;

	@Column(nullable=false)
	private String correctAns;

	@Column(nullable=false)
	private Date creationDate;

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public QuizMcqQuestions() {

	}

	public QuizMcqQuestions( int mcqQuestionId, String sectionName, int questionNo, String question, String optionA, String optionB, String optionC, String optionD, String correctAns, Date creationDate ) {
		this.mcqQuestionId = mcqQuestionId;
		this.sectionName = sectionName;
		this.questionNo = questionNo;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctAns = correctAns;
		this.creationDate = creationDate;
	}
	
	public int getMcqQuestionId() {
		return mcqQuestionId;
	}

	public void setMcqQuestionId(int mcqQuestionId) {
		this.mcqQuestionId = mcqQuestionId;
	}

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
