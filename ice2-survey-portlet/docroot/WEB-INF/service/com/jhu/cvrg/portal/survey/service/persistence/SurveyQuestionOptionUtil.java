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

import com.jhu.cvrg.portal.survey.model.SurveyQuestionOption;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the survey question option service. This utility wraps {@link SurveyQuestionOptionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see SurveyQuestionOptionPersistence
 * @see SurveyQuestionOptionPersistenceImpl
 * @generated
 */
public class SurveyQuestionOptionUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(SurveyQuestionOption surveyQuestionOption) {
		getPersistence().clearCache(surveyQuestionOption);
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
	public static List<SurveyQuestionOption> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SurveyQuestionOption> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SurveyQuestionOption> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static SurveyQuestionOption remove(
		SurveyQuestionOption surveyQuestionOption) throws SystemException {
		return getPersistence().remove(surveyQuestionOption);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SurveyQuestionOption update(
		SurveyQuestionOption surveyQuestionOption, boolean merge)
		throws SystemException {
		return getPersistence().update(surveyQuestionOption, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SurveyQuestionOption update(
		SurveyQuestionOption surveyQuestionOption, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(surveyQuestionOption, merge, serviceContext);
	}

	/**
	* Caches the survey question option in the entity cache if it is enabled.
	*
	* @param surveyQuestionOption the survey question option to cache
	*/
	public static void cacheResult(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption) {
		getPersistence().cacheResult(surveyQuestionOption);
	}

	/**
	* Caches the survey question options in the entity cache if it is enabled.
	*
	* @param surveyQuestionOptions the survey question options to cache
	*/
	public static void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> surveyQuestionOptions) {
		getPersistence().cacheResult(surveyQuestionOptions);
	}

	/**
	* Creates a new survey question option with the primary key. Does not add the survey question option to the database.
	*
	* @param surveyQuestionOptionId the primary key for the new survey question option
	* @return the new survey question option
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption create(
		long surveyQuestionOptionId) {
		return getPersistence().create(surveyQuestionOptionId);
	}

	/**
	* Removes the survey question option with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to remove
	* @return the survey question option that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption remove(
		long surveyQuestionOptionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(surveyQuestionOptionId);
	}

	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(surveyQuestionOption, merge);
	}

	/**
	* Finds the survey question option with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException} if it could not be found.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to find
	* @return the survey question option
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption findByPrimaryKey(
		long surveyQuestionOptionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(surveyQuestionOptionId);
	}

	/**
	* Finds the survey question option with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to find
	* @return the survey question option, or <code>null</code> if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption fetchByPrimaryKey(
		long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(surveyQuestionOptionId);
	}

	/**
	* Finds all the survey question options where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the matching survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurveyQuestion(surveyQuestionId);
	}

	/**
	* Finds a range of all the survey question options where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param start the lower bound of the range of survey question options to return
	* @param end the upper bound of the range of survey question options to return (not inclusive)
	* @return the range of matching survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion(surveyQuestionId, start, end);
	}

	/**
	* Finds an ordered range of all the survey question options where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param start the lower bound of the range of survey question options to return
	* @param end the upper bound of the range of survey question options to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion(surveyQuestionId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first survey question option in the ordered set where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching survey question option
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a matching survey question option could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption findBySurveyQuestion_First(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion_First(surveyQuestionId,
			orderByComparator);
	}

	/**
	* Finds the last survey question option in the ordered set where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching survey question option
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a matching survey question option could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption findBySurveyQuestion_Last(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion_Last(surveyQuestionId,
			orderByComparator);
	}

	/**
	* Finds the survey question options before and after the current survey question option in the ordered set where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionOptionId the primary key of the current survey question option
	* @param surveyQuestionId the survey question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next survey question option
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption[] findBySurveyQuestion_PrevAndNext(
		long surveyQuestionOptionId, long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion_PrevAndNext(surveyQuestionOptionId,
			surveyQuestionId, orderByComparator);
	}

	/**
	* Finds all the survey question options.
	*
	* @return the survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the survey question options.
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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the survey question options.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey question options to return
	* @param end the upper bound of the range of survey question options to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the survey question options where surveyQuestionId = &#63; from the database.
	*
	* @param surveyQuestionId the survey question id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySurveyQuestion(surveyQuestionId);
	}

	/**
	* Removes all the survey question options from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the survey question options where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the number of matching survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySurveyQuestion(surveyQuestionId);
	}

	/**
	* Counts all the survey question options.
	*
	* @return the number of survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SurveyQuestionOptionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SurveyQuestionOptionPersistence)PortletBeanLocatorUtil.locate(com.jhu.cvrg.portal.survey.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					SurveyQuestionOptionPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(SurveyQuestionOptionPersistence persistence) {
		_persistence = persistence;
	}

	private static SurveyQuestionOptionPersistence _persistence;
}