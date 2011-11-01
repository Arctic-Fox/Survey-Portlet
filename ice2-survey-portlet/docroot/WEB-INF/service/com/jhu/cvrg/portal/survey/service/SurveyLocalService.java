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

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the survey local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link SurveyLocalServiceUtil} to access the survey local service. Add custom service methods to {@link com.jhu.cvrg.portal.survey.service.impl.SurveyLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyLocalServiceUtil
 * @see com.jhu.cvrg.portal.survey.service.base.SurveyLocalServiceBaseImpl
 * @see com.jhu.cvrg.portal.survey.service.impl.SurveyLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SurveyLocalService {
	/**
	* Adds the survey to the database. Also notifies the appropriate model listeners.
	*
	* @param survey the survey to add
	* @return the survey that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey addSurvey(
		com.jhu.cvrg.portal.survey.model.Survey survey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new survey with the primary key. Does not add the survey to the database.
	*
	* @param surveyId the primary key for the new survey
	* @return the new survey
	*/
	public com.jhu.cvrg.portal.survey.model.Survey createSurvey(long surveyId);

	/**
	* Deletes the survey with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyId the primary key of the survey to delete
	* @throws PortalException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the survey from the database. Also notifies the appropriate model listeners.
	*
	* @param survey the survey to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurvey(com.jhu.cvrg.portal.survey.model.Survey survey)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the survey with the primary key.
	*
	* @param surveyId the primary key of the survey to get
	* @return the survey
	* @throws PortalException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.jhu.cvrg.portal.survey.model.Survey getSurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> getSurveies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of surveies.
	*
	* @return the number of surveies
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSurveiesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the survey in the database. Also notifies the appropriate model listeners.
	*
	* @param survey the survey to update
	* @return the survey that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey updateSurvey(
		com.jhu.cvrg.portal.survey.model.Survey survey)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.jhu.cvrg.portal.survey.model.Survey addSurvey(long communityId,
		java.lang.String surveyName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException;
}