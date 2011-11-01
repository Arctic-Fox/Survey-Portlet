package com.jhu.cvrg.portal.survey.model;

import com.jhu.cvrg.portal.survey.utility.ResourceUtility;

public class QuestionItem {
	//using a datatable to display the questio0ns instead of a datagrid of actual controls
	
	private int questionNumber;
	private int questionItemId;
	private int parentQuestion;
	private String questionText;
	private ResourceUtility.type questionType;
	
	public QuestionItem(int questionNumber, int parentQuestion, String questionText, ResourceUtility.type questionType){
		this.questionNumber = questionNumber;
		this.parentQuestion = parentQuestion;
		this.questionText = questionText;
		this.questionType = questionType;
		this.questionItemId = questionNumber + (parentQuestion * 100) + 10000;
	}
	
	public String getItemType(){
		String itemType = "";
		switch(questionType){
			case TEXT:		itemType="Free Response Text"; 				break;
			case BOOLEAN:	itemType="Yes/No"; 							break;
			case OPTION:	itemType="Multiple Choice (Single Option)"; break;
			case ANSWER:	itemType="Multiple Choice Option"; 			break;
			default:		itemType="Undefined"; 						break;
		}
		
		return itemType;
	}
	
	public String getQuestionNumberAsString() {
		if(questionNumber == 0){
			return "";
		}else{
			return String.valueOf(questionNumber);
		}
	}
	
	public int getQuestionNumber(){
		return questionNumber;
	}
	
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	public int getParentQuestion() {
		return parentQuestion;
	}
	public void setParentQuestion(int parentQuestion) {
		this.parentQuestion = parentQuestion;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public ResourceUtility.type getQuestionType() {
		return questionType;
	}
	public void setQuestionType(ResourceUtility.type questionType) {
		this.questionType = questionType;
	}

	public void setQuestionItemId(int questionItemId) {
		this.questionItemId = questionItemId;
	}

	public int getQuestionItemId() {
		return questionItemId;
	}
	
	
	
	
	
}
