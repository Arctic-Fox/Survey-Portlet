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

import com.jhu.cvrg.portal.survey.model.SurveyAnswer;
import com.jhu.cvrg.portal.survey.service.base.SurveyAnswerLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the survey answer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.jhu.cvrg.portal.survey.service.SurveyAnswerLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.jhu.cvrg.portal.survey.service.SurveyAnswerLocalServiceUtil} to access the survey answer local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Chris Jurado
 * @see com.jhu.cvrg.portal.survey.service.base.SurveyAnswerLocalServiceBaseImpl
 * @see com.jhu.cvrg.portal.survey.service.SurveyAnswerLocalServiceUtil
 */
public class SurveyAnswerLocalServiceImpl extends SurveyAnswerLocalServiceBaseImpl {
	
	public SurveyAnswer addSurveyAnswer(long surveyQuestionId, long surveyId, long userId, String answer) throws SystemException, PortalException {

		SurveyAnswer newSurveyAnswer = surveyAnswerPersistence.create(counterLocalService.increment(SurveyAnswer.class.getName()));
		newSurveyAnswer.setSurveyQuestionId(surveyQuestionId);
		newSurveyAnswer.setSurveyId(surveyId);
		newSurveyAnswer.setUserId(userId);
		newSurveyAnswer.setAnswer(answer);

		return surveyAnswerPersistence.update(newSurveyAnswer, false);
	}

	public List<SurveyAnswer> findBySurvey(long surveyId) throws SystemException {
		List<SurveyAnswer> surveyAnswers = surveyAnswerPersistence.findBySurvey(surveyId);
		return surveyAnswers;
	}
	
	public List<SurveyAnswer> findBySurveyQuestion(long surveyQuestionId) throws SystemException {
		List<SurveyAnswer> surveyAnswers = surveyAnswerPersistence.findBySurveyQuestion(surveyQuestionId);
		return surveyAnswers;
	}
}