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
public class SurveyQuestionOptionClp extends BaseModelImpl<SurveyQuestionOption>
	implements SurveyQuestionOption {
	public SurveyQuestionOptionClp() {
	}

	public long getPrimaryKey() {
		return _surveyQuestionOptionId;
	}

	public void setPrimaryKey(long pk) {
		setSurveyQuestionOptionId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_surveyQuestionOptionId);
	}

	public long getSurveyQuestionOptionId() {
		return _surveyQuestionOptionId;
	}

	public void setSurveyQuestionOptionId(long surveyQuestionOptionId) {
		_surveyQuestionOptionId = surveyQuestionOptionId;
	}

	public long getSurveyQuestionId() {
		return _surveyQuestionId;
	}

	public void setSurveyQuestionId(long surveyQuestionId) {
		_surveyQuestionId = surveyQuestionId;
	}

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public int getDisplayorder() {
		return _displayorder;
	}

	public void setDisplayorder(int displayorder) {
		_displayorder = displayorder;
	}

	public SurveyQuestionOption toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (SurveyQuestionOption)Proxy.newProxyInstance(SurveyQuestionOption.class.getClassLoader(),
				new Class[] { SurveyQuestionOption.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		SurveyQuestionOptionClp clone = new SurveyQuestionOptionClp();

		clone.setSurveyQuestionOptionId(getSurveyQuestionOptionId());
		clone.setSurveyQuestionId(getSurveyQuestionId());
		clone.setQuestion(getQuestion());
		clone.setDisplayorder(getDisplayorder());

		return clone;
	}

	public int compareTo(SurveyQuestionOption surveyQuestionOption) {
		long pk = surveyQuestionOption.getPrimaryKey();

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

		SurveyQuestionOptionClp surveyQuestionOption = null;

		try {
			surveyQuestionOption = (SurveyQuestionOptionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = surveyQuestionOption.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{surveyQuestionOptionId=");
		sb.append(getSurveyQuestionOptionId());
		sb.append(", surveyQuestionId=");
		sb.append(getSurveyQuestionId());
		sb.append(", question=");
		sb.append(getQuestion());
		sb.append(", displayorder=");
		sb.append(getDisplayorder());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.jhu.cvrg.portal.survey.model.SurveyQuestionOption");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>surveyQuestionOptionId</column-name><column-value><![CDATA[");
		sb.append(getSurveyQuestionOptionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surveyQuestionId</column-name><column-value><![CDATA[");
		sb.append(getSurveyQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>question</column-name><column-value><![CDATA[");
		sb.append(getQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displayorder</column-name><column-value><![CDATA[");
		sb.append(getDisplayorder());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _surveyQuestionOptionId;
	private long _surveyQuestionId;
	private String _question;
	private int _displayorder;
}