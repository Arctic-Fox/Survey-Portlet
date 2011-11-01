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
 * This class is a wrapper for {@link SurveyQuestionOptionLocalService}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       SurveyQuestionOptionLocalService
 * @generated
 */
public class SurveyQuestionOptionLocalServiceWrapper
	implements SurveyQuestionOptionLocalService {
	public SurveyQuestionOptionLocalServiceWrapper(
		SurveyQuestionOptionLocalService surveyQuestionOptionLocalService) {
		_surveyQuestionOptionLocalService = surveyQuestionOptionLocalService;
	}

	/**
	* Adds the survey question option to the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to add
	* @return the survey question option that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption addSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.addSurveyQuestionOption(surveyQuestionOption);
	}

	/**
	* Creates a new survey question option with the primary key. Does not add the survey question option to the database.
	*
	* @param surveyQuestionOptionId the primary key for the new survey question option
	* @return the new survey question option
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption createSurveyQuestionOption(
		long surveyQuestionOptionId) {
		return _surveyQuestionOptionLocalService.createSurveyQuestionOption(surveyQuestionOptionId);
	}

	/**
	* Deletes the survey question option with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to delete
	* @throws PortalException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurveyQuestionOption(long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_surveyQuestionOptionLocalService.deleteSurveyQuestionOption(surveyQuestionOptionId);
	}

	/**
	* Deletes the survey question option from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		_surveyQuestionOptionLocalService.deleteSurveyQuestionOption(surveyQuestionOption);
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
		return _surveyQuestionOptionLocalService.dynamicQuery(dynamicQuery);
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
		return _surveyQuestionOptionLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
		return _surveyQuestionOptionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _surveyQuestionOptionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the survey question option with the primary key.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to get
	* @return the survey question option
	* @throws PortalException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption getSurveyQuestionOption(
		long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.getSurveyQuestionOption(surveyQuestionOptionId);
	}

	/**
	* Gets a range of all the survey question options.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey question options to return
	* @param end the upper bound of the range of survey question options to return (not inclusive)
	* @return the range of survey question options
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> getSurveyQuestionOptions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.getSurveyQuestionOptions(start,
			end);
	}

	/**
	* Gets the number of survey question options.
	*
	* @return the number of survey question options
	* @throws SystemException if a system exception occurred
	*/
	public int getSurveyQuestionOptionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.getSurveyQuestionOptionsCount();
	}

	/**
	* Updates the survey question option in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to update
	* @return the survey question option that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.updateSurveyQuestionOption(surveyQuestionOption);
	}

	/**
	* Updates the survey question option in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to update
	* @param merge whether to merge the survey question option with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the survey question option that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.updateSurveyQuestionOption(surveyQuestionOption,
			merge);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption addSurveyQuestionOption(
		long surveyQuestionId, java.lang.String answer, int displayOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.addSurveyQuestionOption(surveyQuestionId,
			answer, displayOrder);
	}

	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyQuestionOptionLocalService.findBySurveyQuestion(surveyQuestionId);
	}

	public SurveyQuestionOptionLocalService getWrappedSurveyQuestionOptionLocalService() {
		return _surveyQuestionOptionLocalService;
	}

	private SurveyQuestionOptionLocalService _surveyQuestionOptionLocalService;
}