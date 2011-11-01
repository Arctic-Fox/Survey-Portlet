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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author Chris Jurado
 */
public class SurveyQuestionOptionLocalServiceClp
	implements SurveyQuestionOptionLocalService {
	public SurveyQuestionOptionLocalServiceClp(
		ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption addSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addSurveyQuestionOptionMethodKey0,
				surveyQuestionOption);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.jhu.cvrg.portal.survey.model.SurveyQuestionOption)ClpSerializer.translateOutput(returnObj);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption createSurveyQuestionOption(
		long surveyQuestionOptionId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createSurveyQuestionOptionMethodKey1,
				surveyQuestionOptionId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.jhu.cvrg.portal.survey.model.SurveyQuestionOption)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteSurveyQuestionOption(long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteSurveyQuestionOptionMethodKey2,
				surveyQuestionOptionId);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteSurveyQuestionOptionMethodKey3,
				surveyQuestionOption);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
				dynamicQuery, start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
				dynamicQuery, start, end, orderByComparator);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption getSurveyQuestionOption(
		long surveyQuestionOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getSurveyQuestionOptionMethodKey8,
				surveyQuestionOptionId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.jhu.cvrg.portal.survey.model.SurveyQuestionOption)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> getSurveyQuestionOptions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getSurveyQuestionOptionsMethodKey9,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption>)ClpSerializer.translateOutput(returnObj);
	}

	public int getSurveyQuestionOptionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getSurveyQuestionOptionsCountMethodKey10);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateSurveyQuestionOptionMethodKey11,
				surveyQuestionOption);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.jhu.cvrg.portal.survey.model.SurveyQuestionOption)ClpSerializer.translateOutput(returnObj);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption updateSurveyQuestionOption(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateSurveyQuestionOptionMethodKey12,
				surveyQuestionOption, merge);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.jhu.cvrg.portal.survey.model.SurveyQuestionOption)ClpSerializer.translateOutput(returnObj);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption addSurveyQuestionOption(
		long surveyQuestionId, java.lang.String answer, int displayOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addSurveyQuestionOptionMethodKey13,
				surveyQuestionId, answer, displayOrder);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.jhu.cvrg.portal.survey.model.SurveyQuestionOption)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findBySurveyQuestionMethodKey14,
				surveyQuestionId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.jhu.cvrg.portal.survey.model.SurveyQuestionOption>)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addSurveyQuestionOptionMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addSurveyQuestionOption",
			com.jhu.cvrg.portal.survey.model.SurveyQuestionOption.class);
	private MethodKey _createSurveyQuestionOptionMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"createSurveyQuestionOption", long.class);
	private MethodKey _deleteSurveyQuestionOptionMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteSurveyQuestionOption", long.class);
	private MethodKey _deleteSurveyQuestionOptionMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteSurveyQuestionOption",
			com.jhu.cvrg.portal.survey.model.SurveyQuestionOption.class);
	private MethodKey _dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery", com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class);
	private MethodKey _dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class, com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQueryCount",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _getSurveyQuestionOptionMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"getSurveyQuestionOption", long.class);
	private MethodKey _getSurveyQuestionOptionsMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getSurveyQuestionOptions", int.class, int.class);
	private MethodKey _getSurveyQuestionOptionsCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getSurveyQuestionOptionsCount");
	private MethodKey _updateSurveyQuestionOptionMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateSurveyQuestionOption",
			com.jhu.cvrg.portal.survey.model.SurveyQuestionOption.class);
	private MethodKey _updateSurveyQuestionOptionMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateSurveyQuestionOption",
			com.jhu.cvrg.portal.survey.model.SurveyQuestionOption.class,
			boolean.class);
	private MethodKey _addSurveyQuestionOptionMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"addSurveyQuestionOption", long.class, java.lang.String.class,
			int.class);
	private MethodKey _findBySurveyQuestionMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"findBySurveyQuestion", long.class);
}