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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the survey answer service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link SurveyAnswerUtil} to access the survey answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyAnswerPersistenceImpl
 * @see SurveyAnswerUtil
 * @generated
 */
public interface SurveyAnswerPersistence extends BasePersistence<SurveyAnswer> {
	/**
	* Caches the survey answer in the entity cache if it is enabled.
	*
	* @param surveyAnswer the survey answer to cache
	*/
	public void cacheResult(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer);

	/**
	* Caches the survey answers in the entity cache if it is enabled.
	*
	* @param surveyAnswers the survey answers to cache
	*/
	public void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> surveyAnswers);

	/**
	* Creates a new survey answer with the primary key. Does not add the survey answer to the database.
	*
	* @param surveyAnswerId the primary key for the new survey answer
	* @return the new survey answer
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer create(
		long surveyAnswerId);

	/**
	* Removes the survey answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswerId the primary key of the survey answer to remove
	* @return the survey answer that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer remove(
		long surveyAnswerId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.jhu.cvrg.portal.survey.model.SurveyAnswer updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey answer with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException} if it could not be found.
	*
	* @param surveyAnswerId the primary key of the survey answer to find
	* @return the survey answer
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer findByPrimaryKey(
		long surveyAnswerId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyAnswerId the primary key of the survey answer to find
	* @return the survey answer, or <code>null</code> if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer fetchByPrimaryKey(
		long surveyAnswerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the survey answers where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurvey_First(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurvey_Last(
		long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer[] findBySurvey_PrevAndNext(
		long surveyAnswerId, long surveyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the survey answers where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurveyQuestion_First(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer findBySurveyQuestion_Last(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer[] findBySurveyQuestion_PrevAndNext(
		long surveyAnswerId, long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the survey answers.
	*
	* @return the survey answers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey answers where surveyId = &#63; from the database.
	*
	* @param surveyId the survey id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey answers where surveyQuestionId = &#63; from the database.
	*
	* @param surveyQuestionId the survey question id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey answers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the survey answers where surveyId = &#63;.
	*
	* @param surveyId the survey id to search with
	* @return the number of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public int countBySurvey(long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the survey answers where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the number of matching survey answers
	* @throws SystemException if a system exception occurred
	*/
	public int countBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the survey answers.
	*
	* @return the number of survey answers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}