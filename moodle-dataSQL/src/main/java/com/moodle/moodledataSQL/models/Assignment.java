package com.moodle.moodledataSQL.models;

import java.io.Serializable;
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
public class Assignment implements Serializable {
	
	@Id
	private int assignmentId;
	
	@Column(nullable=false)
	private String assignmentName;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "assignmentSubjectId", nullable = false)  
	private Subject subject;

	@Column(nullable=false)  // can be in 2 char,foreign key? or in(b1,b2,b3,b4)
	private String batch;
	
	@Column(nullable=false)
	private String resourceLink;
	
	@Column(nullable=false)     //its a date?
	private Date submissionDeadline;

	@Column(nullable=false)  //boolean
	private boolean isActive;
	
	@Column(nullable=false)
	private Date creationDate;
	
	@OneToMany(mappedBy = "assignment", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<AssignmentSubmission> assignmentSubmission;
	
	public Assignment() {
		
	}
	
	public Assignment(int assignmentId, String assignmentName, String batch, String resourceLink, Date submissionDeadline, boolean isActive, Date creationDate) {
		this.assignmentId = assignmentId;
		this.assignmentName = assignmentName;
		this.batch = batch;
		this.resourceLink = resourceLink;
		this.submissionDeadline = submissionDeadline;
		this.isActive = isActive;
		this.creationDate = creationDate;
	}
	
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Set<AssignmentSubmission> getAssignmentSubmission() {
		return assignmentSubmission;
	}

	public void setAssignmentSubmission(Set<AssignmentSubmission> assignmentSubmission) {
		this.assignmentSubmission = assignmentSubmission;
	}

}
