package com.jhu.cvrg.portal.survey.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.portletfaces.liferay.faces.context.LiferayFacesContext;

import com.icesoft.faces.component.ext.HtmlPanelGrid;
import com.jhu.cvrg.portal.survey.model.ControlList;
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

@ManagedBean(name = "configurationBacking")
@ViewScoped
public class ConfigurationBacking {
	
	private long selectedSurvey;
	private boolean addPanelVisible, addQuestionVisible, addAnswerOptionVisible;
	private enum ShowPanel {ADD, QUESTION, ANSWER};
	private String selectedQuestionType;
	private HtmlPanelGrid questionsDisplayGrid;
	private String addQuestionText, addOptionText;
	private String currentSurveyName;
	private boolean newSurvey;
	
	LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
	
	@ManagedProperty(name = "controlList", value = "#{controlList}")
	private ControlList controlList;
	
	public ConfigurationBacking(){
		Initialize();
	}
	
	private void Initialize(){//Initializes the entire page including all current survey questions
		selectedSurvey = ResourceUtility.getPrefSurveyId();
		resetQuestion();
		currentSurveyName = "";
		newSurvey = true;
	}
	
	private void resetQuestion(){
		//initializes the tab but preserves the current survey
		addQuestionText = "";
		selectedQuestionType = "0";
		resetAnswerOption();
		switchView(ShowPanel.ADD);
	}
	
	private void resetAnswerOption(){
		//initializes the add option panel
		addOptionText = "";
		switchView(ShowPanel.ANSWER);
	}

/*
 * addPanel
 */
	public void addQuestion(){
		resetQuestion();
		switchView(ShowPanel.QUESTION);
	}
	
/*
 * addQuestion panel
 */
	public void addToSurvey(){
		if(selectedQuestionType.equals("2")){//Text
			controlList.addQuestionItem(ResourceUtility.type.TEXT, addQuestionText, false);
			switchView(ShowPanel.ADD);
		}else if(selectedQuestionType.equals("1")){//Yes/no
			controlList.addQuestionItem(ResourceUtility.type.BOOLEAN, addQuestionText, false);
			switchView(ShowPanel.ADD);
		}else if(selectedQuestionType.equals("3")){//1-5 Scale
			controlList.addQuestionItem(ResourceUtility.type.SCALE, addQuestionText, false);
			switchView(ShowPanel.ADD);
		}else if(selectedQuestionType.equals("4")){//Strongly
			controlList.addQuestionItem(ResourceUtility.type.STRONGLY, addQuestionText, false);
			switchView(ShowPanel.ADD);
		}else if(selectedQuestionType.equals("5")){//Multiple options
			controlList.addQuestionItem(ResourceUtility.type.MULTIOPTION, addQuestionText, false);
			switchView(ShowPanel.ANSWER);
		}else{//Single Option
			controlList.addQuestionItem(ResourceUtility.type.SINGLEOPTION, addQuestionText, false);
			switchView(ShowPanel.ANSWER);
		}
	}
	
	public void cancel(){
		resetQuestion();
	}
	
/*
 * addAnswerOption panel
 */
	
	public void addToQuestionAndContinue(){
		controlList.addQuestionItem(ResourceUtility.type.ANSWER, addOptionText, true);
		resetAnswerOption();
	}
	
	public void addToQuestionAndDone(){
		controlList.addQuestionItem(ResourceUtility.type.ANSWER, addOptionText, true);
		resetQuestion();
	}

	private void switchView(ShowPanel panel){
		addPanelVisible = false;
		addQuestionVisible = false;
		addAnswerOptionVisible = false;
		
		switch (panel){
		case ADD: 		addPanelVisible = true; 		break;
		case QUESTION:	addQuestionVisible = true;		break;
		case ANSWER: 	addAnswerOptionVisible = true;	break;
		default:		switchView(ShowPanel.ADD);		break;
		}
	}

	public void deleteQuestion(ActionEvent e){

	}

	public void saveSurvey(){
		DataManager.storeSurvey(controlList, currentSurveyName);
	}
	
	public void setSurvey(ActionEvent e){
		ResourceUtility.savePreferences(selectedSurvey);
	}
	
	public void setSelectedSurvey(long selectedSurvey) {
		this.selectedSurvey = selectedSurvey;
	}

	public long getSelectedSurvey() {
		return selectedSurvey;
	}

	public boolean isAddPanelVisible() {
		return addPanelVisible;
	}

	public boolean isAddQuestionVisible() {
		return addQuestionVisible;
	}

	public boolean isAddAnswerOptionVisible() {
		return addAnswerOptionVisible;
	}

	public String getSelectedQuestionType() {
		return selectedQuestionType;
	}

	public void setSelectedQuestionType(String selectedQuestionType) {
		this.selectedQuestionType = selectedQuestionType;
	}

	public void setQuestionsDisplayGrid(HtmlPanelGrid questionsDisplayGrid) {
		this.questionsDisplayGrid = questionsDisplayGrid;
	}

	public HtmlPanelGrid getQuestionsDisplayGrid() {
		return questionsDisplayGrid;
	}

	public void setAddQuestionText(String addQuestionText) {
		this.addQuestionText = addQuestionText;
	}

	public String getAddQuestionText() {
		return addQuestionText;
	}

	public void setAddOptionText(String addOptionText) {
		this.addOptionText = addOptionText;
	}

	public String getAddOptionText() {
		return addOptionText;
	}

	public void setNewSurvey(boolean newSurvey) {
		this.newSurvey = newSurvey;
	}

	public boolean isNewSurvey() {
		return newSurvey;
	}

	public void setCurrentSurveyName(String currentSurveyName) {
		this.currentSurveyName = currentSurveyName;
	}

	public String getCurrentSurveyName() {
		return currentSurveyName;
	}

	public ControlList getControlList() {
		return controlList;
	}

	public void setControlList(ControlList controlList) {
		this.controlList = controlList;
	}
	
	
}
