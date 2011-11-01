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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Chris Jurado
 */
public class SurveyAnswerClp extends BaseModelImpl<SurveyAnswer>
	implements SurveyAnswer {
	public SurveyAnswerClp() {
	}

	public long getPrimaryKey() {
		return _surveyAnswerId;
	}

	public void setPrimaryKey(long pk) {
		setSurveyAnswerId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_surveyAnswerId);
	}

	public long getSurveyAnswerId() {
		return _surveyAnswerId;
	}

	public void setSurveyAnswerId(long surveyAnswerId) {
		_surveyAnswerId = surveyAnswerId;
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public SurveyAnswer toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (SurveyAnswer)Proxy.newProxyInstance(SurveyAnswer.class.getClassLoader(),
				new Class[] { SurveyAnswer.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		SurveyAnswerClp clone = new SurveyAnswerClp();

		clone.setSurveyAnswerId(getSurveyAnswerId());
		clone.setSurveyQuestionId(getSurveyQuestionId());
		clone.setSurveyId(getSurveyId());
		clone.setUserId(getUserId());
		clone.setAnswer(getAnswer());

		return clone;
	}

	public int compareTo(SurveyAnswer surveyAnswer) {
		long pk = surveyAnswer.getPrimaryKey();

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

		SurveyAnswerClp surveyAnswer = null;

		try {
			surveyAnswer = (SurveyAnswerClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = surveyAnswer.getPrimaryKey();

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

		sb.append("{surveyAnswerId=");
		sb.append(getSurveyAnswerId());
		sb.append(", surveyQuestionId=");
		sb.append(getSurveyQuestionId());
		sb.append(", surveyId=");
		sb.append(getSurveyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", answer=");
		sb.append(getAnswer());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.jhu.cvrg.portal.survey.model.SurveyAnswer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>surveyAnswerId</column-name><column-value><![CDATA[");
		sb.append(getSurveyAnswerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surveyQuestionId</column-name><column-value><![CDATA[");
		sb.append(getSurveyQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surveyId</column-name><column-value><![CDATA[");
		sb.append(getSurveyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answer</column-name><column-value><![CDATA[");
		sb.append(getAnswer());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _surveyAnswerId;
	private long _surveyQuestionId;
	private long _surveyId;
	private long _userId;
	private String _userUuid;
	private String _answer;
}