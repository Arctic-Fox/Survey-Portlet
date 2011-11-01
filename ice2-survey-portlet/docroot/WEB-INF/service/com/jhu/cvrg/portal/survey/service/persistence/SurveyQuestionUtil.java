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

import com.jhu.cvrg.portal.survey.model.SurveyQuestion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the survey question service. This utility wraps {@link SurveyQuestionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see SurveyQuestionPersistence
 * @see SurveyQuestionPersistenceImpl
 * @generated
 */
public class SurveyQuestionUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(SurveyQuestion surveyQuestion) {
		getPersistence().clearCache(surveyQuestion);
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
	public static List<SurveyQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SurveyQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SurveyQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static SurveyQuestion remove(SurveyQuestion surveyQuestion)
		throws SystemException {
		return getPersistence().remove(surveyQuestion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SurveyQuestion update(SurveyQuestion surveyQuestion,
		boolean merge) throws SystemException {
		return getPersistence().update(surveyQuestion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SurveyQuestion update(SurveyQuestion surveyQuestion,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(surveyQuestion, merge, serviceContext);
	}

	/**
	* Caches the survey question in the entity cache if it is enabled.
	*
	* @param surveyQuestion the survey question to cache
	*/
	public static void cacheResult(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion) {
		getPersistence().cacheResult(surveyQuestion);
	}

	/**
	* Caches the survey questions in the entity cache if it is enabled.
	*
	* @param surveyQuestions the survey questions to cache
	*/
	public static void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> surveyQuestions) {
		getPersistence().cacheResult(surveyQuestions);
	}

	/**
	* Creates a new survey question with the primary key. Does not add the survey question to the database.
	*
	* @param surveyQuestionId the primary key for the new survey question
	* @return the new survey question
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion create(
		long surveyQuestionId) {
		return getPersistence().create(surveyQuestionId);
	}

	/**
	* Removes the survey question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionId the primary key of the survey question to remove
	* @return the survey question that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion remove(
		long surveyQuestionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(surveyQuestionId);
	}

	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(surveyQuestion, merge);
	}

	/**
	* Finds the survey question with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException} if it could not be found.
	*
	* @param surveyQuestionId the primary key of the survey question to find
	* @return the survey question
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion findByPrimaryKey(
		long surveyQuestionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(surveyQuestionId);
	}

	/**
	* Finds the survey question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyQuestionId the primary key of the survey question to find
	* @return the survey question, or <code>null</code> if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion fetchByPrimaryKey(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(surveyQuestionId);
	}

	/**
	* Finds all the survey questions where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the matching survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey(surveyId);
	}

	/**
	* Finds a range of all the survey questions where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param start the lower bound of the range of survey questions to return
	* @param end the upper bound of the range of survey questions to return (not inclusive)
	* @return the range of matching survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey(surveyId, start, end);
	}

	/**
	* Finds an ordered range of all the survey questions where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param start the lower bound of the range of survey questions to return
	* @param end the upper bound of the range of survey questions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurvey(surveyId, start, end, orderByComparator);
	}

	/**
	* Finds the first survey question in the ordered set where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching survey question
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a matching survey question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion findBySurvey_First(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey_First(surveyId, orderByComparator);
	}

	/**
	* Finds the last survey question in the ordered set where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching survey question
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a matching survey question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion findBySurvey_Last(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey_Last(surveyId, orderByComparator);
	}

	/**
	* Finds the survey questions before and after the current survey question in the ordered set where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the primary key of the current survey question
	* @param surveyId the survey id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next survey question
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion[] findBySurvey_PrevAndNext(
		long surveyQuestionId, long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurvey_PrevAndNext(surveyQuestionId, surveyId,
			orderByComparator);
	}

	/**
	* Finds all the survey questions.
	*
	* @return the survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the survey questions.
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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the survey questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey questions to return
	* @param end the upper bound of the range of survey questions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the survey questions where surveyId = &#63; from the database.
	*
	* @param surveyId the survey id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySurvey(surveyId);
	}

	/**
	* Removes all the survey questions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the survey questions where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the number of matching survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySurvey(surveyId);
	}

	/**
	* Counts all the survey questions.
	*
	* @return the number of survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SurveyQuestionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SurveyQuestionPersistence)PortletBeanLocatorUtil.locate(com.jhu.cvrg.portal.survey.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					SurveyQuestionPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(SurveyQuestionPersistence persistence) {
		_persistence = persistence;
	}

	private static SurveyQuestionPersistence _persistence;
}