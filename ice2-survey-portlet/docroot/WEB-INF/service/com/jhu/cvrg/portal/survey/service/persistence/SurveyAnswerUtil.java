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

import com.jhu.cvrg.portal.survey.model.SurveyAnswer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the survey answer service. This utility wraps {@link SurveyAnswerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see SurveyAnswerPersistence
 * @see SurveyAnswerPersistenceImpl
 * @generated
 */
public class SurveyAnswerUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(SurveyAnswer surveyAnswer) {
		getPersistence().clearCache(surveyAnswer);
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
	public static List<SurveyAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SurveyAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SurveyAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static SurveyAnswer remove(SurveyAnswer surveyAnswer)
		throws SystemException {
		return getPersistence().remove(surveyAnswer);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SurveyAnswer update(SurveyAnswer surveyAnswer, boolean merge)
		throws SystemException {
		return getPersistence().update(surveyAnswer, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SurveyAnswer update(SurveyAnswer surveyAnswer, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(surveyAnswer, merge, serviceContext);
	}

	/**
	* Caches the survey answer in the entity cache if it is enabled.
	*
	* @param surveyAnswer the survey answer to cache
	*/
	public static void cacheResult(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer) {
		getPersistence().cacheResult(surveyAnswer);
	}

	/**
	* Caches the survey answers in the entity cache if it is enabled.
	*
	* @param surveyAnswers the survey answers to cache
	*/
	public static void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> surveyAnswers) {
		getPersistence().cacheResult(surveyAnswers);
	}

	/**
	* Creates a new survey answer with the primary key. Does not add the survey answer to the database.
	*
	* @param surveyAnswerId the primary key for the new survey answer
	* @return the new survey answer
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer create(
		long surveyAnswerId) {
		return getPersistence().create(surveyAnswerId);
	}

	/**
	* Removes the survey answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswerId the primary key of the survey answer to remove
	* @return the survey answer that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer remove(
		long surveyAnswerId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(surveyAnswerId);
	}

	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(surveyAnswer, merge);
	}

	/**
	* Finds the survey answer with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException} if it could not be found.
	*
	* @param surveyAnswerId the primary key of the survey answer to find
	* @return the survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer findByPrimaryKey(
		long surveyAnswerId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(surveyAnswerId);
	}

	/**
	* Finds the survey answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyAnswerId the primary key of the survey answer to find
	* @return the survey answer, or <code>null</code> if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer fetchByPrimaryKey(
		long surveyAnswerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(surveyAnswerId);
	}

	/**
	* Finds all the survey answers where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey(surveyId);
	}

	/**
	* Finds a range of all the survey answers where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param start the lower bound of the range of survey answers to return
	* @param end the upper bound of the range of survey answers to return (not inclusive)
	* @return the range of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey(surveyId, start, end);
	}

	/**
	* Finds an ordered range of all the survey answers where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param start the lower bound of the range of survey answers to return
	* @param end the upper bound of the range of survey answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurvey(surveyId, start, end, orderByComparator);
	}

	/**
	* Finds the first survey answer in the ordered set where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurvey_First(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey_First(surveyId, orderByComparator);
	}

	/**
	* Finds the last survey answer in the ordered set where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyId the survey id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurvey_Last(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurvey_Last(surveyId, orderByComparator);
	}

	/**
	* Finds the survey answers before and after the current survey answer in the ordered set where surveyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyAnswerId the primary key of the current survey answer
	* @param surveyId the survey id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer[] findBySurvey_PrevAndNext(
		long surveyAnswerId, long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurvey_PrevAndNext(surveyAnswerId, surveyId,
			orderByComparator);
	}

	/**
	* Finds all the survey answers where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySurveyQuestion(surveyQuestionId);
	}

	/**
	* Finds a range of all the survey answers where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param start the lower bound of the range of survey answers to return
	* @param end the upper bound of the range of survey answers to return (not inclusive)
	* @return the range of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion(surveyQuestionId, start, end);
	}

	/**
	* Finds an ordered range of all the survey answers where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param start the lower bound of the range of survey answers to return
	* @param end the upper bound of the range of survey answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion(surveyQuestionId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first survey answer in the ordered set where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurveyQuestion_First(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion_First(surveyQuestionId,
			orderByComparator);
	}

	/**
	* Finds the last survey answer in the ordered set where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyQuestionId the survey question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurveyQuestion_Last(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion_Last(surveyQuestionId,
			orderByComparator);
	}

	/**
	* Finds the survey answers before and after the current survey answer in the ordered set where surveyQuestionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param surveyAnswerId the primary key of the current survey answer
	* @param surveyQuestionId the survey question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer[] findBySurveyQuestion_PrevAndNext(
		long surveyAnswerId, long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySurveyQuestion_PrevAndNext(surveyAnswerId,
			surveyQuestionId, orderByComparator);
	}

	/**
	* Finds all the survey answers.
	*
	* @return the survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the survey answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey answers to return
	* @param end the upper bound of the range of survey answers to return (not inclusive)
	* @return the range of survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the survey answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey answers to return
	* @param end the upper bound of the range of survey answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the survey answers where surveyId = &#63; from the database.
	*
	* @param surveyId the survey id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySurvey(surveyId);
	}

	/**
	* Removes all the survey answers where surveyQuestionId = &#63; from the database.
	*
	* @param surveyQuestionId the survey question id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySurveyQuestion(surveyQuestionId);
	}

	/**
	* Removes all the survey answers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the survey answers where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the number of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySurvey(surveyId);
	}

	/**
	* Counts all the survey answers where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the number of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySurveyQuestion(surveyQuestionId);
	}

	/**
	* Counts all the survey answers.
	*
	* @return the number of survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SurveyAnswerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SurveyAnswerPersistence)PortletBeanLocatorUtil.locate(com.jhu.cvrg.portal.survey.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					SurveyAnswerPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(SurveyAnswerPersistence persistence) {
		_persistence = persistence;
	}

	private static SurveyAnswerPersistence _persistence;
}