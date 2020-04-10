package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Objects;

public class AssignmentSubmissionId extends Auditing implements Serializable {
	
	private Assignment assignment;
	private Student student;
	
	public AssignmentSubmissionId() {
		
	}
	
	public AssignmentSubmissionId(Assignment assignment, Student student) {
		this.assignment = assignment;
		this.student = student;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssignmentSubmissionId obj = (AssignmentSubmissionId) o;
        return assignment == obj.assignment && student == obj.student;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignment, student);
    }
}
