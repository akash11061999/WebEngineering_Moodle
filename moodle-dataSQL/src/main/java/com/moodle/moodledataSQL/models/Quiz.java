package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Quiz implements Serializable {
	
	@Id
	@Column(updatable = false)
	private String quizId;

	@Column(nullable=false, unique = true)
	private String quizName;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "quizSubjectId", nullable = false)
	private Subject subject;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String batch;
	
	@Column(nullable=false)
	private Time startTime;
	
	@Column(nullable=false)
	private Time endTime;
	
	@Column(nullable=false)
	private Time duration;
	
	@Column(nullable=false)
	private Date scheduledDate;
	
	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;
	
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizMcqQuestions> quizMcqQuestions;
	
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizCodingQuestions> quizCodingQuestions;
	
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizSubmissions> quizSubmissions;
	
	public Quiz() {
		
	}
	
	public Quiz(String quizId, String name, String password, String batch, Time startTime, Time endTime, Time duration, Date scheduledDate) {
		this.quizId = quizId;
		this.quizName = name;
		this.password = password;
		this.batch = batch;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.scheduledDate = scheduledDate;
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
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
