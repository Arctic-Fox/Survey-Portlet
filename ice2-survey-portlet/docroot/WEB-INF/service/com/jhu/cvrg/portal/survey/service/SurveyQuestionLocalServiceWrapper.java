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

package com.jhu.cvrg.portal.survey.service;

/**
 * <p>
 * This class is a wrapper for {@link SurveyQuestionLocalService}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       SurveyQuestionLocalService
 * @generated
 */
public class SurveyQuestionLocalServiceWrapper
	implements SurveyQuestionLocalService {
	public SurveyQuestionLocalServiceWrapper(
		SurveyQuestionLocalService surveyQuestionLocalService) {
		_surveyQuestionLocalService = surveyQuestionLocalService;
	}

	/**
	* Adds the survey question to the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to add
	* @return the survey question that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion addSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.addSurveyQuestion(surveyQuestion);
	}

	/**
	* Creates a new survey question with the primary key. Does not add the survey question to the database.
	*
	* @param surveyQuestionId the primary key for the new survey question
	* @return the new survey question
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion createSurveyQuestion(
		long surveyQuestionId) {
		return _surveyQuestionLocalService.createSurveyQuestion(surveyQuestionId);
	}

	/**
	* Deletes the survey question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionId the primary key of the survey question to delete
	* @throws PortalException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_surveyQuestionLocalService.deleteSurveyQuestion(surveyQuestionId);
	}

	/**
	* Deletes the survey question from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_surveyQuestionLocalService.deleteSurveyQuestion(surveyQuestion);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the survey question with the primary key.
	*
	* @param surveyQuestionId the primary key of the survey question to get
	* @return the survey question
	* @throws PortalException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion getSurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.getSurveyQuestion(surveyQuestionId);
	}

	/**
	* Gets a range of all the survey questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey questions to return
	* @param end the upper bound of the range of survey questions to return (not inclusive)
	* @return the range of survey questions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> getSurveyQuestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.getSurveyQuestions(start, end);
	}

	/**
	* Gets the number of survey questions.
	*
	* @return the number of survey questions
	* @throws SystemException if a system exception occurred
	*/
	public int getSurveyQuestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.getSurveyQuestionsCount();
	}

	/**
	* Updates the survey question in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to update
	* @return the survey question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion updateSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.updateSurveyQuestion(surveyQuestion);
	}

	/**
	* Updates the survey question in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to update
	* @param merge whether to merge the survey question with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the survey question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion updateSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.updateSurveyQuestion(surveyQuestion,
			merge);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestion addSurveyQuestion(
		long surveyId, java.lang.String question, int type, int order)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.addSurveyQuestion(surveyId,
			question, type, order);
	}

	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionLocalService.findBySurvey(surveyId);
	}

	public SurveyQuestionLocalService getWrappedSurveyQuestionLocalService() {
		return _surveyQuestionLocalService;
	}

	private SurveyQuestionLocalService _surveyQuestionLocalService;
}