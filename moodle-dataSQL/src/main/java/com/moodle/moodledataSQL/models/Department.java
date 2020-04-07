package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable {

	@Id
	private String departmentId;

	@Column(nullable=false)  
	private String departmentName;
	
	@OneToMany(mappedBy = "department", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<Teacher> teachers;
	
	@OneToMany(mappedBy = "department", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<Student> students;
	
	@OneToMany(mappedBy = "department", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<Subject> subjects;

//	@Column(name="creationDate", columnDefinition="DATE DEFAULT CURRENT_TIMESTAMP")  
//	private Date creationDate;

	public Department() {
		
	}
	
	public Department (String departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public String getDepartmentId() {
		return departmentId;
	}
	
	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
//	public Date getCreationDate() {
//		return creationDate;
//	}
//
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}


}
