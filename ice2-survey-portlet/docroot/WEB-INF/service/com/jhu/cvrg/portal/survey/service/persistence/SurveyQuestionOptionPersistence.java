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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the survey question option service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link SurveyQuestionOptionUtil} to access the survey question option persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyQuestionOptionPersistenceImpl
 * @see SurveyQuestionOptionUtil
 * @generated
 */
public interface SurveyQuestionOptionPersistence extends BasePersistence<SurveyQuestionOption> {
	/**
	* Caches the survey question option in the entity cache if it is enabled.
	*
	* @param surveyQuestionOption the survey question option to cache
	*/
	public void cacheResult(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption);

	/**
	* Caches the survey question options in the entity cache if it is enabled.
	*
	* @param surveyQuestionOptions the survey question options to cache
	*/
	public void cacheResult(
		java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> surveyQuestionOptions);

	/**
	* Creates a new survey question option with the primary key. Does not add the survey question option to the database.
	*
	* @param surveyQuestionOptionId the primary key for the new survey question option
	* @return the new survey question option
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption create(
		long surveyQuestionOptionId);

	/**
	* Removes the survey question option with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to remove
	* @return the survey question option that was removed
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption remove(
		long surveyQuestionOptionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey question option with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException} if it could not be found.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to find
	* @return the survey question option
	* @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption findByPrimaryKey(
		long surveyQuestionOptionId)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the survey question option with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to find
	* @return the survey question option, or <code>null</code> if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption fetchByPrimaryKey(
		long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the survey question options where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the matching survey question options
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption findBySurveyQuestion_First(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption findBySurveyQuestion_Last(
		long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption[] findBySurveyQuestion_PrevAndNext(
		long surveyQuestionOptionId, long surveyQuestionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the survey question options.
	*
	* @return the survey question options
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey question options where surveyQuestionId = &#63; from the database.
	*
	* @param surveyQuestionId the survey question id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey question options from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the survey question options where surveyQuestionId = &#63;.
	*
	* @param surveyQuestionId the survey question id to search with
	* @return the number of matching survey question options
	* @throws SystemException if a system exception occurred
	*/
	public int countBySurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the survey question options.
	*
	* @return the number of survey question options
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}