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
 * This class is a wrapper for {@link SurveyQuestionOption}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       SurveyQuestionOption
 * @generated
 */
public class SurveyQuestionOptionWrapper implements SurveyQuestionOption {
	public SurveyQuestionOptionWrapper(
		SurveyQuestionOption surveyQuestionOption) {
		_surveyQuestionOption = surveyQuestionOption;
	}

	public long getPrimaryKey() {
		return _surveyQuestionOption.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_surveyQuestionOption.setPrimaryKey(pk);
	}

	public long getSurveyQuestionOptionId() {
		return _surveyQuestionOption.getSurveyQuestionOptionId();
	}

	public void setSurveyQuestionOptionId(long surveyQuestionOptionId) {
		_surveyQuestionOption.setSurveyQuestionOptionId(surveyQuestionOptionId);
	}

	public long getSurveyQuestionId() {
		return _surveyQuestionOption.getSurveyQuestionId();
	}

	public void setSurveyQuestionId(long surveyQuestionId) {
		_surveyQuestionOption.setSurveyQuestionId(surveyQuestionId);
	}

	public java.lang.String getQuestion() {
		return _surveyQuestionOption.getQuestion();
	}

	public void setQuestion(java.lang.String question) {
		_surveyQuestionOption.setQuestion(question);
	}

	public int getDisplayorder() {
		return _surveyQuestionOption.getDisplayorder();
	}

	public void setDisplayorder(int displayorder) {
		_surveyQuestionOption.setDisplayorder(displayorder);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyQuestionOption toEscapedModel() {
		return _surveyQuestionOption.toEscapedModel();
	}

	public boolean isNew() {
		return _surveyQuestionOption.isNew();
	}

	public void setNew(boolean n) {
		_surveyQuestionOption.setNew(n);
	}

	public boolean isCachedModel() {
		return _surveyQuestionOption.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_surveyQuestionOption.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _surveyQuestionOption.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_surveyQuestionOption.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _surveyQuestionOption.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _surveyQuestionOption.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_surveyQuestionOption.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _surveyQuestionOption.clone();
	}

	public int compareTo(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption) {
		return _surveyQuestionOption.compareTo(surveyQuestionOption);
	}

	public int hashCode() {
		return _surveyQuestionOption.hashCode();
	}

	public java.lang.String toString() {
		return _surveyQuestionOption.toString();
	}

	public java.lang.String toXmlString() {
		return _surveyQuestionOption.toXmlString();
	}

	public SurveyQuestionOption getWrappedSurveyQuestionOption() {
		return _surveyQuestionOption;
	}

	private SurveyQuestionOption _surveyQuestionOption;
}