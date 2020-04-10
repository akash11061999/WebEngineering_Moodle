package com.moodle.moodledataSQL.models;

import java.io.Serializable;
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
public class Student extends Auditing implements Serializable {

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

	@OneToMany(mappedBy = "student", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<AssignmentSubmission> assignmentSubmission;

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizSubmissions> quizSubmissions;

	public Student() {

	}

	public Student(String enrollmentNumber, String name, String emailId, String contactNo, String branch, int year, int semester, String course, String batch) {
		this.enrollmentNumber = enrollmentNumber;
		this.name =  name;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.branch = branch;
		this.year = year;
		this.semester = semester;
		this.course = course;
		this.batch = batch;		
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public Set<AssignmentSubmission> getAssignmentSubmission() {
		return assignmentSubmission;
	}

	public void setAssignmentSubmission(Set<AssignmentSubmission> assignmentSubmission) {
		this.assignmentSubmission = assignmentSubmission;
	}

	public Set<QuizSubmissions> getQuizSubmissions() {
		return quizSubmissions;
	}

	public void setQuizSubmissions(Set<QuizSubmissions> quizSubmissions) {
		this.quizSubmissions = quizSubmissions;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getName(){
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

}
