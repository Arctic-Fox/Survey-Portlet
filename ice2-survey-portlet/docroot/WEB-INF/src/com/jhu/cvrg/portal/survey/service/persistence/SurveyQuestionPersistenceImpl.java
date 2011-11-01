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

package com.jhu.cvrg.portal.survey.service.persistence;

import com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException;
import com.jhu.cvrg.portal.survey.model.SurveyQuestion;
import com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionImpl;
import com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the survey question service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link SurveyQuestionUtil} to access the survey question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyQuestionPersistence
 * @see SurveyQuestionUtil
 * @generated
 */
public class SurveyQuestionPersistenceImpl extends BasePersistenceImpl<SurveyQuestion>
	implements SurveyQuestionPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = SurveyQuestionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_SURVEY = new FinderPath(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findBySurvey",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_SURVEY = new FinderPath(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countBySurvey",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the survey question in the entity cache if it is enabled.
	 *
	 * @param surveyQuestion the survey question to cache
	 */
	public void cacheResult(SurveyQuestion surveyQuestion) {
		EntityCacheUtil.putResult(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionImpl.class, surveyQuestion.getPrimaryKey(),
			surveyQuestion);
	}

	/**
	 * Caches the survey questions in the entity cache if it is enabled.
	 *
	 * @param surveyQuestions the survey questions to cache
	 */
	public void cacheResult(List<SurveyQuestion> surveyQuestions) {
		for (SurveyQuestion surveyQuestion : surveyQuestions) {
			if (EntityCacheUtil.getResult(
						SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
						SurveyQuestionImpl.class,
						surveyQuestion.getPrimaryKey(), this) == null) {
				cacheResult(surveyQuestion);
			}
		}
	}

	/**
	 * Clears the cache for all survey questions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(SurveyQuestionImpl.class.getName());
		EntityCacheUtil.clearCache(SurveyQuestionImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the survey question.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(SurveyQuestion surveyQuestion) {
		EntityCacheUtil.removeResult(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionImpl.class, surveyQuestion.getPrimaryKey());
	}

	/**
	 * Creates a new survey question with the primary key. Does not add the survey question to the database.
	 *
	 * @param surveyQuestionId the primary key for the new survey question
	 * @return the new survey question
	 */
	public SurveyQuestion create(long surveyQuestionId) {
		SurveyQuestion surveyQuestion = new SurveyQuestionImpl();

		surveyQuestion.setNew(true);
		surveyQuestion.setPrimaryKey(surveyQuestionId);

		return surveyQuestion;
	}

	/**
	 * Removes the survey question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey question to remove
	 * @return the survey question that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the survey question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyQuestionId the primary key of the survey question to remove
	 * @return the survey question that was removed
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion remove(long surveyQuestionId)
		throws NoSuchSurveyQuestionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SurveyQuestion surveyQuestion = (SurveyQuestion)session.get(SurveyQuestionImpl.class,
					new Long(surveyQuestionId));

			if (surveyQuestion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						surveyQuestionId);
				}

				throw new NoSuchSurveyQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					surveyQuestionId);
			}

			return remove(surveyQuestion);
		}
		catch (NoSuchSurveyQuestionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyQuestion removeImpl(SurveyQuestion surveyQuestion)
		throws SystemException {
		surveyQuestion = toUnwrappedModel(surveyQuestion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, surveyQuestion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionImpl.class, surveyQuestion.getPrimaryKey());

		return surveyQuestion;
	}

	public SurveyQuestion updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyQuestion surveyQuestion,
		boolean merge) throws SystemException {
		surveyQuestion = toUnwrappedModel(surveyQuestion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, surveyQuestion, merge);

			surveyQuestion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionImpl.class, surveyQuestion.getPrimaryKey(),
			surveyQuestion);

		return surveyQuestion;
	}

	protected SurveyQuestion toUnwrappedModel(SurveyQuestion surveyQuestion) {
		if (surveyQuestion instanceof SurveyQuestionImpl) {
			return surveyQuestion;
		}

		SurveyQuestionImpl surveyQuestionImpl = new SurveyQuestionImpl();

		surveyQuestionImpl.setNew(surveyQuestion.isNew());
		surveyQuestionImpl.setPrimaryKey(surveyQuestion.getPrimaryKey());

		surveyQuestionImpl.setSurveyQuestionId(surveyQuestion.getSurveyQuestionId());
		surveyQuestionImpl.setSurveyId(surveyQuestion.getSurveyId());
		surveyQuestionImpl.setQuestion(surveyQuestion.getQuestion());
		surveyQuestionImpl.setType(surveyQuestion.getType());
		surveyQuestionImpl.setDisplayorder(surveyQuestion.getDisplayorder());

		return surveyQuestionImpl;
	}

	/**
	 * Finds the survey question with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey question to find
	 * @return the survey question
	 * @throws com.liferay.portal.NoSuchModelException if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey question with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException} if it could not be found.
	 *
	 * @param surveyQuestionId the primary key of the survey question to find
	 * @return the survey question
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion findByPrimaryKey(long surveyQuestionId)
		throws NoSuchSurveyQuestionException, SystemException {
		SurveyQuestion surveyQuestion = fetchByPrimaryKey(surveyQuestionId);

		if (surveyQuestion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + surveyQuestionId);
			}

			throw new NoSuchSurveyQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				surveyQuestionId);
		}

		return surveyQuestion;
	}

	/**
	 * Finds the survey question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey question to find
	 * @return the survey question, or <code>null</code> if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param surveyQuestionId the primary key of the survey question to find
	 * @return the survey question, or <code>null</code> if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion fetchByPrimaryKey(long surveyQuestionId)
		throws SystemException {
		SurveyQuestion surveyQuestion = (SurveyQuestion)EntityCacheUtil.getResult(SurveyQuestionModelImpl.ENTITY_CACHE_ENABLED,
				SurveyQuestionImpl.class, surveyQuestionId, this);

		if (surveyQuestion == null) {
			Session session = null;

			try {
				session = openSession();

				surveyQuestion = (SurveyQuestion)session.get(SurveyQuestionImpl.class,
						new Long(surveyQuestionId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (surveyQuestion != null) {
					cacheResult(surveyQuestion);
				}

				closeSession(session);
			}
		}

		return surveyQuestion;
	}

	/**
	 * Finds all the survey questions where surveyId = &#63;.
	 *
	 * @param surveyId the survey id to search with
	 * @return the matching survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestion> findBySurvey(long surveyId)
		throws SystemException {
		return findBySurvey(surveyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the survey questions where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param start the lower bound of the range of survey questions to return
	 * @param end the upper bound of the range of survey questions to return (not inclusive)
	 * @return the range of matching survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestion> findBySurvey(long surveyId, int start, int end)
		throws SystemException {
		return findBySurvey(surveyId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the survey questions where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param start the lower bound of the range of survey questions to return
	 * @param end the upper bound of the range of survey questions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestion> findBySurvey(long surveyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				surveyId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<SurveyQuestion> list = (List<SurveyQuestion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_SURVEY,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_SURVEYQUESTION_WHERE);

			query.append(_FINDER_COLUMN_SURVEY_SURVEYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(surveyId);

				list = (List<SurveyQuestion>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_SURVEY,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_SURVEY,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first survey question in the ordered set where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching survey question
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a matching survey question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion findBySurvey_First(long surveyId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyQuestionException, SystemException {
		List<SurveyQuestion> list = findBySurvey(surveyId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyId=");
			msg.append(surveyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyQuestionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last survey question in the ordered set where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching survey question
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a matching survey question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion findBySurvey_Last(long surveyId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyQuestionException, SystemException {
		int count = countBySurvey(surveyId);

		List<SurveyQuestion> list = findBySurvey(surveyId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyId=");
			msg.append(surveyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyQuestionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the survey questions before and after the current survey question in the ordered set where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the primary key of the current survey question
	 * @param surveyId the survey id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next survey question
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionException if a survey question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestion[] findBySurvey_PrevAndNext(long surveyQuestionId,
		long surveyId, OrderByComparator orderByComparator)
		throws NoSuchSurveyQuestionException, SystemException {
		SurveyQuestion surveyQuestion = findByPrimaryKey(surveyQuestionId);

		Session session = null;

		try {
			session = openSession();

			SurveyQuestion[] array = new SurveyQuestionImpl[3];

			array[0] = getBySurvey_PrevAndNext(session, surveyQuestion,
					surveyId, orderByComparator, true);

			array[1] = surveyQuestion;

			array[2] = getBySurvey_PrevAndNext(session, surveyQuestion,
					surveyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyQuestion getBySurvey_PrevAndNext(Session session,
		SurveyQuestion surveyQuestion, long surveyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SURVEYQUESTION_WHERE);

		query.append(_FINDER_COLUMN_SURVEY_SURVEYID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(surveyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(surveyQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SurveyQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the survey questions.
	 *
	 * @return the survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the survey questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey questions to return
	 * @param end the upper bound of the range of survey questions to return (not inclusive)
	 * @return the range of survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the survey questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey questions to return
	 * @param end the upper bound of the range of survey questions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestion> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<SurveyQuestion> list = (List<SurveyQuestion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SURVEYQUESTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYQUESTION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SurveyQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SurveyQuestion>)QueryUtil.list(q,
							getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the survey questions where surveyId = &#63; from the database.
	 *
	 * @param surveyId the survey id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySurvey(long surveyId) throws SystemException {
		for (SurveyQuestion surveyQuestion : findBySurvey(surveyId)) {
			remove(surveyQuestion);
		}
	}

	/**
	 * Removes all the survey questions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SurveyQuestion surveyQuestion : findAll()) {
			remove(surveyQuestion);
		}
	}

	/**
	 * Counts all the survey questions where surveyId = &#63;.
	 *
	 * @param surveyId the survey id to search with
	 * @return the number of matching survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySurvey(long surveyId) throws SystemException {
		Object[] finderArgs = new Object[] { surveyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SURVEY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYQUESTION_WHERE);

			query.append(_FINDER_COLUMN_SURVEY_SURVEYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(surveyId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SURVEY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the survey questions.
	 *
	 * @return the number of survey questions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SURVEYQUESTION);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the survey question persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.jhu.cvrg.portal.survey.model.SurveyQuestion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SurveyQuestion>> listenersList = new ArrayList<ModelListener<SurveyQuestion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SurveyQuestion>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(SurveyQuestionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = SurveyQuestionPersistence.class)
	protected SurveyQuestionPersistence surveyQuestionPersistence;
	@BeanReference(type = SurveyQuestionOptionPersistence.class)
	protected SurveyQuestionOptionPersistence surveyQuestionOptionPersistence;
	@BeanReference(type = SurveyAnswerPersistence.class)
	protected SurveyAnswerPersistence surveyAnswerPersistence;
	@BeanReference(type = SurveyPersistence.class)
	protected SurveyPersistence surveyPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_SURVEYQUESTION = "SELECT surveyQuestion FROM SurveyQuestion surveyQuestion";
	private static final String _SQL_SELECT_SURVEYQUESTION_WHERE = "SELECT surveyQuestion FROM SurveyQuestion surveyQuestion WHERE ";
	private static final String _SQL_COUNT_SURVEYQUESTION = "SELECT COUNT(surveyQuestion) FROM SurveyQuestion surveyQuestion";
	private static final String _SQL_COUNT_SURVEYQUESTION_WHERE = "SELECT COUNT(surveyQuestion) FROM SurveyQuestion surveyQuestion WHERE ";
	private static final String _FINDER_COLUMN_SURVEY_SURVEYID_2 = "surveyQuestion.surveyId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyQuestion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SurveyQuestion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SurveyQuestion exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(SurveyQuestionPersistenceImpl.class);
}