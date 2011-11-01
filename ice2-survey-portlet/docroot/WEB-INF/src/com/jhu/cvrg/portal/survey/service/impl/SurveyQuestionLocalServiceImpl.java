/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.jhu.cvrg.portal.survey.service.impl;

import java.util.List;

import com.jhu.cvrg.portal.survey.model.SurveyQuestion;
import com.jhu.cvrg.portal.survey.service.base.SurveyQuestionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the survey question local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.jhu.cvrg.portal.survey.service.SurveyQuestionLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.jhu.cvrg.portal.survey.service.SurveyQuestionLocalServiceUtil} to access the survey question local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Chris Jurado
 * @see com.jhu.cvrg.portal.survey.service.base.SurveyQuestionLocalServiceBaseImpl
 * @see com.jhu.cvrg.portal.survey.service.SurveyQuestionLocalServiceUtil
 */
public class SurveyQuestionLocalServiceImpl extends SurveyQuestionLocalServiceBaseImpl {
	
	public SurveyQuestion addSurveyQuestion(long surveyId, String question, int type, int order) throws SystemException, PortalException {

		SurveyQuestion newSurveyQuestion = surveyQuestionPersistence.create(counterLocalService.increment(SurveyQuestion.class.getName()));
		newSurveyQuestion.setSurveyId(surveyId);
		newSurveyQuestion.setQuestion(question);
		newSurveyQuestion.setType(type);
		newSurveyQuestion.setDisplayorder(order);

		return surveyQuestionPersistence.update(newSurveyQuestion, false);
	}

	public List<SurveyQuestion> findBySurvey(long surveyId) throws SystemException {
		List<SurveyQuestion> surveyQuestions = surveyQuestionPersistence.findBySurvey(surveyId);
		return surveyQuestions;
	}
}