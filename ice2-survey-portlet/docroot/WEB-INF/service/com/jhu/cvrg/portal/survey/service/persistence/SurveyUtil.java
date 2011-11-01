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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the survey service. This utility wraps {@link SurveyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyPersistence
 * @see SurveyPersistenceImpl
 * @generated
 */
public class SurveyUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Survey survey) {
		getPersistence().clearCache(survey);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Survey> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Survey> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Survey> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Survey remove(Survey survey) throws SystemException {
		return getPersistence().remove(survey);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Survey update(Survey survey, boolean merge)
		throws SystemException {
		return getPersistence().update(survey, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Survey update(Survey survey, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(survey, merge, serviceContext);
	}

	/**
	* Caches the survey in the entity cache if it is enabled.
	*
	* @param survey the survey to cache
	*/
	public static void cacheResult(
		com.jhu.cvrg.portal.survey.model.Survey survey) {
		getPersistence().cacheResult(survey);
	}

	/**
	* Caches the surveies in the entity cache if it is enabled.
	*
	* @param surveies the surveies to cache
	*/
	public static void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.Survey> surveies) {
		getPersistence().cacheResult(surveies);
	}

	/**
	* Creates a new survey with the primary key. Does not add the survey to the database.
	*
	* @param surveyId the primary key for the new survey
	* @return the new survey
	*/
	public static com.jhu.cvrg.portal.survey.model.Survey create(long surveyId) {
		return getPersistence().create(surveyId);
	}

	/**
	* Removes the survey with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyId the primary key of the survey to remove
	* @return the survey that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.Survey remove(long surveyId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(surveyId);
	}

	public static com.jhu.cvrg.portal.survey.model.Survey updateImpl(
		com.jhu.cvrg.portal.survey.model.Survey survey, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(survey, merge);
	}

	/**
	* Finds the survey with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyException} if it could not be found.
	*
	* @param surveyId the primary key of the survey to find
	* @return the survey
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.Survey findByPrimaryKey(
		long surveyId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(surveyId);
	}

	/**
	* Finds the survey with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyId the primary key of the survey to find
	* @return the survey, or <code>null</code> if a survey with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.Survey fetchByPrimaryKey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(surveyId);
	}

	/**
	* Finds all the surveies where communityId = &#63;.
	*
	* @param communityId the community id to search with
	* @return the matching surveies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCommunity(communityId);
	}

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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCommunity(communityId, start, end);
	}

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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findByCommunity(
		long communityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCommunity(communityId, start, end, orderByComparator);
	}

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
	public static com.jhu.cvrg.portal.survey.model.Survey findByCommunity_First(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCommunity_First(communityId, orderByComparator);
	}

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
	public static com.jhu.cvrg.portal.survey.model.Survey findByCommunity_Last(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCommunity_Last(communityId, orderByComparator);
	}

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
	public static com.jhu.cvrg.portal.survey.model.Survey[] findByCommunity_PrevAndNext(
		long surveyId, long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCommunity_PrevAndNext(surveyId, communityId,
			orderByComparator);
	}

	/**
	* Finds all the surveies.
	*
	* @return the surveies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.Survey> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the surveies where communityId = &#63; from the database.
	*
	* @param communityId the community id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCommunity(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCommunity(communityId);
	}

	/**
	* Removes all the surveies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the surveies where communityId = &#63;.
	*
	* @param communityId the community id to search with
	* @return the number of matching surveies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCommunity(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCommunity(communityId);
	}

	/**
	* Counts all the surveies.
	*
	* @return the number of surveies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SurveyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SurveyPersistence)PortletBeanLocatorUtil.locate(com.jhu.cvrg.portal.survey.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					SurveyPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(SurveyPersistence persistence) {
		_persistence = persistence;
	}

	private static SurveyPersistence _persistence;
}