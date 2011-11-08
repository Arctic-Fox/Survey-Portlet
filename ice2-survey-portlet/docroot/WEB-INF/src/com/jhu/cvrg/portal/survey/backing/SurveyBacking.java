package com.jhu.cvrg.portal.survey.backing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UISelectItem;
import javax.faces.event.ActionEvent;

import com.icesoft.faces.component.ext.HtmlSelectManyCheckbox;
import com.icesoft.faces.component.ext.HtmlSelectOneRadio;
import com.jhu.cvrg.portal.survey.model.AnswerItem;
import com.jhu.cvrg.portal.survey.model.SurveyQuestion;
import com.jhu.cvrg.portal.survey.model.SurveyQuestionOption;
import com.jhu.cvrg.portal.survey.utility.DataManager;
import com.jhu.cvrg.portal.survey.utility.ResourceUtility;

/*
Copyright 2011 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
* @author Chris Jurado
* 
*/

@ManagedBean(name = "surveyBacking")
@ViewScoped
public class SurveyBacking implements Serializable{

	private static final long serialVersionUID = 1L;
	private long surveyId = ResourceUtility.getPrefSurveyId();
	private boolean textQuestion, multiOptionQuestion, singleOptionQuestion, showSurvey, surveyDone, errorPanel, surveyStart;
	private enum visiblePanel {START, TEXT, BOOLEAN, SINGLEOPTION, MULTIOPTION, END, ERROR};
	
	private List<SurveyQuestion> surveyQuestions = DataManager.getSurveyQuestions(surveyId);
	private SurveyQuestion currentQuestion = null;
	private int currentQuestionNumber = 0;
	private String currentQuestionText = "";
	private String currentTextAnswer;
	private String surveyName = "";
	private HtmlSelectOneRadio radioOptions;
	private HtmlSelectManyCheckbox checkOptions;
	private String radioAnswer;
	private String[] checkAnswer;
	
	private ArrayList<AnswerItem> answers;
	
	private String optionText1;

	
	public SurveyBacking(){
		surveyQuestions = DataManager.getSurveyQuestions(surveyId);
		if(surveyId != 0L){
			Initialize();
		}
	}
	
	private void showPanel(visiblePanel panel){
		
		surveyStart = false;
		showSurvey = true;
		textQuestion = false;
		multiOptionQuestion = false;
		singleOptionQuestion = false;
		surveyDone = false;
		errorPanel = false;
		
		switch(panel){
		case START:			surveyStart = true;			
							showSurvey = false;					break;
		case TEXT:			textQuestion = true;				break;
		case BOOLEAN:		singleOptionQuestion = true;		break;
		case SINGLEOPTION:	singleOptionQuestion = true;		break;
		case MULTIOPTION:	multiOptionQuestion = true;			break;
		case END:			surveyDone = true;
							showSurvey = false;					break;
		case ERROR:			errorPanel = true;
							showSurvey = false;					break;
		default:			errorPanel = true;					break;
		}
	}
	
	private void Initialize(){	
		showPanel(visiblePanel.START);
		answers = new ArrayList<AnswerItem>();
		resetQuestionPanels();
		if(DataManager.retrieveSurvey(surveyId) != null){
			surveyName = DataManager.retrieveSurvey(surveyId).getSurveyName();
		}
	}
	
	private void resetQuestionPanels(){
		currentQuestionText = "";
//		radioOptions.getChildren().clear();
	}

	public void next(ActionEvent e){
		
		if(currentQuestion != null)
			storeAnswer();
		
		currentTextAnswer = "";
		currentQuestion = getNextQuestion();
		
		if(currentQuestion == null){
			showPanel(visiblePanel.END);
			saveSurvey();
			return;
		}
		radioOptions.getChildren().clear();
		
		currentQuestionNumber = currentQuestion.getDisplayorder();
		currentQuestionText = currentQuestion.getQuestion();
		
		switch(currentQuestion.getType()){
		case 1: 	showPanel(visiblePanel.TEXT);		break;
		case 2:		showBooleanQuestion();          	break;
		case 3:		showSingleOptionQuestion();			break;
		case 4:		showMultiOptionQuestion();			break;
		case 5:		showScaleQuestion();				break;
		case 6:		showStronglyQuestion();				break;
		default:	showPanel(visiblePanel.ERROR);		break;
		}	
	}
	
	private void saveSurvey(){
		DataManager.storeSurveyResponse(answers);
	}
	
	private void storeAnswer(){	
		
		switch(currentQuestion.getType()){
		case 1: 	answers.add(new AnswerItem(currentQuestion.getSurveyQuestionId(), surveyId, currentTextAnswer));		break;
		case 2:		answers.add(new AnswerItem(currentQuestion.getSurveyQuestionId(), surveyId, radioAnswer));          	break;
		case 3:		answers.add(new AnswerItem(currentQuestion.getSurveyQuestionId(), surveyId, radioAnswer));				break;
		case 4:     addMultipleItems();																						break;
		case 5:		answers.add(new AnswerItem(currentQuestion.getSurveyQuestionId(), surveyId, radioAnswer));				break;
		case 6:		answers.add(new AnswerItem(currentQuestion.getSurveyQuestionId(), surveyId, radioAnswer));				break;
		default:	showPanel(visiblePanel.ERROR);		break;
		}
	}
	
	private void addMultipleItems(){
		for(String item : (String[])checkOptions.getSelectedValues()){
			answers.add(new AnswerItem(currentQuestion.getSurveyQuestionId(), surveyId, item));
		}
	}
	
	public int getCurrentQuestionNumber() {
		return currentQuestionNumber;
	}

	public void setCurrentQuestionNumber(int currentQuestionNumber) {
		this.currentQuestionNumber = currentQuestionNumber;
	}

	private SurveyQuestion getNextQuestion(){
		
		SurveyQuestion question = null;
		int findQuestionNumber = currentQuestionNumber + 1;
		
		for(SurveyQuestion item : surveyQuestions){
			if(item.getDisplayorder() == findQuestionNumber){
				question = item;
			}
		}	
		return question;
	}
	
	private void showMultiOptionQuestion(){
		showPanel(visiblePanel.MULTIOPTION);
		
		List<SurveyQuestionOption> options = DataManager.getSurveyQuestionOptions(currentQuestion.getSurveyQuestionId());
		
		for(SurveyQuestionOption option : options){
			UISelectItem item = new UISelectItem();
			item.setItemValue(option.getSurveyQuestionOptionId());
			item.setItemLabel(option.getQuestion());
			checkOptions.getChildren().add(item);
		}
	}
	
	private void showStronglyQuestion(){
		showPanel(visiblePanel.SINGLEOPTION);
		
		UISelectItem itemOne = new UISelectItem();
		itemOne.setItemValue("1");
		itemOne.setItemLabel("Strongly Agree");
		radioOptions.getChildren().add(itemOne);
		
		UISelectItem itemTwo = new UISelectItem();
		itemTwo.setItemValue("2");
		itemTwo.setItemLabel("Agree");
		radioOptions.getChildren().add(itemTwo);
		
		UISelectItem itemThree = new UISelectItem();
		itemThree.setItemValue("3");
		itemThree.setItemLabel("Neither Agree nor Disagree");
		radioOptions.getChildren().add(itemThree);
		
		UISelectItem itemFour = new UISelectItem();
		itemFour.setItemValue("4");
		itemFour.setItemLabel("Disagree");
		radioOptions.getChildren().add(itemFour);
		
		UISelectItem itemFive = new UISelectItem();
		itemFive.setItemValue("5");
		itemFive.setItemLabel("Strongly Disagree");
		radioOptions.getChildren().add(itemFive);
	}
	
	private void showScaleQuestion(){
		showPanel(visiblePanel.SINGLEOPTION);
		
		UISelectItem itemOne = new UISelectItem();
		itemOne.setItemValue("1");
		itemOne.setItemLabel("1");
		radioOptions.getChildren().add(itemOne);
		
		UISelectItem itemTwo = new UISelectItem();
		itemTwo.setItemValue("2");
		itemTwo.setItemLabel("3");
		radioOptions.getChildren().add(itemTwo);
		
		UISelectItem itemThree = new UISelectItem();
		itemThree.setItemValue("3");
		itemThree.setItemLabel("3");
		radioOptions.getChildren().add(itemThree);
		
		UISelectItem itemFour = new UISelectItem();
		itemFour.setItemValue("4");
		itemFour.setItemLabel("4");
		radioOptions.getChildren().add(itemFour);
		
		UISelectItem itemFive = new UISelectItem();
		itemFive.setItemValue("5");
		itemFive.setItemLabel("5");
		radioOptions.getChildren().add(itemFive);
	}
	
	private void showBooleanQuestion(){
		showPanel(visiblePanel.SINGLEOPTION);
		
		UISelectItem itemYes = new UISelectItem();
		itemYes.setItemValue("1");
		itemYes.setItemLabel("Yes");
		radioOptions.getChildren().add(itemYes);


		UISelectItem itemNo = new UISelectItem();
		itemNo.setItemValue("2");
		itemNo.setItemLabel("No");
		radioOptions.getChildren().add(itemNo);
	}

	private void showSingleOptionQuestion(){
		showPanel(visiblePanel.SINGLEOPTION);
		
		List<SurveyQuestionOption> options = DataManager.getSurveyQuestionOptions(currentQuestion.getSurveyQuestionId());
		
		for(SurveyQuestionOption option : options){
			UISelectItem item = new UISelectItem();
			item.setItemValue(option.getSurveyQuestionOptionId());
			item.setItemLabel(option.getQuestion());
			radioOptions.getChildren().add(item);
		}

	}

	public boolean isTextQuestion() {
		return textQuestion;
	}

	public void setTextQuestion(boolean textQuestion) {
		this.textQuestion = textQuestion;
	}

	public void setShowSurvey(boolean showSurvey) {
		this.showSurvey = showSurvey;
	}

	public boolean isShowSurvey() {
		return showSurvey;
	}

	public void setSurveyDone(boolean surveyDone) {
		this.surveyDone = surveyDone;
	}

	public boolean isSurveyDone() {
		return surveyDone;
	}

	public void setErrorPanel(boolean errorPanel) {
		this.errorPanel = errorPanel;
	}

	public boolean isErrorPanel() {
		return errorPanel;
	}


	public String getOptionText1() {
		return optionText1;
	}

	public void setOptionText1(String optionText1) {
		this.optionText1 = optionText1;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyName() {
		return surveyName;
	}
	
	public String getCurrentQuestionText() {
		return currentQuestionText;
	}

	public void setCurrentQuestionText(String currentQuestionText) {
		this.currentQuestionText = currentQuestionText;
	}

	public void setCurrentTextAnswer(String currentTextAnswer) {
		this.currentTextAnswer = currentTextAnswer;
	}

	public String getCurrentTextAnswer() {
		return currentTextAnswer;
	}

	public void setRadioOptions(HtmlSelectOneRadio radioOptions) {
		this.radioOptions = radioOptions;
	}

	public HtmlSelectOneRadio getRadioOptions() {
		return radioOptions;
	}

	public void setRadioAnswer(String radioAnswer) {
		this.radioAnswer = radioAnswer;
	}

	public String getRadioAnswer() {
		return radioAnswer;
	}

	public void setSurveyStart(boolean surveyStart) {
		this.surveyStart = surveyStart;
	}

	public boolean isSurveyStart() {
		return surveyStart;
	}

	public void setCheckOptions(HtmlSelectManyCheckbox checkOptions) {
		this.checkOptions = checkOptions;
	}

	public HtmlSelectManyCheckbox getCheckOptions() {
		return checkOptions;
	}

	public void setCheckAnswer(String[] checkAnswer) {
		this.checkAnswer = checkAnswer;
	}

	public String[] getCheckAnswer() {
		return checkAnswer;
	}

	public void setSingleOptionQuestion(boolean singleOptionQuestion) {
		this.singleOptionQuestion = singleOptionQuestion;
	}

	public boolean isSingleOptionQuestion() {
		return singleOptionQuestion;
	}

	public void setMultiOptionQuestion(boolean multiOptionQuestion) {
		this.multiOptionQuestion = multiOptionQuestion;
	}

	public boolean isMultiOptionQuestion() {
		return multiOptionQuestion;
	}
	
}
