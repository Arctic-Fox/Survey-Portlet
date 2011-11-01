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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the survey question local service. This utility wraps {@link com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyQuestionLocalService
 * @see com.jhu.cvrg.portal.survey.service.base.SurveyQuestionLocalServiceBaseImpl
 * @see com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionLocalServiceImpl
 * @generated
 */
public class SurveyQuestionLocalServiceUtil {
	/**
	* Adds the survey question to the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to add
	* @return the survey question that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion addSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSurveyQuestion(surveyQuestion);
	}

	/**
	* Creates a new survey question with the primary key. Does not add the survey question to the database.
	*
	* @param surveyQuestionId the primary key for the new survey question
	* @return the new survey question
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion createSurveyQuestion(
		long surveyQuestionId) {
		return getService().createSurveyQuestion(surveyQuestionId);
	}

	/**
	* Deletes the survey question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionId the primary key of the survey question to delete
	* @throws PortalException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSurveyQuestion(long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSurveyQuestion(surveyQuestionId);
	}

	/**
	* Deletes the survey question from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSurveyQuestion(surveyQuestion);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the survey question with the primary key.
	*
	* @param surveyQuestionId the primary key of the survey question to get
	* @return the survey question
	* @throws PortalException if a survey question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion getSurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyQuestion(surveyQuestionId);
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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> getSurveyQuestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyQuestions(start, end);
	}

	/**
	* Gets the number of survey questions.
	*
	* @return the number of survey questions
	* @throws SystemException if a system exception occurred
	*/
	public static int getSurveyQuestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyQuestionsCount();
	}

	/**
	* Updates the survey question in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to update
	* @return the survey question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion updateSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSurveyQuestion(surveyQuestion);
	}

	/**
	* Updates the survey question in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestion the survey question to update
	* @param merge whether to merge the survey question with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the survey question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion updateSurveyQuestion(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSurveyQuestion(surveyQuestion, merge);
	}

	public static com.jhu.cvrg.portal.survey.model.SurveyQuestion addSurveyQuestion(
		long surveyId, java.lang.String question, int type, int order)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addSurveyQuestion(surveyId, question, type, order);
	}

	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestion> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySurvey(surveyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SurveyQuestionLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					SurveyQuestionLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new SurveyQuestionLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(SurveyQuestionLocalService service) {
		_service = service;
	}

	private static SurveyQuestionLocalService _service;
}