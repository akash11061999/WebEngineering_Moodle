package com.moodle.moodledataSQL.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(uniqueConstraints={
	    @UniqueConstraint(columnNames = {"assignmentId", "studentId"}) //these names should be actul names from sql table
	}) 
public class AssignmentFileStorage {
	
	@Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String fileName;

    private String fileType;
    
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "assignmentId", nullable = false)  
	private Assignment assignment;                             
                                                              //getters setteres assignemt,student
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name = "studentId", nullable = false)  
	private Student student;
     
    // create getters and setters after this

    public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Lob
    private byte[] data;
    
    public AssignmentFileStorage() {

    }

    public AssignmentFileStorage(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	
//	@Table(uniqueConstraints={
//	    @UniqueConstraint(columnNames = {"productId", "serial"})
//	}) 

}
