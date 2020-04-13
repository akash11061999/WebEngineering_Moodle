package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Objects;

public class QuizCodingQuestionId implements Serializable{
	
	private Quiz quiz;
	private int codingQuestionId; 

	public QuizCodingQuestionId() {

	}

	public QuizCodingQuestionId(Quiz quiz, int codingQuestionId) {
		this.quiz = quiz;
		this.codingQuestionId = codingQuestionId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QuizCodingQuestionId q = (QuizCodingQuestionId) o;
		return quiz == q.quiz && codingQuestionId == q.codingQuestionId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quiz, codingQuestionId);
	}
}
