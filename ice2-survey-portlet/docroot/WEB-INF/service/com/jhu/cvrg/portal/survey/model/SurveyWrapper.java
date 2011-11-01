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
 * This class is a wrapper for {@link Survey}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       Survey
 * @generated
 */
public class SurveyWrapper implements Survey {
	public SurveyWrapper(Survey survey) {
		_survey = survey;
	}

	public long getPrimaryKey() {
		return _survey.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_survey.setPrimaryKey(pk);
	}

	public long getSurveyId() {
		return _survey.getSurveyId();
	}

	public void setSurveyId(long surveyId) {
		_survey.setSurveyId(surveyId);
	}

	public long getCommunityId() {
		return _survey.getCommunityId();
	}

	public void setCommunityId(long communityId) {
		_survey.setCommunityId(communityId);
	}

	public java.lang.String getSurveyName() {
		return _survey.getSurveyName();
	}

	public void setSurveyName(java.lang.String surveyName) {
		_survey.setSurveyName(surveyName);
	}

	public com.jhu.cvrg.portal.survey.model.Survey toEscapedModel() {
		return _survey.toEscapedModel();
	}

	public boolean isNew() {
		return _survey.isNew();
	}

	public void setNew(boolean n) {
		_survey.setNew(n);
	}

	public boolean isCachedModel() {
		return _survey.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_survey.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _survey.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_survey.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _survey.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _survey.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_survey.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _survey.clone();
	}

	public int compareTo(com.jhu.cvrg.portal.survey.model.Survey survey) {
		return _survey.compareTo(survey);
	}

	public int hashCode() {
		return _survey.hashCode();
	}

	public java.lang.String toString() {
		return _survey.toString();
	}

	public java.lang.String toXmlString() {
		return _survey.toXmlString();
	}

	public Survey getWrappedSurvey() {
		return _survey;
	}

	private Survey _survey;
}