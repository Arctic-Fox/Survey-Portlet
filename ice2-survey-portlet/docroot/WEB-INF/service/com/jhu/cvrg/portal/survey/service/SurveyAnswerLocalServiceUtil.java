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
 * The utility for the survey answer local service. This utility wraps {@link com.jhu.cvrg.portal.survey.service.impl.SurveyAnswerLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.jhu.cvrg.portal.survey.service.impl.SurveyAnswerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyAnswerLocalService
 * @see com.jhu.cvrg.portal.survey.service.base.SurveyAnswerLocalServiceBaseImpl
 * @see com.jhu.cvrg.portal.survey.service.impl.SurveyAnswerLocalServiceImpl
 * @generated
 */
public class SurveyAnswerLocalServiceUtil {
	/**
	* Adds the survey answer to the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to add
	* @return the survey answer that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer addSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSurveyAnswer(surveyAnswer);
	}

	/**
	* Creates a new survey answer with the primary key. Does not add the survey answer to the database.
	*
	* @param surveyAnswerId the primary key for the new survey answer
	* @return the new survey answer
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer createSurveyAnswer(
		long surveyAnswerId) {
		return getService().createSurveyAnswer(surveyAnswerId);
	}

	/**
	* Deletes the survey answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswerId the primary key of the survey answer to delete
	* @throws PortalException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSurveyAnswer(long surveyAnswerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSurveyAnswer(surveyAnswerId);
	}

	/**
	* Deletes the survey answer from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSurveyAnswer(surveyAnswer);
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
	* Gets the survey answer with the primary key.
	*
	* @param surveyAnswerId the primary key of the survey answer to get
	* @return the survey answer
	* @throws PortalException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer getSurveyAnswer(
		long surveyAnswerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyAnswer(surveyAnswerId);
	}

	/**
	* Gets a range of all the survey answers.
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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> getSurveyAnswers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyAnswers(start, end);
	}

	/**
	* Gets the number of survey answers.
	*
	* @return the number of survey answers
	* @throws SystemException if a system exception occurred
	*/
	public static int getSurveyAnswersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyAnswersCount();
	}

	/**
	* Updates the survey answer in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to update
	* @return the survey answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer updateSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSurveyAnswer(surveyAnswer);
	}

	/**
	* Updates the survey answer in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to update
	* @param merge whether to merge the survey answer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the survey answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer updateSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSurveyAnswer(surveyAnswer, merge);
	}

	public static com.jhu.cvrg.portal.survey.model.SurveyAnswer addSurveyAnswer(
		long surveyQuestionId, long surveyId, long userId,
		java.lang.String answer)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addSurveyAnswer(surveyQuestionId, surveyId, userId, answer);
	}

	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySurvey(surveyId);
	}

	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySurveyQuestion(surveyQuestionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SurveyAnswerLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					SurveyAnswerLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new SurveyAnswerLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(SurveyAnswerLocalService service) {
		_service = service;
	}

	private static SurveyAnswerLocalService _service;
}