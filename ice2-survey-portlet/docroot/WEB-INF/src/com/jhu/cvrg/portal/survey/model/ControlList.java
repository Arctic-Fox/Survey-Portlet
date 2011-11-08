package com.jhu.cvrg.portal.survey.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jhu.cvrg.portal.survey.utility.ResourceUtility.type;

@ManagedBean(name = "controlList")
@ViewScoped
public class ControlList {
	
	private ArrayList<QuestionItem> questionList;

	public ControlList(){
		questionList = new ArrayList<QuestionItem>();
	}

	public void addQuestionItem(type questionType, String addQuestionText, boolean answerOption) {
		QuestionItem item;
		int number = 0;
		
		switch(questionType){
			case ANSWER:
				number = getHighestQuestionNumber();
				item = new QuestionItem(0, number, addQuestionText, questionType); 	
			break;
			default:
				number = getHighestQuestionNumber() + 1;
				item = new QuestionItem(number, 0, addQuestionText, questionType); 	
			break; 	
		}
		
		questionList.add(item);
	}
	
	private int getHighestQuestionNumber(){
		int highest = 0;
		for(QuestionItem item : questionList){
			if(item.getQuestionNumber() > highest){
				highest = item.getQuestionNumber();
			}
		}
		
		return highest;
	}
	
	public void delete(QuestionItem item){
		reNumberList(item.getQuestionNumber());
		questionList.remove(item);
	}
	
	private void reNumberList(int questionNumber){
		for(QuestionItem item : questionList){
			int num = 0;
			if(item.getQuestionNumber() > questionNumber){
				num = item.getQuestionNumber();
				num --;
				item.setQuestionNumber(num);
			}
		}
	}
	
	public ArrayList<QuestionItem> getQuestionList() {
		return questionList;
	}
}
