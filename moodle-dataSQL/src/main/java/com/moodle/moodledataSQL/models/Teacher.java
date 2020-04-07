package com.moodle.moodledataSQL.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
public class Teacher implements Serializable {

	@Id
	private String teacherId;

	@Column(nullable=false)
	private String name;

	private String emailId;
	private String contactNo;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="teacherDeptId", nullable=false)
	private Department department;

	@ManyToMany(mappedBy = "teachers", fetch = FetchType.LAZY)
	private Set<Subject> subjects = new HashSet<>();

	public Teacher() {

	}

	public Teacher(String teacherId, String name, String emailId, String contactNo) {
		this.teacherId = teacherId;
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherId() {
		return teacherId;
	}

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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
