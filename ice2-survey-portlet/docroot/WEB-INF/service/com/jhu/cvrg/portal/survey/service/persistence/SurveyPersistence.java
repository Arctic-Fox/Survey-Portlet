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

package com.jhu.cvrg.portal.survey.service.persistence;

import com.jhu.cvrg.portal.survey.model.Survey;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the survey service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link SurveyUtil} to access the survey persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyPersistenceImpl
 * @see SurveyUtil
 * @generated
 */
public interface SurveyPersistence extends BasePersistence<Survey> {
	/**
	* Caches the survey in the entity cache if it is enabled.
	*
	* @param survey the survey to cache
	*/
	public void cacheResult(com.jhu.cvrg.portal.survey.model.Survey survey);

	/**
	* Caches the surveies in the entity cache if it is enabled.
	*
	* @param surveies the surveies to cache
	*/
	public void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.Survey> surveies);

	/**
	* Creates a new survey with the primary key. Does not add the survey to the database.
	*
	* @param surveyId the primary key for the new survey
	* @return the new survey
	*/
	public com.jhu.cvrg.portal.survey.model.Survey create(long surveyId);

	/**
	* Removes the survey with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyId the primary key of the survey to remove
	* @return the survey that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey remove(long surveyId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.jhu.cvrg.portal.survey.model.Survey updateImpl(
		com.jhu.cvrg.portal.survey.model.Survey survey, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyException} if it could not be found.
	*
	* @param surveyId the primary key of the survey to find
	* @return the survey
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey findByPrimaryKey(
		long surveyId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyId the primary key of the survey to find
	* @return the survey, or <code>null</code> if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey fetchByPrimaryKey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the surveies where communityId = &#63;.
	*
	* @param communityId the community id to search with
	* @return the matching surveies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the surveies where communityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param communityId the community id to search with
	* @param start the lower bound of the range of surveies to return
	* @param end the upper bound of the range of surveies to return (not inclusive)
	* @return the range of matching surveies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the surveies where communityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param communityId the community id to search with
	* @param start the lower bound of the range of surveies to return
	* @param end the upper bound of the range of surveies to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching surveies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first survey in the ordered set where communityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param communityId the community id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching survey
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a matching survey could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey findByCommunity_First(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the last survey in the ordered set where communityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param communityId the community id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching survey
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a matching survey could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey findByCommunity_Last(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the surveies before and after the current survey in the ordered set where communityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the primary key of the current survey
	* @param communityId the community id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next survey
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.Survey[] findByCommunity_PrevAndNext(
		long surveyId, long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the surveies.
	*
	* @return the surveies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the surveies.
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
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of surveies to return
	* @param end the upper bound of the range of surveies to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of surveies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the surveies where communityId = &#63; from the database.
	*
	* @param communityId the community id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCommunity(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the surveies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the surveies where communityId = &#63;.
	*
	* @param communityId the community id to search with
	* @return the number of matching surveies
	* @throws SystemException if a system exception occurred
	*/
	public int countByCommunity(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the surveies.
	*
	* @return the number of surveies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}