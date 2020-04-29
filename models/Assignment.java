package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Assignment implements Serializable {
	
	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(updatable = false)
	private String assignmentId;
	
	@Column(nullable=false, unique = true)
	private String assignmentName;
	
	private String fileType;
	
	@Lob
    private byte[] data;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "subjectId", nullable = false)  
	private Subject subject;

	@Column(nullable=false)  
	private String batch;
	
	@Column(nullable=false)
	private String resourceLink;
	
	@Column(nullable=false)     
	private Date submissionDeadline;

	@Column(nullable=false)
	private boolean isActive;
	
	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;
	
	@OneToMany(mappedBy = "assignment", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<AssignmentSubmission> assignmentSubmission;
	
	public Assignment() {
		
	}
	
	public Assignment(String fileType, byte[] data, String assignmentId, String assignmentName, String batch, String resourceLink, Date submissionDeadline, boolean isActive) {
		this.assignmentId = assignmentId;
		this.assignmentName = assignmentName;
		this.batch = batch;
		this.resourceLink = resourceLink;
		this.submissionDeadline = submissionDeadline;
		this.isActive = isActive;
		this.fileType = fileType;
		this.data = data;
	}
	
	public Assignment(String fileType, byte[] data) {
        this.fileType = fileType;
        this.data = data;
    }
	
	public String getAssignmentId() {
		return assignmentId;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public void setAssignmentId(String assignmentId) {
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

	public Set<AssignmentSubmission> getAssignmentSubmission() {
		return assignmentSubmission;
	}

	public void setAssignmentSubmission(Set<AssignmentSubmission> assignmentSubmission) {
		this.assignmentSubmission = assignmentSubmission;
	}

}
