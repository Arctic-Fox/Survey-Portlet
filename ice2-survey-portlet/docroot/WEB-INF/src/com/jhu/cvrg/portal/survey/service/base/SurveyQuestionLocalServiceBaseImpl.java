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

package com.jhu.cvrg.portal.survey.service.base;

import com.jhu.cvrg.portal.survey.model.SurveyQuestion;
import com.jhu.cvrg.portal.survey.service.SurveyAnswerLocalService;
import com.jhu.cvrg.portal.survey.service.SurveyLocalService;
import com.jhu.cvrg.portal.survey.service.SurveyQuestionLocalService;
import com.jhu.cvrg.portal.survey.service.SurveyQuestionOptionLocalService;
import com.jhu.cvrg.portal.survey.service.persistence.SurveyAnswerPersistence;
import com.jhu.cvrg.portal.survey.service.persistence.SurveyPersistence;
import com.jhu.cvrg.portal.survey.service.persistence.SurveyQuestionOptionPersistence;
import com.jhu.cvrg.portal.survey.service.persistence.SurveyQuestionPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the survey question local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.jhu.cvrg.portal.survey.service.SurveyQuestionLocalServiceUtil} to access the survey question local service.
 * </p>
 *
 * @author Chris Jurado
 * @see com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionLocalServiceImpl
 * @see com.jhu.cvrg.portal.survey.service.SurveyQuestionLocalServiceUtil
 * @generated
 */
public abstract class SurveyQuestionLocalServiceBaseImpl
	implements SurveyQuestionLocalService {
	/**
	 * Adds the survey question to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyQuestion the survey question to add
	 * @return the survey question that was added
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion addSurveyQuestion(SurveyQuestion surveyQuestion)
		throws SystemException {
		surveyQuestion.setNew(true);

		return surveyQuestionPersistence.update(surveyQuestion, false);
	}

	/**
	 * Creates a new survey question with the primary key. Does not add the survey question to the database.
	 *
	 * @param surveyQuestionId the primary key for the new survey question
	 * @return the new survey question
	 */
	public SurveyQuestion createSurveyQuestion(long surveyQuestionId) {
		return surveyQuestionPersistence.create(surveyQuestionId);
	}

	/**
	 * Deletes the survey question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyQuestionId the primary key of the survey question to delete
	 * @throws PortalException if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteSurveyQuestion(long surveyQuestionId)
		throws PortalException, SystemException {
		surveyQuestionPersistence.remove(surveyQuestionId);
	}

	/**
	 * Deletes the survey question from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyQuestion the survey question to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteSurveyQuestion(SurveyQuestion surveyQuestion)
		throws SystemException {
		surveyQuestionPersistence.remove(surveyQuestion);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return surveyQuestionPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return surveyQuestionPersistence.findWithDynamicQuery(dynamicQuery,
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return surveyQuestionPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return surveyQuestionPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the survey question with the primary key.
	 *
	 * @param surveyQuestionId the primary key of the survey question to get
	 * @return the survey question
	 * @throws PortalException if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion getSurveyQuestion(long surveyQuestionId)
		throws PortalException, SystemException {
		return surveyQuestionPersistence.findByPrimaryKey(surveyQuestionId);
	}

	/**
	 * Gets a range of all the survey questions.
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
	public List<SurveyQuestion> getSurveyQuestions(int start, int end)
		throws SystemException {
		return surveyQuestionPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of survey questions.
	 *
	 * @return the number of survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public int getSurveyQuestionsCount() throws SystemException {
		return surveyQuestionPersistence.countAll();
	}

	/**
	 * Updates the survey question in the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyQuestion the survey question to update
	 * @return the survey question that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion updateSurveyQuestion(SurveyQuestion surveyQuestion)
		throws SystemException {
		surveyQuestion.setNew(false);

		return surveyQuestionPersistence.update(surveyQuestion, true);
	}

	/**
	 * Updates the survey question in the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyQuestion the survey question to update
	 * @param merge whether to merge the survey question with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the survey question that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion updateSurveyQuestion(SurveyQuestion surveyQuestion,
		boolean merge) throws SystemException {
		surveyQuestion.setNew(false);

		return surveyQuestionPersistence.update(surveyQuestion, merge);
	}

	/**
	 * Gets the survey question local service.
	 *
	 * @return the survey question local service
	 */
	public SurveyQuestionLocalService getSurveyQuestionLocalService() {
		return surveyQuestionLocalService;
	}

	/**
	 * Sets the survey question local service.
	 *
	 * @param surveyQuestionLocalService the survey question local service
	 */
	public void setSurveyQuestionLocalService(
		SurveyQuestionLocalService surveyQuestionLocalService) {
		this.surveyQuestionLocalService = surveyQuestionLocalService;
	}

	/**
	 * Gets the survey question persistence.
	 *
	 * @return the survey question persistence
	 */
	public SurveyQuestionPersistence getSurveyQuestionPersistence() {
		return surveyQuestionPersistence;
	}

	/**
	 * Sets the survey question persistence.
	 *
	 * @param surveyQuestionPersistence the survey question persistence
	 */
	public void setSurveyQuestionPersistence(
		SurveyQuestionPersistence surveyQuestionPersistence) {
		this.surveyQuestionPersistence = surveyQuestionPersistence;
	}

	/**
	 * Gets the survey question option local service.
	 *
	 * @return the survey question option local service
	 */
	public SurveyQuestionOptionLocalService getSurveyQuestionOptionLocalService() {
		return surveyQuestionOptionLocalService;
	}

	/**
	 * Sets the survey question option local service.
	 *
	 * @param surveyQuestionOptionLocalService the survey question option local service
	 */
	public void setSurveyQuestionOptionLocalService(
		SurveyQuestionOptionLocalService surveyQuestionOptionLocalService) {
		this.surveyQuestionOptionLocalService = surveyQuestionOptionLocalService;
	}

	/**
	 * Gets the survey question option persistence.
	 *
	 * @return the survey question option persistence
	 */
	public SurveyQuestionOptionPersistence getSurveyQuestionOptionPersistence() {
		return surveyQuestionOptionPersistence;
	}

	/**
	 * Sets the survey question option persistence.
	 *
	 * @param surveyQuestionOptionPersistence the survey question option persistence
	 */
	public void setSurveyQuestionOptionPersistence(
		SurveyQuestionOptionPersistence surveyQuestionOptionPersistence) {
		this.surveyQuestionOptionPersistence = surveyQuestionOptionPersistence;
	}

	/**
	 * Gets the survey answer local service.
	 *
	 * @return the survey answer local service
	 */
	public SurveyAnswerLocalService getSurveyAnswerLocalService() {
		return surveyAnswerLocalService;
	}

	/**
	 * Sets the survey answer local service.
	 *
	 * @param surveyAnswerLocalService the survey answer local service
	 */
	public void setSurveyAnswerLocalService(
		SurveyAnswerLocalService surveyAnswerLocalService) {
		this.surveyAnswerLocalService = surveyAnswerLocalService;
	}

	/**
	 * Gets the survey answer persistence.
	 *
	 * @return the survey answer persistence
	 */
	public SurveyAnswerPersistence getSurveyAnswerPersistence() {
		return surveyAnswerPersistence;
	}

	/**
	 * Sets the survey answer persistence.
	 *
	 * @param surveyAnswerPersistence the survey answer persistence
	 */
	public void setSurveyAnswerPersistence(
		SurveyAnswerPersistence surveyAnswerPersistence) {
		this.surveyAnswerPersistence = surveyAnswerPersistence;
	}

	/**
	 * Gets the survey local service.
	 *
	 * @return the survey local service
	 */
	public SurveyLocalService getSurveyLocalService() {
		return surveyLocalService;
	}

	/**
	 * Sets the survey local service.
	 *
	 * @param surveyLocalService the survey local service
	 */
	public void setSurveyLocalService(SurveyLocalService surveyLocalService) {
		this.surveyLocalService = surveyLocalService;
	}

	/**
	 * Gets the survey persistence.
	 *
	 * @return the survey persistence
	 */
	public SurveyPersistence getSurveyPersistence() {
		return surveyPersistence;
	}

	/**
	 * Sets the survey persistence.
	 *
	 * @param surveyPersistence the survey persistence
	 */
	public void setSurveyPersistence(SurveyPersistence surveyPersistence) {
		this.surveyPersistence = surveyPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = surveyQuestionPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = SurveyQuestionLocalService.class)
	protected SurveyQuestionLocalService surveyQuestionLocalService;
	@BeanReference(type = SurveyQuestionPersistence.class)
	protected SurveyQuestionPersistence surveyQuestionPersistence;
	@BeanReference(type = SurveyQuestionOptionLocalService.class)
	protected SurveyQuestionOptionLocalService surveyQuestionOptionLocalService;
	@BeanReference(type = SurveyQuestionOptionPersistence.class)
	protected SurveyQuestionOptionPersistence surveyQuestionOptionPersistence;
	@BeanReference(type = SurveyAnswerLocalService.class)
	protected SurveyAnswerLocalService surveyAnswerLocalService;
	@BeanReference(type = SurveyAnswerPersistence.class)
	protected SurveyAnswerPersistence surveyAnswerPersistence;
	@BeanReference(type = SurveyLocalService.class)
	protected SurveyLocalService surveyLocalService;
	@BeanReference(type = SurveyPersistence.class)
	protected SurveyPersistence surveyPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}