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

package com.jhu.cvrg.portal.survey;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Chris Jurado
 */
public class NoSuchSurveyQuestionException extends NoSuchModelException {

	public NoSuchSurveyQuestionException() {
		super();
	}

	public NoSuchSurveyQuestionException(String msg) {
		super(msg);
	}

	public NoSuchSurveyQuestionException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchSurveyQuestionException(Throwable cause) {
		super(cause);
	}

}