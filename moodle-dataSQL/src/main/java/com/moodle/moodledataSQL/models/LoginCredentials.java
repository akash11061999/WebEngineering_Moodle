package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@SuppressWarnings("serial")
@Entity
public class LoginCredentials implements Serializable {
	
	@Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "enrollmentNumber", nullable = false, updatable = false)
	private Student student;
	
	@Column(nullable = false)
	private String password;
	
	@CreationTimestamp  
	private Timestamp creationDate;
	
	@UpdateTimestamp
	private Timestamp updationDate;
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LoginCredentials lc = (LoginCredentials) o;
		return student == lc.student && password == lc.password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(student, password);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LoginCredentials() {
		
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

	public LoginCredentials(Student student, String password) {
		this.student = student;
		this.password = password;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
