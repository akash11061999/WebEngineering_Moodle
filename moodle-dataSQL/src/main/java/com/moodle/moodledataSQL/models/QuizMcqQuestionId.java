package com.moodle.moodledataSQL.models;

import java.io.Serializable;
import java.util.Objects;

public class QuizMcqQuestionId extends Auditing implements Serializable {

	private Quiz quiz;
	private int mcqQuestionId; 

	public QuizMcqQuestionId() {

	}

	public QuizMcqQuestionId(Quiz quiz, int mcqQuestionId) {
		this.quiz = quiz;
		this.mcqQuestionId = mcqQuestionId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QuizMcqQuestionId q = (QuizMcqQuestionId) o;
		return quiz ==q.quiz && mcqQuestionId == q.mcqQuestionId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quiz, mcqQuestionId);
	}

}