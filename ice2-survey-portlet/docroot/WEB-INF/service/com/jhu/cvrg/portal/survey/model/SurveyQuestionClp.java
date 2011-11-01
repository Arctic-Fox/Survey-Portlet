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
public class SurveyQuestionClp extends BaseModelImpl<SurveyQuestion>
	implements SurveyQuestion {
	public SurveyQuestionClp() {
	}

	public long getPrimaryKey() {
		return _surveyQuestionId;
	}

	public void setPrimaryKey(long pk) {
		setSurveyQuestionId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_surveyQuestionId);
	}

	public long getSurveyQuestionId() {
		return _surveyQuestionId;
	}

	public void setSurveyQuestionId(long surveyQuestionId) {
		_surveyQuestionId = surveyQuestionId;
	}

	public long getSurveyId() {
		return _surveyId;
	}

	public void setSurveyId(long surveyId) {
		_surveyId = surveyId;
	}

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public int getDisplayorder() {
		return _displayorder;
	}

	public void setDisplayorder(int displayorder) {
		_displayorder = displayorder;
	}

	public SurveyQuestion toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (SurveyQuestion)Proxy.newProxyInstance(SurveyQuestion.class.getClassLoader(),
				new Class[] { SurveyQuestion.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		SurveyQuestionClp clone = new SurveyQuestionClp();

		clone.setSurveyQuestionId(getSurveyQuestionId());
		clone.setSurveyId(getSurveyId());
		clone.setQuestion(getQuestion());
		clone.setType(getType());
		clone.setDisplayorder(getDisplayorder());

		return clone;
	}

	public int compareTo(SurveyQuestion surveyQuestion) {
		long pk = surveyQuestion.getPrimaryKey();

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

		SurveyQuestionClp surveyQuestion = null;

		try {
			surveyQuestion = (SurveyQuestionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = surveyQuestion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{surveyQuestionId=");
		sb.append(getSurveyQuestionId());
		sb.append(", surveyId=");
		sb.append(getSurveyId());
		sb.append(", question=");
		sb.append(getQuestion());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", displayorder=");
		sb.append(getDisplayorder());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.jhu.cvrg.portal.survey.model.SurveyQuestion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>surveyQuestionId</column-name><column-value><![CDATA[");
		sb.append(getSurveyQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surveyId</column-name><column-value><![CDATA[");
		sb.append(getSurveyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>question</column-name><column-value><![CDATA[");
		sb.append(getQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displayorder</column-name><column-value><![CDATA[");
		sb.append(getDisplayorder());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _surveyQuestionId;
	private long _surveyId;
	private String _question;
	private int _type;
	private int _displayorder;
}