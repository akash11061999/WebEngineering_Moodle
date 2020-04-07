package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "subjectDeptId",nullable=false)    
	private Department department;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "subjects_teachers",
	joinColumns = { @JoinColumn(name = "subjectId", referencedColumnName = "subjectId", nullable = false, updatable = false)},
	inverseJoinColumns = { @JoinColumn(name = "teacherId", referencedColumnName = "teacherId", nullable = false, updatable = false)})
	private Set<Teacher> teachers = new HashSet<>();

	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Quiz> quiz;

	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Assignment> assignment;

	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuizSubmissions> quizSubmissions;

	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Resource> resource;

	public Subject() {

	}

	public Subject(String subjectId, String name, String description, int intendedYear, int intendedSemester) {
		this.subjectId = subjectId;
		this.name = name;
		this.description = description;
		this.intendedYear = intendedYear;
		this.intendedSemester = intendedSemester;
	}

	public Set<Quiz> getQuiz() {
		return quiz;
	}

	public void setQuiz(Set<Quiz> quiz) {
		this.quiz = quiz;
	}

	public Set<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(Set<Assignment> assignment) {
		this.assignment = assignment;
	}

	public Set<QuizSubmissions> getQuizSubmissions() {
		return quizSubmissions;
	}

	public void setQuizSubmissions(Set<QuizSubmissions> quizSubmissions) {
		this.quizSubmissions = quizSubmissions;
	}

	public Set<Resource> getResource() {
		return resource;
	}

	public void setResource(Set<Resource> resource) {
		this.resource = resource;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
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

}

