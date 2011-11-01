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
 * The utility for the survey question option local service. This utility wraps {@link com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionOptionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionOptionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyQuestionOptionLocalService
 * @see com.jhu.cvrg.portal.survey.service.base.SurveyQuestionOptionLocalServiceBaseImpl
 * @see com.jhu.cvrg.portal.survey.service.impl.SurveyQuestionOptionLocalServiceImpl
 * @generated
 */
public class SurveyQuestionOptionLocalServiceUtil {
	/**
	* Adds the survey question option to the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to add
	* @return the survey question option that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption addSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSurveyQuestionOption(surveyQuestionOption);
	}

	/**
	* Creates a new survey question option with the primary key. Does not add the survey question option to the database.
	*
	* @param surveyQuestionOptionId the primary key for the new survey question option
	* @return the new survey question option
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption createSurveyQuestionOption(
		long surveyQuestionOptionId) {
		return getService().createSurveyQuestionOption(surveyQuestionOptionId);
	}

	/**
	* Deletes the survey question option with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to delete
	* @throws PortalException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSurveyQuestionOption(long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSurveyQuestionOption(surveyQuestionOptionId);
	}

	/**
	* Deletes the survey question option from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSurveyQuestionOption(surveyQuestionOption);
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
	* Gets the survey question option with the primary key.
	*
	* @param surveyQuestionOptionId the primary key of the survey question option to get
	* @return the survey question option
	* @throws PortalException if a survey question option with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption getSurveyQuestionOption(
		long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyQuestionOption(surveyQuestionOptionId);
	}

	/**
	* Gets a range of all the survey question options.
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
	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> getSurveyQuestionOptions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyQuestionOptions(start, end);
	}

	/**
	* Gets the number of survey question options.
	*
	* @return the number of survey question options
	* @throws SystemException if a system exception occurred
	*/
	public static int getSurveyQuestionOptionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSurveyQuestionOptionsCount();
	}

	/**
	* Updates the survey question option in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to update
	* @return the survey question option that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSurveyQuestionOption(surveyQuestionOption);
	}

	/**
	* Updates the survey question option in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyQuestionOption the survey question option to update
	* @param merge whether to merge the survey question option with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the survey question option that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateSurveyQuestionOption(surveyQuestionOption, merge);
	}

	public static com.jhu.cvrg.portal.survey.model.SurveyQuestionOption addSurveyQuestionOption(
		long surveyQuestionId, java.lang.String answer, int displayOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addSurveyQuestionOption(surveyQuestionId, answer,
			displayOrder);
	}

	public static java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySurveyQuestion(surveyQuestionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SurveyQuestionOptionLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					SurveyQuestionOptionLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new SurveyQuestionOptionLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(SurveyQuestionOptionLocalService service) {
		_service = service;
	}

	private static SurveyQuestionOptionLocalService _service;
}