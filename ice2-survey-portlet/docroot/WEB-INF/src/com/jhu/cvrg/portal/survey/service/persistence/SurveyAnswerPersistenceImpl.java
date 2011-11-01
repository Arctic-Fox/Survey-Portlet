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

import com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException;
import com.jhu.cvrg.portal.survey.model.SurveyAnswer;
import com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerImpl;
import com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerModelImpl;

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
 * The persistence implementation for the survey answer service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link SurveyAnswerUtil} to access the survey answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyAnswerPersistence
 * @see SurveyAnswerUtil
 * @generated
 */
public class SurveyAnswerPersistenceImpl extends BasePersistenceImpl<SurveyAnswer>
	implements SurveyAnswerPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = SurveyAnswerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_SURVEY = new FinderPath(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findBySurvey",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_SURVEY = new FinderPath(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countBySurvey", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_SURVEYQUESTION = new FinderPath(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findBySurveyQuestion",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_SURVEYQUESTION = new FinderPath(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countBySurveyQuestion", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the survey answer in the entity cache if it is enabled.
	 *
	 * @param surveyAnswer the survey answer to cache
	 */
	public void cacheResult(SurveyAnswer surveyAnswer) {
		EntityCacheUtil.putResult(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerImpl.class, surveyAnswer.getPrimaryKey(), surveyAnswer);
	}

	/**
	 * Caches the survey answers in the entity cache if it is enabled.
	 *
	 * @param surveyAnswers the survey answers to cache
	 */
	public void cacheResult(List<SurveyAnswer> surveyAnswers) {
		for (SurveyAnswer surveyAnswer : surveyAnswers) {
			if (EntityCacheUtil.getResult(
						SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
						SurveyAnswerImpl.class, surveyAnswer.getPrimaryKey(),
						this) == null) {
				cacheResult(surveyAnswer);
			}
		}
	}

	/**
	 * Clears the cache for all survey answers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(SurveyAnswerImpl.class.getName());
		EntityCacheUtil.clearCache(SurveyAnswerImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the survey answer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(SurveyAnswer surveyAnswer) {
		EntityCacheUtil.removeResult(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerImpl.class, surveyAnswer.getPrimaryKey());
	}

	/**
	 * Creates a new survey answer with the primary key. Does not add the survey answer to the database.
	 *
	 * @param surveyAnswerId the primary key for the new survey answer
	 * @return the new survey answer
	 */
	public SurveyAnswer create(long surveyAnswerId) {
		SurveyAnswer surveyAnswer = new SurveyAnswerImpl();

		surveyAnswer.setNew(true);
		surveyAnswer.setPrimaryKey(surveyAnswerId);

		return surveyAnswer;
	}

	/**
	 * Removes the survey answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey answer to remove
	 * @return the survey answer that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the survey answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyAnswerId the primary key of the survey answer to remove
	 * @return the survey answer that was removed
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer remove(long surveyAnswerId)
		throws NoSuchSurveyAnswerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SurveyAnswer surveyAnswer = (SurveyAnswer)session.get(SurveyAnswerImpl.class,
					new Long(surveyAnswerId));

			if (surveyAnswer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						surveyAnswerId);
				}

				throw new NoSuchSurveyAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					surveyAnswerId);
			}

			return remove(surveyAnswer);
		}
		catch (NoSuchSurveyAnswerException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyAnswer removeImpl(SurveyAnswer surveyAnswer)
		throws SystemException {
		surveyAnswer = toUnwrappedModel(surveyAnswer);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, surveyAnswer);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerImpl.class, surveyAnswer.getPrimaryKey());

		return surveyAnswer;
	}

	public SurveyAnswer updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer,
		boolean merge) throws SystemException {
		surveyAnswer = toUnwrappedModel(surveyAnswer);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, surveyAnswer, merge);

			surveyAnswer.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
			SurveyAnswerImpl.class, surveyAnswer.getPrimaryKey(), surveyAnswer);

		return surveyAnswer;
	}

	protected SurveyAnswer toUnwrappedModel(SurveyAnswer surveyAnswer) {
		if (surveyAnswer instanceof SurveyAnswerImpl) {
			return surveyAnswer;
		}

		SurveyAnswerImpl surveyAnswerImpl = new SurveyAnswerImpl();

		surveyAnswerImpl.setNew(surveyAnswer.isNew());
		surveyAnswerImpl.setPrimaryKey(surveyAnswer.getPrimaryKey());

		surveyAnswerImpl.setSurveyAnswerId(surveyAnswer.getSurveyAnswerId());
		surveyAnswerImpl.setSurveyQuestionId(surveyAnswer.getSurveyQuestionId());
		surveyAnswerImpl.setSurveyId(surveyAnswer.getSurveyId());
		surveyAnswerImpl.setUserId(surveyAnswer.getUserId());
		surveyAnswerImpl.setAnswer(surveyAnswer.getAnswer());

		return surveyAnswerImpl;
	}

	/**
	 * Finds the survey answer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey answer to find
	 * @return the survey answer
	 * @throws com.liferay.portal.NoSuchModelException if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey answer with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException} if it could not be found.
	 *
	 * @param surveyAnswerId the primary key of the survey answer to find
	 * @return the survey answer
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer findByPrimaryKey(long surveyAnswerId)
		throws NoSuchSurveyAnswerException, SystemException {
		SurveyAnswer surveyAnswer = fetchByPrimaryKey(surveyAnswerId);

		if (surveyAnswer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + surveyAnswerId);
			}

			throw new NoSuchSurveyAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				surveyAnswerId);
		}

		return surveyAnswer;
	}

	/**
	 * Finds the survey answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey answer to find
	 * @return the survey answer, or <code>null</code> if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param surveyAnswerId the primary key of the survey answer to find
	 * @return the survey answer, or <code>null</code> if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer fetchByPrimaryKey(long surveyAnswerId)
		throws SystemException {
		SurveyAnswer surveyAnswer = (SurveyAnswer)EntityCacheUtil.getResult(SurveyAnswerModelImpl.ENTITY_CACHE_ENABLED,
				SurveyAnswerImpl.class, surveyAnswerId, this);

		if (surveyAnswer == null) {
			Session session = null;

			try {
				session = openSession();

				surveyAnswer = (SurveyAnswer)session.get(SurveyAnswerImpl.class,
						new Long(surveyAnswerId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (surveyAnswer != null) {
					cacheResult(surveyAnswer);
				}

				closeSession(session);
			}
		}

		return surveyAnswer;
	}

	/**
	 * Finds all the survey answers where surveyId = &#63;.
	 *
	 * @param surveyId the survey id to search with
	 * @return the matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findBySurvey(long surveyId)
		throws SystemException {
		return findBySurvey(surveyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the survey answers where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param start the lower bound of the range of survey answers to return
	 * @param end the upper bound of the range of survey answers to return (not inclusive)
	 * @return the range of matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findBySurvey(long surveyId, int start, int end)
		throws SystemException {
		return findBySurvey(surveyId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the survey answers where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param start the lower bound of the range of survey answers to return
	 * @param end the upper bound of the range of survey answers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findBySurvey(long surveyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				surveyId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<SurveyAnswer> list = (List<SurveyAnswer>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_SURVEY,
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

			query.append(_SQL_SELECT_SURVEYANSWER_WHERE);

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

				list = (List<SurveyAnswer>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first survey answer in the ordered set where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching survey answer
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer findBySurvey_First(long surveyId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyAnswerException, SystemException {
		List<SurveyAnswer> list = findBySurvey(surveyId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyId=");
			msg.append(surveyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyAnswerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last survey answer in the ordered set where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the survey id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching survey answer
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer findBySurvey_Last(long surveyId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyAnswerException, SystemException {
		int count = countBySurvey(surveyId);

		List<SurveyAnswer> list = findBySurvey(surveyId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyId=");
			msg.append(surveyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyAnswerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the survey answers before and after the current survey answer in the ordered set where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyAnswerId the primary key of the current survey answer
	 * @param surveyId the survey id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next survey answer
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer[] findBySurvey_PrevAndNext(long surveyAnswerId,
		long surveyId, OrderByComparator orderByComparator)
		throws NoSuchSurveyAnswerException, SystemException {
		SurveyAnswer surveyAnswer = findByPrimaryKey(surveyAnswerId);

		Session session = null;

		try {
			session = openSession();

			SurveyAnswer[] array = new SurveyAnswerImpl[3];

			array[0] = getBySurvey_PrevAndNext(session, surveyAnswer, surveyId,
					orderByComparator, true);

			array[1] = surveyAnswer;

			array[2] = getBySurvey_PrevAndNext(session, surveyAnswer, surveyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyAnswer getBySurvey_PrevAndNext(Session session,
		SurveyAnswer surveyAnswer, long surveyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SURVEYANSWER_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(surveyAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SurveyAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the survey answers where surveyQuestionId = &#63;.
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @return the matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findBySurveyQuestion(long surveyQuestionId)
		throws SystemException {
		return findBySurveyQuestion(surveyQuestionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the survey answers where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param start the lower bound of the range of survey answers to return
	 * @param end the upper bound of the range of survey answers to return (not inclusive)
	 * @return the range of matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findBySurveyQuestion(long surveyQuestionId,
		int start, int end) throws SystemException {
		return findBySurveyQuestion(surveyQuestionId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the survey answers where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param start the lower bound of the range of survey answers to return
	 * @param end the upper bound of the range of survey answers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findBySurveyQuestion(long surveyQuestionId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				surveyQuestionId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<SurveyAnswer> list = (List<SurveyAnswer>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_SURVEYQUESTION,
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

			query.append(_SQL_SELECT_SURVEYANSWER_WHERE);

			query.append(_FINDER_COLUMN_SURVEYQUESTION_SURVEYQUESTIONID_2);

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

				qPos.add(surveyQuestionId);

				list = (List<SurveyAnswer>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_SURVEYQUESTION,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_SURVEYQUESTION,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first survey answer in the ordered set where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching survey answer
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer findBySurveyQuestion_First(long surveyQuestionId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyAnswerException, SystemException {
		List<SurveyAnswer> list = findBySurveyQuestion(surveyQuestionId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyQuestionId=");
			msg.append(surveyQuestionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyAnswerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last survey answer in the ordered set where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching survey answer
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a matching survey answer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer findBySurveyQuestion_Last(long surveyQuestionId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyAnswerException, SystemException {
		int count = countBySurveyQuestion(surveyQuestionId);

		List<SurveyAnswer> list = findBySurveyQuestion(surveyQuestionId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyQuestionId=");
			msg.append(surveyQuestionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyAnswerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the survey answers before and after the current survey answer in the ordered set where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyAnswerId the primary key of the current survey answer
	 * @param surveyQuestionId the survey question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next survey answer
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyAnswerException if a survey answer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyAnswer[] findBySurveyQuestion_PrevAndNext(
		long surveyAnswerId, long surveyQuestionId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyAnswerException, SystemException {
		SurveyAnswer surveyAnswer = findByPrimaryKey(surveyAnswerId);

		Session session = null;

		try {
			session = openSession();

			SurveyAnswer[] array = new SurveyAnswerImpl[3];

			array[0] = getBySurveyQuestion_PrevAndNext(session, surveyAnswer,
					surveyQuestionId, orderByComparator, true);

			array[1] = surveyAnswer;

			array[2] = getBySurveyQuestion_PrevAndNext(session, surveyAnswer,
					surveyQuestionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyAnswer getBySurveyQuestion_PrevAndNext(Session session,
		SurveyAnswer surveyAnswer, long surveyQuestionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SURVEYANSWER_WHERE);

		query.append(_FINDER_COLUMN_SURVEYQUESTION_SURVEYQUESTIONID_2);

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

		qPos.add(surveyQuestionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(surveyAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SurveyAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the survey answers.
	 *
	 * @return the survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the survey answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey answers to return
	 * @param end the upper bound of the range of survey answers to return (not inclusive)
	 * @return the range of survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the survey answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey answers to return
	 * @param end the upper bound of the range of survey answers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyAnswer> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<SurveyAnswer> list = (List<SurveyAnswer>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SURVEYANSWER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYANSWER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SurveyAnswer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SurveyAnswer>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the survey answers where surveyId = &#63; from the database.
	 *
	 * @param surveyId the survey id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySurvey(long surveyId) throws SystemException {
		for (SurveyAnswer surveyAnswer : findBySurvey(surveyId)) {
			remove(surveyAnswer);
		}
	}

	/**
	 * Removes all the survey answers where surveyQuestionId = &#63; from the database.
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySurveyQuestion(long surveyQuestionId)
		throws SystemException {
		for (SurveyAnswer surveyAnswer : findBySurveyQuestion(surveyQuestionId)) {
			remove(surveyAnswer);
		}
	}

	/**
	 * Removes all the survey answers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SurveyAnswer surveyAnswer : findAll()) {
			remove(surveyAnswer);
		}
	}

	/**
	 * Counts all the survey answers where surveyId = &#63;.
	 *
	 * @param surveyId the survey id to search with
	 * @return the number of matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySurvey(long surveyId) throws SystemException {
		Object[] finderArgs = new Object[] { surveyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SURVEY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYANSWER_WHERE);

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
	 * Counts all the survey answers where surveyQuestionId = &#63;.
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @return the number of matching survey answers
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySurveyQuestion(long surveyQuestionId)
		throws SystemException {
		Object[] finderArgs = new Object[] { surveyQuestionId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SURVEYQUESTION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYANSWER_WHERE);

			query.append(_FINDER_COLUMN_SURVEYQUESTION_SURVEYQUESTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(surveyQuestionId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SURVEYQUESTION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the survey answers.
	 *
	 * @return the number of survey answers
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

				Query q = session.createQuery(_SQL_COUNT_SURVEYANSWER);

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
	 * Initializes the survey answer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.jhu.cvrg.portal.survey.model.SurveyAnswer")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SurveyAnswer>> listenersList = new ArrayList<ModelListener<SurveyAnswer>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SurveyAnswer>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SurveyAnswerImpl.class.getName());
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
	private static final String _SQL_SELECT_SURVEYANSWER = "SELECT surveyAnswer FROM SurveyAnswer surveyAnswer";
	private static final String _SQL_SELECT_SURVEYANSWER_WHERE = "SELECT surveyAnswer FROM SurveyAnswer surveyAnswer WHERE ";
	private static final String _SQL_COUNT_SURVEYANSWER = "SELECT COUNT(surveyAnswer) FROM SurveyAnswer surveyAnswer";
	private static final String _SQL_COUNT_SURVEYANSWER_WHERE = "SELECT COUNT(surveyAnswer) FROM SurveyAnswer surveyAnswer WHERE ";
	private static final String _FINDER_COLUMN_SURVEY_SURVEYID_2 = "surveyAnswer.surveyId = ?";
	private static final String _FINDER_COLUMN_SURVEYQUESTION_SURVEYQUESTIONID_2 =
		"surveyAnswer.surveyQuestionId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyAnswer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SurveyAnswer exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SurveyAnswer exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(SurveyAnswerPersistenceImpl.class);
}