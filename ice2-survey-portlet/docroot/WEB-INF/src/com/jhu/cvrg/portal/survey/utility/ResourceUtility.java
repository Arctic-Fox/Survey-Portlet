package com.jhu.cvrg.portal.survey.utility;
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
import java.io.IOException;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import org.portletfaces.liferay.faces.context.LiferayFacesContext;
import org.portletfaces.liferay.faces.helper.LongHelper;

import com.jhu.cvrg.portal.survey.model.ControlList;
import com.jhu.cvrg.portal.survey.model.Survey;
import com.jhu.cvrg.portal.survey.service.SurveyLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.portal.theme.ThemeDisplay;

public class ResourceUtility {

	private final static LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
	private final static PortletPreferences prefs = liferayFacesContext.getPortletPreferences();
	public static enum type {TEXT, BOOLEAN, SINGLEOPTION, MULTIOPTION, ANSWER, SCALE, STRONGLY};
	
	public static String getPortletId(){
		
		PortletRequest request = (PortletRequest) liferayFacesContext.getExternalContext().getRequest();	
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		return String.valueOf(themeDisplay.getPlid());
	}
	
	public ControlList getControlList(){
		ControlList controlList = (ControlList) liferayFacesContext
			.getApplication().getELResolver().getValue(
			liferayFacesContext.getELContext(), null, "controlList");
		
		return controlList;
	}
	
	public static Survey getStoredSurvey(){
		Survey survey = null;
		try {
			survey = SurveyLocalServiceUtil.getSurvey(getPrefSurveyId());
		} catch (PortalException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (SystemException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		}
		
		return survey;
	}
	
	public static long getPrefSurveyId(){
		return Long.valueOf(prefs.getValue(getPortletId() + "_surveyid", "0"));
	}
	
	public static void savePreferences(long surveyId){
		try {
			prefs.setValue(getPortletId() + "_surveyid", String.valueOf(surveyId));
			prefs.store();
		} catch (ReadOnlyException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (ValidatorException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (IOException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		}
	}
	
	public static void printErrorMessage(String source){
		System.err.println("*************************** Error in " + source + " ******************************");
	}
	
	public static long getIdParameter(String param){
		return LongHelper.toLong(liferayFacesContext.getExternalContext().getRequestParameterMap().get(param), 0L);
	}
	
	public static User getUser(long userId){
		User user = null;
		try {
			user = UserLocalServiceUtil.getUser(userId);
		} catch (PortalException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (SystemException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		}
		return user;
	}
	
	public static long getCurrentGroupId(){
		
		PortletRequest request = (PortletRequest) liferayFacesContext.getExternalContext().getRequest();	
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		
		return themeDisplay.getLayout().getGroupId();	
	}
	
	public static User getCurrentUser(){
		
		User currentUser = null;
		try {
			currentUser = UserLocalServiceUtil.getUser(Long.parseLong(liferayFacesContext.getPortletRequest().getRemoteUser()));
		} catch (NumberFormatException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (PortalException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (SystemException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		}
		return currentUser;
	}

	public static long getCurrentUserId(){
		return getCurrentUser().getUserId();
	}
	
	public static boolean isUserCommunityMember(long userId, long communityId){
		
		try {
			List<Group> userGroups = GroupLocalServiceUtil.getUserGroups(userId);
			
			for(Group group : userGroups){
				if(group.getGroupId() == communityId){
					return true;
				}
			}
		} catch (PortalException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (SystemException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		}
		return false;
	}
	
	public static long getGroupId(String communityName){
		long groupId = 0L;
		List<Group> groupList;
		try {
			groupList = GroupLocalServiceUtil.getGroups(0, GroupLocalServiceUtil.getGroupsCount());;
			for(Group group : groupList){
				if(group.getName().equals(communityName)){
					groupId = group.getGroupId();
				}
			}
		} catch (SystemException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		}

		return groupId;
	}
	
	public static String convertToUserName(long userId){
		String userFullName = "";
		
		try {
			User user = UserLocalServiceUtil.getUser(userId);
			userFullName = user.getFullName();
		} catch (PortalException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		} catch (SystemException e) {
			printErrorMessage("Resource Utility");
			e.printStackTrace();
		}
		
		return userFullName;
	}

}
