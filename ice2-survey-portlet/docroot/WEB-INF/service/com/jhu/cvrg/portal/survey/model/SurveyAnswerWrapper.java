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

package com.jhu.cvrg.portal.survey.model;

/**
 * <p>
 * This class is a wrapper for {@link SurveyAnswer}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       SurveyAnswer
 * @generated
 */
public class SurveyAnswerWrapper implements SurveyAnswer {
	public SurveyAnswerWrapper(SurveyAnswer surveyAnswer) {
		_surveyAnswer = surveyAnswer;
	}

	public long getPrimaryKey() {
		return _surveyAnswer.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_surveyAnswer.setPrimaryKey(pk);
	}

	public long getSurveyAnswerId() {
		return _surveyAnswer.getSurveyAnswerId();
	}

	public void setSurveyAnswerId(long surveyAnswerId) {
		_surveyAnswer.setSurveyAnswerId(surveyAnswerId);
	}

	public long getSurveyQuestionId() {
		return _surveyAnswer.getSurveyQuestionId();
	}

	public void setSurveyQuestionId(long surveyQuestionId) {
		_surveyAnswer.setSurveyQuestionId(surveyQuestionId);
	}

	public long getSurveyId() {
		return _surveyAnswer.getSurveyId();
	}

	public void setSurveyId(long surveyId) {
		_surveyAnswer.setSurveyId(surveyId);
	}

	public long getUserId() {
		return _surveyAnswer.getUserId();
	}

	public void setUserId(long userId) {
		_surveyAnswer.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswer.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_surveyAnswer.setUserUuid(userUuid);
	}

	public java.lang.String getAnswer() {
		return _surveyAnswer.getAnswer();
	}

	public void setAnswer(java.lang.String answer) {
		_surveyAnswer.setAnswer(answer);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyAnswer toEscapedModel() {
		return _surveyAnswer.toEscapedModel();
	}

	public boolean isNew() {
		return _surveyAnswer.isNew();
	}

	public void setNew(boolean n) {
		_surveyAnswer.setNew(n);
	}

	public boolean isCachedModel() {
		return _surveyAnswer.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_surveyAnswer.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _surveyAnswer.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_surveyAnswer.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _surveyAnswer.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _surveyAnswer.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_surveyAnswer.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _surveyAnswer.clone();
	}

	public int compareTo(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer) {
		return _surveyAnswer.compareTo(surveyAnswer);
	}

	public int hashCode() {
		return _surveyAnswer.hashCode();
	}

	public java.lang.String toString() {
		return _surveyAnswer.toString();
	}

	public java.lang.String toXmlString() {
		return _surveyAnswer.toXmlString();
	}

	public SurveyAnswer getWrappedSurveyAnswer() {
		return _surveyAnswer;
	}

	private SurveyAnswer _surveyAnswer;
}