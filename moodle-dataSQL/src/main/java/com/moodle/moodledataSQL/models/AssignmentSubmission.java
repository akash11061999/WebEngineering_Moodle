package com.moodle.moodledataSQL.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class AssignmentSubmission implements Serializable {
	
	//or both these together as primary key
	
	@Id
	String assignment_id;
	
	@Column(nullable=false)
	String enrollmentNumber;
	
	public String getAssignment_id() {
		return assignment_id;
	}

	public void setAssignment_id(String assignment_id) {
		this.assignment_id = assignment_id;
	}

	@Column(nullable=false)  //foreign key
	String submissionLink;

//	public String getAssignment_id() {
//		return assignment_id;
//	}
//
//	public void setAssignment_id(String assignment_id) {
//		this.assignment_id = assignment_id;
//	}

	

//	public int getAssignmentId() {
//		return assignmentId;
//	}
//
//	public void setAssignmentId(int assignmentId) {
//		this.assignmentId = assignmentId;
//	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getSubmissionLink() {
		return submissionLink;
	}

	public void setSubmissionLink(String submissionLink) {
		this.submissionLink = submissionLink;
	}
	
	

}
