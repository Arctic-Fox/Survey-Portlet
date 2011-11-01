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
 * This class is a wrapper for {@link SurveyQuestion}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       SurveyQuestion
 * @generated
 */
public class SurveyQuestionWrapper implements SurveyQuestion {
	public SurveyQuestionWrapper(SurveyQuestion surveyQuestion) {
		_surveyQuestion = surveyQuestion;
	}

	public long getPrimaryKey() {
		return _surveyQuestion.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_surveyQuestion.setPrimaryKey(pk);
	}

	public long getSurveyQuestionId() {
		return _surveyQuestion.getSurveyQuestionId();
	}

	public void setSurveyQuestionId(long surveyQuestionId) {
		_surveyQuestion.setSurveyQuestionId(surveyQuestionId);
	}

	public long getSurveyId() {
		return _surveyQuestion.getSurveyId();
	}

	public void setSurveyId(long surveyId) {
		_surveyQuestion.setSurveyId(surveyId);
	}

	public java.lang.String getQuestion() {
		return _surveyQuestion.getQuestion();
	}

	public void setQuestion(java.lang.String question) {
		_surveyQuestion.setQuestion(question);
	}

	public int getType() {
		return _surveyQuestion.getType();
	}

	public void setType(int type) {
		_surveyQuestion.setType(type);
	}

	public int getDisplayorder() {
		return _surveyQuestion.getDisplayorder();
	}

	public void setDisplayorder(int displayorder) {
		_surveyQuestion.setDisplayorder(displayorder);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestion toEscapedModel() {
		return _surveyQuestion.toEscapedModel();
	}

	public boolean isNew() {
		return _surveyQuestion.isNew();
	}

	public void setNew(boolean n) {
		_surveyQuestion.setNew(n);
	}

	public boolean isCachedModel() {
		return _surveyQuestion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_surveyQuestion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _surveyQuestion.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_surveyQuestion.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _surveyQuestion.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _surveyQuestion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_surveyQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _surveyQuestion.clone();
	}

	public int compareTo(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion) {
		return _surveyQuestion.compareTo(surveyQuestion);
	}

	public int hashCode() {
		return _surveyQuestion.hashCode();
	}

	public java.lang.String toString() {
		return _surveyQuestion.toString();
	}

	public java.lang.String toXmlString() {
		return _surveyQuestion.toXmlString();
	}

	public SurveyQuestion getWrappedSurveyQuestion() {
		return _surveyQuestion;
	}

	private SurveyQuestion _surveyQuestion;
}