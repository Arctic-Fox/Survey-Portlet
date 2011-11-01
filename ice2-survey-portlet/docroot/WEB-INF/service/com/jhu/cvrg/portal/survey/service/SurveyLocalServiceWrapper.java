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
 * This class is a wrapper for {@link SurveyLocalService}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       SurveyLocalService
 * @generated
 */
public class SurveyLocalServiceWrapper implements SurveyLocalService {
	public SurveyLocalServiceWrapper(SurveyLocalService surveyLocalService) {
		_surveyLocalService = surveyLocalService;
	}

	/**
	* Adds the survey to the database. Also notifies the appropriate model listeners.
	*
	* @param survey the survey to add
	* @return the survey that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey addSurvey(
		com.jhu.cvrg.portal.survey.model.Survey survey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.addSurvey(survey);
	}

	/**
	* Creates a new survey with the primary key. Does not add the survey to the database.
	*
	* @param surveyId the primary key for the new survey
	* @return the new survey
	*/
	public com.jhu.cvrg.portal.survey.model.Survey createSurvey(long surveyId) {
		return _surveyLocalService.createSurvey(surveyId);
	}

	/**
	* Deletes the survey with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyId the primary key of the survey to delete
	* @throws PortalException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_surveyLocalService.deleteSurvey(surveyId);
	}

	/**
	* Deletes the survey from the database. Also notifies the appropriate model listeners.
	*
	* @param survey the survey to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurvey(com.jhu.cvrg.portal.survey.model.Survey survey)
		throws com.liferay.portal.kernel.exception.SystemException {
		_surveyLocalService.deleteSurvey(survey);
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
		return _surveyLocalService.dynamicQuery(dynamicQuery);
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
		return _surveyLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _surveyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _surveyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the survey with the primary key.
	*
	* @param surveyId the primary key of the survey to get
	* @return the survey
	* @throws PortalException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey getSurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.getSurvey(surveyId);
	}

	/**
	* Gets a range of all the surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of surveies to return
	* @param end the upper bound of the range of surveies to return (not inclusive)
	* @return the range of surveies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> getSurveies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.getSurveies(start, end);
	}

	/**
	* Gets the number of surveies.
	*
	* @return the number of surveies
	* @throws SystemException if a system exception occurred
	*/
	public int getSurveiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.getSurveiesCount();
	}

	/**
	* Updates the survey in the database. Also notifies the appropriate model listeners.
	*
	* @param survey the survey to update
	* @return the survey that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey updateSurvey(
		com.jhu.cvrg.portal.survey.model.Survey survey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.updateSurvey(survey);
	}

	/**
	* Updates the survey in the database. Also notifies the appropriate model listeners.
	*
	* @param survey the survey to update
	* @param merge whether to merge the survey with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the survey that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey updateSurvey(
		com.jhu.cvrg.portal.survey.model.Survey survey, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.updateSurvey(survey, merge);
	}

	public com.jhu.cvrg.portal.survey.model.Survey addSurvey(long communityId,
		java.lang.String surveyName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.addSurvey(communityId, surveyName);
	}

	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyLocalService.findByCommunity(communityId);
	}

	public SurveyLocalService getWrappedSurveyLocalService() {
		return _surveyLocalService;
	}

	private SurveyLocalService _surveyLocalService;
}