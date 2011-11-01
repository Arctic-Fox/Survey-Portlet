package com.jhu.cvrg.portal.survey.list;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import com.jhu.cvrg.portal.survey.model.Survey;
import com.jhu.cvrg.portal.survey.service.SurveyLocalServiceUtil;
import com.jhu.cvrg.portal.survey.utility.ResourceUtility;
import com.liferay.portal.kernel.exception.SystemException;

/*
 Copyright 2011 Johns Hopkins University Institute for Computational Medicine

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
/**
 * @author Chris Jurado
 * 
 */

@ManagedBean(name = "surveyList")
@ViewScoped
public class SurveyList {

	ArrayList<SelectItem> list;
	List<Survey> surveyList;

	public SurveyList() {
		initialize();
	}

	public void initialize() {
		list = new ArrayList<SelectItem>();

		try {

			surveyList = SurveyLocalServiceUtil.findByCommunity(ResourceUtility
					.getCurrentGroupId());

			if (surveyList.size() == 0) {
				list.add(new SelectItem(0, "No surveys available."));
			} else {
				for (Survey survey : surveyList) {
					list.add(new SelectItem(survey.getSurveyId(), survey
							.getSurveyName()));
				}
			}

		} catch (SystemException e) {
			ResourceUtility.printErrorMessage("Survey List Bean");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			ResourceUtility.printErrorMessage("Survey List Bean");
			e.printStackTrace();
		}

	}

	public ArrayList<SelectItem> getList() {
		return list;
	}

}
