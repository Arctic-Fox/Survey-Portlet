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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Chris Jurado
 */
public class SurveyClp extends BaseModelImpl<Survey> implements Survey {
	public SurveyClp() {
	}

	public long getPrimaryKey() {
		return _surveyId;
	}

	public void setPrimaryKey(long pk) {
		setSurveyId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_surveyId);
	}

	public long getSurveyId() {
		return _surveyId;
	}

	public void setSurveyId(long surveyId) {
		_surveyId = surveyId;
	}

	public long getCommunityId() {
		return _communityId;
	}

	public void setCommunityId(long communityId) {
		_communityId = communityId;
	}

	public String getSurveyName() {
		return _surveyName;
	}

	public void setSurveyName(String surveyName) {
		_surveyName = surveyName;
	}

	public Survey toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (Survey)Proxy.newProxyInstance(Survey.class.getClassLoader(),
				new Class[] { Survey.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		SurveyClp clone = new SurveyClp();

		clone.setSurveyId(getSurveyId());
		clone.setCommunityId(getCommunityId());
		clone.setSurveyName(getSurveyName());

		return clone;
	}

	public int compareTo(Survey survey) {
		long pk = survey.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SurveyClp survey = null;

		try {
			survey = (SurveyClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = survey.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{surveyId=");
		sb.append(getSurveyId());
		sb.append(", communityId=");
		sb.append(getCommunityId());
		sb.append(", surveyName=");
		sb.append(getSurveyName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.jhu.cvrg.portal.survey.model.Survey");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>surveyId</column-name><column-value><![CDATA[");
		sb.append(getSurveyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>communityId</column-name><column-value><![CDATA[");
		sb.append(getCommunityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surveyName</column-name><column-value><![CDATA[");
		sb.append(getSurveyName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _surveyId;
	private long _communityId;
	private String _surveyName;
}