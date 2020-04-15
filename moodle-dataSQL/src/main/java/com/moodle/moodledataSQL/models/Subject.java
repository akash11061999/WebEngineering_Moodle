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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Subject implements Serializable {

	@Id
	private String subjectId;

	@Column(nullable=false)
	private String name;

	@Column(nullable=false)
	private String description;

	@Column(nullable=false)
	private int intendedYear;

	@Column(nullable=false)
	private int intendedSemester;

	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "subjectDeptId",nullable=false)    
	private Department department;
	
	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;
	

	public Subject() {

	}

	public Subject(String subjectId, String name, String description, int intendedYear, int intendedSemester, Department department) {
		this.subjectId = subjectId;
		this.name = name;
		this.description = description;
		this.intendedYear = intendedYear;
		this.intendedSemester = intendedSemester;
		this.department = department;
	}

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

