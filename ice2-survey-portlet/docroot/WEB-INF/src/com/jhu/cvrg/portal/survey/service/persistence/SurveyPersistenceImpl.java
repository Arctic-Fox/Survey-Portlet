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

import com.jhu.cvrg.portal.survey.NoSuchSurveyException;
import com.jhu.cvrg.portal.survey.model.Survey;
import com.jhu.cvrg.portal.survey.model.impl.SurveyImpl;
import com.jhu.cvrg.portal.survey.model.impl.SurveyModelImpl;

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
 * The persistence implementation for the survey service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link SurveyUtil} to access the survey persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyPersistence
 * @see SurveyUtil
 * @generated
 */
public class SurveyPersistenceImpl extends BasePersistenceImpl<Survey>
	implements SurveyPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = SurveyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_COMMUNITY = new FinderPath(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByCommunity",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_COMMUNITY = new FinderPath(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByCommunity", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the survey in the entity cache if it is enabled.
	 *
	 * @param survey the survey to cache
	 */
	public void cacheResult(Survey survey) {
		EntityCacheUtil.putResult(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyImpl.class, survey.getPrimaryKey(), survey);
	}

	/**
	 * Caches the surveies in the entity cache if it is enabled.
	 *
	 * @param surveies the surveies to cache
	 */
	public void cacheResult(List<Survey> surveies) {
		for (Survey survey : surveies) {
			if (EntityCacheUtil.getResult(
						SurveyModelImpl.ENTITY_CACHE_ENABLED, SurveyImpl.class,
						survey.getPrimaryKey(), this) == null) {
				cacheResult(survey);
			}
		}
	}

	/**
	 * Clears the cache for all surveies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(SurveyImpl.class.getName());
		EntityCacheUtil.clearCache(SurveyImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the survey.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Survey survey) {
		EntityCacheUtil.removeResult(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyImpl.class, survey.getPrimaryKey());
	}

	/**
	 * Creates a new survey with the primary key. Does not add the survey to the database.
	 *
	 * @param surveyId the primary key for the new survey
	 * @return the new survey
	 */
	public Survey create(long surveyId) {
		Survey survey = new SurveyImpl();

		survey.setNew(true);
		survey.setPrimaryKey(surveyId);

		return survey;
	}

	/**
	 * Removes the survey with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey to remove
	 * @return the survey that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a survey with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the survey with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyId the primary key of the survey to remove
	 * @return the survey that was removed
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey remove(long surveyId)
		throws NoSuchSurveyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Survey survey = (Survey)session.get(SurveyImpl.class,
					new Long(surveyId));

			if (survey == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + surveyId);
				}

				throw new NoSuchSurveyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					surveyId);
			}

			return remove(survey);
		}
		catch (NoSuchSurveyException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Survey removeImpl(Survey survey) throws SystemException {
		survey = toUnwrappedModel(survey);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, survey);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyImpl.class, survey.getPrimaryKey());

		return survey;
	}

	public Survey updateImpl(com.jhu.cvrg.portal.survey.model.Survey survey,
		boolean merge) throws SystemException {
		survey = toUnwrappedModel(survey);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, survey, merge);

			survey.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(SurveyModelImpl.ENTITY_CACHE_ENABLED,
			SurveyImpl.class, survey.getPrimaryKey(), survey);

		return survey;
	}

	protected Survey toUnwrappedModel(Survey survey) {
		if (survey instanceof SurveyImpl) {
			return survey;
		}

		SurveyImpl surveyImpl = new SurveyImpl();

		surveyImpl.setNew(survey.isNew());
		surveyImpl.setPrimaryKey(survey.getPrimaryKey());

		surveyImpl.setSurveyId(survey.getSurveyId());
		surveyImpl.setCommunityId(survey.getCommunityId());
		surveyImpl.setSurveyName(survey.getSurveyName());

		return surveyImpl;
	}

	/**
	 * Finds the survey with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey to find
	 * @return the survey
	 * @throws com.liferay.portal.NoSuchModelException if a survey with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyException} if it could not be found.
	 *
	 * @param surveyId the primary key of the survey to find
	 * @return the survey
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey findByPrimaryKey(long surveyId)
		throws NoSuchSurveyException, SystemException {
		Survey survey = fetchByPrimaryKey(surveyId);

		if (survey == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + surveyId);
			}

			throw new NoSuchSurveyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				surveyId);
		}

		return survey;
	}

	/**
	 * Finds the survey with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey to find
	 * @return the survey, or <code>null</code> if a survey with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param surveyId the primary key of the survey to find
	 * @return the survey, or <code>null</code> if a survey with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey fetchByPrimaryKey(long surveyId) throws SystemException {
		Survey survey = (Survey)EntityCacheUtil.getResult(SurveyModelImpl.ENTITY_CACHE_ENABLED,
				SurveyImpl.class, surveyId, this);

		if (survey == null) {
			Session session = null;

			try {
				session = openSession();

				survey = (Survey)session.get(SurveyImpl.class,
						new Long(surveyId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (survey != null) {
					cacheResult(survey);
				}

				closeSession(session);
			}
		}

		return survey;
	}

	/**
	 * Finds all the surveies where communityId = &#63;.
	 *
	 * @param communityId the community id to search with
	 * @return the matching surveies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Survey> findByCommunity(long communityId)
		throws SystemException {
		return findByCommunity(communityId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the surveies where communityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param communityId the community id to search with
	 * @param start the lower bound of the range of surveies to return
	 * @param end the upper bound of the range of surveies to return (not inclusive)
	 * @return the range of matching surveies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Survey> findByCommunity(long communityId, int start, int end)
		throws SystemException {
		return findByCommunity(communityId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the surveies where communityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param communityId the community id to search with
	 * @param start the lower bound of the range of surveies to return
	 * @param end the upper bound of the range of surveies to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching surveies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Survey> findByCommunity(long communityId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				communityId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Survey> list = (List<Survey>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_COMMUNITY,
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

			query.append(_SQL_SELECT_SURVEY_WHERE);

			query.append(_FINDER_COLUMN_COMMUNITY_COMMUNITYID_2);

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

				qPos.add(communityId);

				list = (List<Survey>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_COMMUNITY,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_COMMUNITY,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first survey in the ordered set where communityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param communityId the community id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching survey
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a matching survey could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey findByCommunity_First(long communityId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyException, SystemException {
		List<Survey> list = findByCommunity(communityId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("communityId=");
			msg.append(communityId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last survey in the ordered set where communityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param communityId the community id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching survey
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a matching survey could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey findByCommunity_Last(long communityId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyException, SystemException {
		int count = countByCommunity(communityId);

		List<Survey> list = findByCommunity(communityId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("communityId=");
			msg.append(communityId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the surveies before and after the current survey in the ordered set where communityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyId the primary key of the current survey
	 * @param communityId the community id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next survey
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyException if a survey with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Survey[] findByCommunity_PrevAndNext(long surveyId,
		long communityId, OrderByComparator orderByComparator)
		throws NoSuchSurveyException, SystemException {
		Survey survey = findByPrimaryKey(surveyId);

		Session session = null;

		try {
			session = openSession();

			Survey[] array = new SurveyImpl[3];

			array[0] = getByCommunity_PrevAndNext(session, survey, communityId,
					orderByComparator, true);

			array[1] = survey;

			array[2] = getByCommunity_PrevAndNext(session, survey, communityId,
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

	protected Survey getByCommunity_PrevAndNext(Session session, Survey survey,
		long communityId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SURVEY_WHERE);

		query.append(_FINDER_COLUMN_COMMUNITY_COMMUNITYID_2);

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

		qPos.add(communityId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(survey);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Survey> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the surveies.
	 *
	 * @return the surveies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Survey> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the surveies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of surveies to return
	 * @param end the upper bound of the range of surveies to return (not inclusive)
	 * @return the range of surveies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Survey> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the surveies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of surveies to return
	 * @param end the upper bound of the range of surveies to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of surveies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Survey> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Survey> list = (List<Survey>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SURVEY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Survey>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Survey>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the surveies where communityId = &#63; from the database.
	 *
	 * @param communityId the community id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCommunity(long communityId) throws SystemException {
		for (Survey survey : findByCommunity(communityId)) {
			remove(survey);
		}
	}

	/**
	 * Removes all the surveies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Survey survey : findAll()) {
			remove(survey);
		}
	}

	/**
	 * Counts all the surveies where communityId = &#63;.
	 *
	 * @param communityId the community id to search with
	 * @return the number of matching surveies
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCommunity(long communityId) throws SystemException {
		Object[] finderArgs = new Object[] { communityId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMMUNITY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEY_WHERE);

			query.append(_FINDER_COLUMN_COMMUNITY_COMMUNITYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(communityId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMMUNITY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the surveies.
	 *
	 * @return the number of surveies
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

				Query q = session.createQuery(_SQL_COUNT_SURVEY);

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
	 * Initializes the survey persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.jhu.cvrg.portal.survey.model.Survey")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Survey>> listenersList = new ArrayList<ModelListener<Survey>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Survey>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SurveyImpl.class.getName());
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
	private static final String _SQL_SELECT_SURVEY = "SELECT survey FROM Survey survey";
	private static final String _SQL_SELECT_SURVEY_WHERE = "SELECT survey FROM Survey survey WHERE ";
	private static final String _SQL_COUNT_SURVEY = "SELECT COUNT(survey) FROM Survey survey";
	private static final String _SQL_COUNT_SURVEY_WHERE = "SELECT COUNT(survey) FROM Survey survey WHERE ";
	private static final String _FINDER_COLUMN_COMMUNITY_COMMUNITYID_2 = "survey.communityId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "survey.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Survey exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Survey exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(SurveyPersistenceImpl.class);
}