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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the survey question service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link SurveyQuestionUtil} to access the survey question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyQuestionPersistenceImpl
 * @see SurveyQuestionUtil
 * @generated
 */
public interface SurveyQuestionPersistence extends BasePersistence<SurveyQuestion> {
	/**
	* Caches the survey question in the entity cache if it is enabled.
	*
	* @param surveyQuestion the survey question to cache
	*/
	public void cacheResult(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion);

	/**
	* Caches the survey questions in the entity cache if it is enabled.
	*
	* @param surveyQuestions the survey questions to cache
	*/
	public void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> surveyQuestions);

	/**
	* Creates a new survey question with the primary key. Does not add the survey question to the database.
	*
	* @param surveyQuestionId the primary key for the new survey question
	* @return the new survey question
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion create(
		long surveyQuestionId);

	/**
	* Removes the survey question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionId the primary key of the survey question to remove
	* @return the survey question that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion remove(
		long surveyQuestionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.jhu.cvrg.portal.survey.model.SurveyQuestion updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey question with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException} if it could not be found.
	*
	* @param surveyQuestionId the primary key of the survey question to find
	* @return the survey question
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion findByPrimaryKey(
		long surveyQuestionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyQuestionId the primary key of the survey question to find
	* @return the survey question, or <code>null</code> if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion fetchByPrimaryKey(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the survey questions where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the matching survey questions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion findBySurvey_First(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion findBySurvey_Last(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyQuestion[] findBySurvey_PrevAndNext(
		long surveyQuestionId, long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the survey questions.
	*
	* @return the survey questions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey questions where surveyId = &#63; from the database.
	*
	* @param surveyId the survey id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey questions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the survey questions where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the number of matching survey questions
	* @throws SystemException if a system exception occurred
	*/
	public int countBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the survey questions.
	*
	* @return the number of survey questions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}