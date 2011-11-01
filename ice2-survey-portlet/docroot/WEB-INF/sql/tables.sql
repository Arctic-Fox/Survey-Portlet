create table JHU_Survey (
	surveyId LONG not null primary key,
	communityId LONG,
	surveyName VARCHAR(75) null
);

create table JHU_SurveyAnswer (
	surveyAnswerId LONG not null primary key,
	surveyQuestionId LONG,
	surveyId LONG,
	userId LONG,
	answer VARCHAR(75) null
);

create table JHU_SurveyQuestion (
	surveyQuestionId LONG not null primary key,
	surveyId LONG,
	question VARCHAR(75) null,
	type_ INTEGER,
	displayorder INTEGER
);

create table JHU_SurveyQuestionOption (
	surveyQuestionOptionId LONG not null primary key,
	surveyQuestionId LONG,
	question VARCHAR(75) null,
	displayorder INTEGER
);