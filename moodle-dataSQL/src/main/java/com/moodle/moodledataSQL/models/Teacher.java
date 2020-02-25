package com.moodle.moodledataSQL.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Teacher {
	
	@Id
	String teacherId;

	@Column(nullable=false)
	String name;
	
	String emailID;
	String contactNo;
	
	@Column(nullable=false)
	String department;
	
	public String getteacherId() {
		return teacherId;
	}

	public void setteacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}
