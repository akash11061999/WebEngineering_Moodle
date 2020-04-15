/**
 * 
 */
package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Resource implements Serializable {

	@Id
	@Column(updatable = false)
	private String resourceId;

	@Column(nullable=false, unique = true)
	private String resourceName;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "subjectId",nullable=false)    
	private Subject subject;

	@Column(nullable=false) 
	private String batch;

	@Column(nullable=false)
	private String resourceLink;
	
	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;

	public Resource() {

	}

	public Resource(String resourceId, String resourceName, String batch, String resourceLink) {
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.batch = batch;
		this.resourceLink = resourceLink;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
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

}
