package com.moodle.moodledataSQL.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subject implements Serializable {
	
	
	// problem in mapping teacher
	@Id
	String subjectId;

	@Column(nullable=false)
	String name;
	
	
	@Column(nullable=false)
	String description;
	
	@Column(nullable=false)
	int intendedYear;
	
	@Column(nullable=false)
	int intendedSemester;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deptId",nullable=false)        //change
    public Department department;

	
	
	
//	@OneToMany(cascade=CascadeType.ALL)
//	public Teacher teacher;
//
//	public Teacher getTeacher() {
//		return teacher;
//	}
//
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIntendedYear() {
		return intendedYear;
	}

	public void setIntendedYear(int intendedYear) {
		this.intendedYear = intendedYear;
	}

	public int getIntendedSemester() {
		return intendedSemester;
	}

	public void setIntendedSemester(int intendedSemester) {
		this.intendedSemester = intendedSemester;
	}


	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	

//	public String getTeacherId() {
//		return teacherId;
//	}
//
//	public void setTeacherId(String teacherId) {
//		this.teacherId = teacherId;
//	}
	

}

