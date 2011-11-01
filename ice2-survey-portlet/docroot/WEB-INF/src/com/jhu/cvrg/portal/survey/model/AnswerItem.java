package com.jhu.cvrg.portal.survey.model;

public class AnswerItem {
	
	private long questionId;
	private long surveyId;
	private String answer;
	
	public AnswerItem(long questionId, long surveyId, String answer){
		this.questionId = questionId;
		this.surveyId = surveyId;
		this.answer = answer;
	}
	
	
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public long getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(long surveyId) {
		this.surveyId = surveyId;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getAnswer() {
		return answer;
	}

}
