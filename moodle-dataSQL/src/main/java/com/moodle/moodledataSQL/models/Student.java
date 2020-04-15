package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Student implements Serializable{

	@Id
	private String enrollmentNumber;

	@Column(nullable=false)
	private String name;

	private String emailId;

	private String contactNo;

	@Column(nullable=false)
	private String branch;

	@Column(nullable=false)
	private int year;

	@Column(nullable=false)
	private int semester;

	@Column(nullable=false)
	private String course;

	@Column(nullable=false)
	private String batch;

	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "studentDeptId",nullable=false)   
	private Department department;

	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;
	
	public Student() {

	}

	public Student(String enrollmentNumber, String name, String emailId, String contactNo, String branch, int year, int semester, String course, String batch, Department department) {
		this.enrollmentNumber = enrollmentNumber;
		this.name =  name;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.branch = branch;
		this.year = year;
		this.semester = semester;
		this.course = course;
		this.batch = batch;	
		this.department = department;
	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
