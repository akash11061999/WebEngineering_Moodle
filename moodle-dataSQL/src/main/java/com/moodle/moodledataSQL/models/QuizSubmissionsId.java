package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Objects;

public class QuizSubmissionsId extends Auditing implements Serializable {

	private Quiz quiz;
	private Student student;

	public QuizSubmissionsId() {

	}

	public QuizSubmissionsId(Quiz quiz, Student student) {
		this.quiz = quiz;
		this.student = student;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QuizSubmissionsId obj = (QuizSubmissionsId) o;
		return quiz == obj.quiz && student == obj.student;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quiz, student);
	}
}
