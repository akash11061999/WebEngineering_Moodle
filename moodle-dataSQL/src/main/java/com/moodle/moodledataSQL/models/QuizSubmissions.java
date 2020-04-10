package com.moodle.moodledataSQL.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(QuizSubmissionsId.class)
public class QuizSubmissions extends Auditing implements Serializable {

	@Id
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "quizId",nullable=false) 
	private Quiz quiz;

	@Id
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "enrollmentNumber",nullable=false) 
	private Student student;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "subjectId",nullable=false) 
	private Subject subject;

	@Column(nullable = false)
	private String marksObtained;

	@Column(nullable = false)
	private String maxMarks;

	@Column(nullable = false)
	private String batch;

	public QuizSubmissions() {

	}

	public QuizSubmissions(String marksObtained, String maxMarks, String batch) {
		this.marksObtained = marksObtained;
		this.maxMarks = maxMarks;
		this.batch = batch;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(String marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
	
}
