package com.jhu.cvrg.portal.survey.utility;

import java.util.ArrayList;
import java.util.List;

import org.portletfaces.liferay.faces.context.LiferayFacesContext;

import com.jhu.cvrg.portal.survey.model.*;
import com.jhu.cvrg.portal.survey.service.SurveyAnswerLocalServiceUtil;
import com.jhu.cvrg.portal.survey.service.SurveyLocalServiceUtil;
import com.jhu.cvrg.portal.survey.service.SurveyQuestionLocalServiceUtil;
import com.jhu.cvrg.portal.survey.service.SurveyQuestionOptionLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class DataManager {

	private final static LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
	private static long surveyId;
	
	public static Survey retrieveSurvey(long surveyId){
		Survey survey = null;
		
		try {
			survey = SurveyLocalServiceUtil.getSurvey(surveyId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return survey;
	}
	
	public static List<SurveyQuestion> getSurveyQuestions(long surveyId){
		List<SurveyQuestion> surveyQuestions = null;
		
		try {
			surveyQuestions = SurveyQuestionLocalServiceUtil.findBySurvey(surveyId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return surveyQuestions;
	}
	
	public static List<SurveyQuestionOption> getSurveyQuestionOptions(long questionId){
		List<SurveyQuestionOption> surveyQuestionOptions = null;
		
		try {
			surveyQuestionOptions = SurveyQuestionOptionLocalServiceUtil.findBySurveyQuestion(questionId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return surveyQuestionOptions;
		
	}
	
	public static void storeSurvey(ControlList controlList, String surveyName){
		
		Survey survey = null;
		
		try {
			survey = SurveyLocalServiceUtil.addSurvey(ResourceUtility.getCurrentGroupId(), surveyName);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		surveyId = survey.getSurveyId();

		storeItems(controlList);
	}
	
	private static void storeItems(ControlList controlList){
		
		int parentQuestionNumber = 0;

		for(QuestionItem item : controlList.getQuestionList()){
			
			if(item.getQuestionNumber() == 0)
				parentQuestionNumber = item.getParentQuestion();
			
			switch (item.getQuestionType()){
				case TEXT: 		storeQuestion(item, 1); 						break;
				case BOOLEAN:	storeQuestion(item, 2);							break;
				case OPTION: 	storeQuestion(item, 3);							break;
				case ANSWER:	storeAnswerOption(item, parentQuestionNumber);	break;
				default: break;
			}	
		}
	}
		
	private static void storeQuestion(QuestionItem item, int questionType){
		try {
			SurveyQuestionLocalServiceUtil.addSurveyQuestion(surveyId, item.getQuestionText(), questionType, item.getQuestionNumber());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void storeAnswerOption(QuestionItem item, int parentQuestionNumber){
			List<SurveyQuestion> parentQuestions;
			long questionId = 0L;
		try {
			parentQuestions = SurveyQuestionLocalServiceUtil.findBySurvey(surveyId);
			
			System.out.println("Number of questions found: " + parentQuestions.size());
			System.out.println("Parent Question Number: " + parentQuestionNumber);
			
			for(SurveyQuestion question : parentQuestions){
				
				System.out.println("Display Order: " + question.getDisplayorder());
				
				if(question.getDisplayorder() == parentQuestionNumber){
					questionId = question.getSurveyQuestionId();
					SurveyQuestionOptionLocalServiceUtil.addSurveyQuestionOption(questionId, item.getQuestionText(), 0);
				}
			}	
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void storeSurveyResponse(List<AnswerItem> answers){
		for(AnswerItem answer : answers){
			storeAnswer(answer);
		}
	}
	
	public static void storeAnswer(AnswerItem answer){
		try {
			SurveyAnswerLocalServiceUtil.addSurveyAnswer(answer.getQuestionId(), 
					answer.getSurveyId(), 
					ResourceUtility.getCurrentUserId(), 
					answer.getAnswer());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
