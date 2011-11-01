create index IX_9FC1E5EC on JHU_Survey (communityId);
create index IX_9D84EF1 on JHU_Survey (surveyId);

create index IX_524BF7AD on JHU_SurveyAnswer (surveyAnswerId);
create index IX_62106C4F on JHU_SurveyAnswer (surveyId);
create index IX_4AFFD755 on JHU_SurveyAnswer (surveyQuestionId);

create index IX_224313F7 on JHU_SurveyQuestion (surveyId);
create index IX_AA8456FD on JHU_SurveyQuestion (surveyQuestionId);

create index IX_74362112 on JHU_SurveyQuestionOption (surveyQuestionId);