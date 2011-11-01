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

import com.jhu.cvrg.portal.survey.model.SurveyAnswerClp;
import com.jhu.cvrg.portal.survey.model.SurveyClp;
import com.jhu.cvrg.portal.survey.model.SurveyQuestionClp;
import com.jhu.cvrg.portal.survey.model.SurveyQuestionOptionClp;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "ice2-survey-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(SurveyQuestionClp.class.getName())) {
			SurveyQuestionClp oldCplModel = (SurveyQuestionClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSurveyQuestionId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getSurveyQuestionId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSurveyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getSurveyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setQuestion",
							new Class[] { String.class });

					String value2 = oldCplModel.getQuestion();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setType",
							new Class[] { Integer.TYPE });

					Integer value3 = new Integer(oldCplModel.getType());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setDisplayorder",
							new Class[] { Integer.TYPE });

					Integer value4 = new Integer(oldCplModel.getDisplayorder());

					method4.invoke(newModel, value4);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(SurveyQuestionOptionClp.class.getName())) {
			SurveyQuestionOptionClp oldCplModel = (SurveyQuestionOptionClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionOptionImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSurveyQuestionOptionId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getSurveyQuestionOptionId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSurveyQuestionId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getSurveyQuestionId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setQuestion",
							new Class[] { String.class });

					String value2 = oldCplModel.getQuestion();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setDisplayorder",
							new Class[] { Integer.TYPE });

					Integer value3 = new Integer(oldCplModel.getDisplayorder());

					method3.invoke(newModel, value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(SurveyAnswerClp.class.getName())) {
			SurveyAnswerClp oldCplModel = (SurveyAnswerClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSurveyAnswerId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getSurveyAnswerId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSurveyQuestionId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getSurveyQuestionId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setSurveyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getSurveyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setAnswer",
							new Class[] { String.class });

					String value4 = oldCplModel.getAnswer();

					method4.invoke(newModel, value4);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(SurveyClp.class.getName())) {
			SurveyClp oldCplModel = (SurveyClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.jhu.cvrg.portal.survey.model.impl.SurveyImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSurveyId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getSurveyId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCommunityId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCommunityId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setSurveyName",
							new Class[] { String.class });

					String value2 = oldCplModel.getSurveyName();

					method2.invoke(newModel, value2);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					SurveyQuestionClp newModel = new SurveyQuestionClp();

					Method method0 = oldModelClass.getMethod(
							"getSurveyQuestionId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setSurveyQuestionId(value0);

					Method method1 = oldModelClass.getMethod("getSurveyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setSurveyId(value1);

					Method method2 = oldModelClass.getMethod("getQuestion");

					String value2 = (String)method2.invoke(oldModel,
							(Object[])null);

					newModel.setQuestion(value2);

					Method method3 = oldModelClass.getMethod("getType");

					Integer value3 = (Integer)method3.invoke(oldModel,
							(Object[])null);

					newModel.setType(value3);

					Method method4 = oldModelClass.getMethod("getDisplayorder");

					Integer value4 = (Integer)method4.invoke(oldModel,
							(Object[])null);

					newModel.setDisplayorder(value4);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionOptionImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					SurveyQuestionOptionClp newModel = new SurveyQuestionOptionClp();

					Method method0 = oldModelClass.getMethod(
							"getSurveyQuestionOptionId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setSurveyQuestionOptionId(value0);

					Method method1 = oldModelClass.getMethod(
							"getSurveyQuestionId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setSurveyQuestionId(value1);

					Method method2 = oldModelClass.getMethod("getQuestion");

					String value2 = (String)method2.invoke(oldModel,
							(Object[])null);

					newModel.setQuestion(value2);

					Method method3 = oldModelClass.getMethod("getDisplayorder");

					Integer value3 = (Integer)method3.invoke(oldModel,
							(Object[])null);

					newModel.setDisplayorder(value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					SurveyAnswerClp newModel = new SurveyAnswerClp();

					Method method0 = oldModelClass.getMethod(
							"getSurveyAnswerId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setSurveyAnswerId(value0);

					Method method1 = oldModelClass.getMethod(
							"getSurveyQuestionId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setSurveyQuestionId(value1);

					Method method2 = oldModelClass.getMethod("getSurveyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setSurveyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getAnswer");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setAnswer(value4);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.jhu.cvrg.portal.survey.model.impl.SurveyImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					SurveyClp newModel = new SurveyClp();

					Method method0 = oldModelClass.getMethod("getSurveyId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setSurveyId(value0);

					Method method1 = oldModelClass.getMethod("getCommunityId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCommunityId(value1);

					Method method2 = oldModelClass.getMethod("getSurveyName");

					String value2 = (String)method2.invoke(oldModel,
							(Object[])null);

					newModel.setSurveyName(value2);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}