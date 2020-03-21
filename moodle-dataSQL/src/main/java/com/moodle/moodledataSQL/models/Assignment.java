package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Assignment implements Serializable {
	
	@Id
	int assignmentId;
	
	@Column(nullable=false)
	String assignmentName;
	
//	@Column(nullable=false)  //foreign key
//	String subjectId;
//	
	@ManyToOne(cascade = CascadeType.ALL)
	public Subject subject;
	
	
	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	@Column(nullable=false)  // can be in 2 char,foreign key? or in(b1,b2,b3,b4)
	String batch;
	
	@Column(nullable=false)
	String resourceLink;
	
	@Column(nullable=false)     //its a date?
	Date submissionDeadline;

	@Column(nullable=false)  //boolean
	boolean isSubmitted;
	
	
	@Column(nullable=false)   //foreign key
	String creationDate;


	public int getAssignmentId() {
		return assignmentId;
	}


	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}


	public String getAssignmentName() {
		return assignmentName;
	}


	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}


//	public String getSubjectId() {
//		return subjectId;
//	}
//
//
//	public void setSubjectId(String subjectId) {
//		this.subjectId = subjectId;
//	}


	public String getBatch() {
		return batch;
	}


	public void setBatch(String batch) {
		this.batch = batch;
	}


	public String getResourceLink() {
		return resourceLink;
	}


	public void setResourceLink(String resourceLink) {
		this.resourceLink = resourceLink;
	}


	public Date getSubmissionDeadline() {
		return submissionDeadline;
	}


	public void setSubmissionDeadline(Date submissionDeadline) {
		this.submissionDeadline = submissionDeadline;
	}


	public boolean isSubmitted() {
		return isSubmitted;
	}


	public void setSubmitted(boolean isSubmitted) {
		this.isSubmitted = isSubmitted;
	}


	public String getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
