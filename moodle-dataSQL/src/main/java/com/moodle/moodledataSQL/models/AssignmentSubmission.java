package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Table
@Entity
@IdClass(AssignmentSubmissionId.class)
public class AssignmentSubmission implements Serializable {

	@Id
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "assignmentId",nullable=false) 
	private Assignment assignment;

	@Id
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "enrollmentNumber", nullable = false) 
	private Student student;

	@Column(nullable=false)
	private String submissionLink;

	@CreationTimestamp  
	private Timestamp creationDate;

	@UpdateTimestamp
	private Timestamp updationDate;

	public AssignmentSubmission() {

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

	public AssignmentSubmission(String submissionLink) {
		this.submissionLink = submissionLink;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getSubmissionLink() {
		return submissionLink;
	}

	public void setSubmissionLink(String submissionLink) {
		this.submissionLink = submissionLink;
	}

}
