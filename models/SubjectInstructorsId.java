package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Objects;

public class SubjectInstructorsId implements Serializable {
	
	private Subject subject;
	private Teacher teacher;
	
	public SubjectInstructorsId() {
		
	}
	
	public SubjectInstructorsId(Subject subject, Teacher teacher) {
		this.subject = subject;
		this.teacher = teacher;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SubjectInstructorsId obj = (SubjectInstructorsId) o;
		return subject == obj.subject && teacher == obj.teacher;
	}

	@Override
	public int hashCode() {
		return Objects.hash(subject, teacher);
	}
}
