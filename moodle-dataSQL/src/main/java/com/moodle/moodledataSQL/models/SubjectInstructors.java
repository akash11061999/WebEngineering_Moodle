package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@IdClass(SubjectInstructorsId.class)
public class SubjectInstructors implements Serializable {
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subjectId", nullable = false)
	private Subject subject;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teacherId", nullable = false)
	private Teacher teacher;
	
	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;
	
	public SubjectInstructors() {
		
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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
