/**
 * 
 */
package com.moodle.moodledataSQL.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resource implements Serializable {
	
	@Id
	String resourceId;  //String?
	
	@Column(nullable=false)
	String resourceName;
	
	@Column(nullable=false)  //foreign key
	String subjectId;
	
	@Column(nullable=false)  // can be in 2 char,foreign key? or in(b1,b2,b3,b4)
	String batch;
	
	@Column(nullable=false)
	String resourceLink;

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

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
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
	
	
	

}
