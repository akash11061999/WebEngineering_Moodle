package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Quiz implements Serializable {
	@Id
	String quizId;

	@Column(nullable=false)
	String name;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "quizSubjectId",nullable=false)
	public Subject subject;
	
	@Column(nullable=false)
	String password;
	
	@Column(nullable=false)
	String batch;
	
	@Column(nullable=false)
	Time startTime;
	
	@Column(nullable=false)
	Time endTime;
	
	@Column(nullable=false)
	Time duration;
	
	@Column(nullable=false)
	Date scheduledDate;
	
	@Column(nullable=false)
	Date creationDate;
	
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizMcqQuestions> quizMcqQuestions;
	
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizCodingQuestions> quizCodingQuestions;
	
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizSubmissions> quizSubmissions;
	
	public Quiz() {
		
	}
	
	public Quiz(String quizId, String name, String password, String batch, Time startTime, Time endTime, Time duration, Date scheduledDate, Date creationDate) {
		this.quizId = quizId;
		this.name = name;
		this.password = password;
		this.batch = batch;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.scheduledDate = scheduledDate;
		this.creationDate = creationDate;
	}
	
	public String getQuizId() {
		return quizId;
	}

	public void setQuizId(String quizId) {
		this.quizId = quizId;
	}

	public Set<QuizMcqQuestions> getQuizMcqQuestions() {
		return quizMcqQuestions;
	}

	public void setQuizMcqQuestions(Set<QuizMcqQuestions> quizMcqQuestions) {
		this.quizMcqQuestions = quizMcqQuestions;
	}

	public Set<QuizCodingQuestions> getQuizCodingQuestions() {
		return quizCodingQuestions;
	}

	public void setQuizCodingQuestions(Set<QuizCodingQuestions> quizCodingQuestions) {
		this.quizCodingQuestions = quizCodingQuestions;
	}

	public Set<QuizSubmissions> getQuizSubmissions() {
		return quizSubmissions;
	}

	public void setQuizSubmissions(Set<QuizSubmissions> quizSubmissions) {
		this.quizSubmissions = quizSubmissions;
	}

	public String getName() {
		return name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public Date getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
