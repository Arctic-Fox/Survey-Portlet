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

import com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException;
import com.jhu.cvrg.portal.survey.model.SurveyQuestionOption;
import com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionOptionImpl;
import com.jhu.cvrg.portal.survey.model.impl.SurveyQuestionOptionModelImpl;

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
 * The persistence implementation for the survey question option service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link SurveyQuestionOptionUtil} to access the survey question option persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyQuestionOptionPersistence
 * @see SurveyQuestionOptionUtil
 * @generated
 */
public class SurveyQuestionOptionPersistenceImpl extends BasePersistenceImpl<SurveyQuestionOption>
	implements SurveyQuestionOptionPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = SurveyQuestionOptionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_SURVEYQUESTION = new FinderPath(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findBySurveyQuestion",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_SURVEYQUESTION = new FinderPath(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countBySurveyQuestion",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the survey question option in the entity cache if it is enabled.
	 *
	 * @param surveyQuestionOption the survey question option to cache
	 */
	public void cacheResult(SurveyQuestionOption surveyQuestionOption) {
		EntityCacheUtil.putResult(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionImpl.class,
			surveyQuestionOption.getPrimaryKey(), surveyQuestionOption);
	}

	/**
	 * Caches the survey question options in the entity cache if it is enabled.
	 *
	 * @param surveyQuestionOptions the survey question options to cache
	 */
	public void cacheResult(List<SurveyQuestionOption> surveyQuestionOptions) {
		for (SurveyQuestionOption surveyQuestionOption : surveyQuestionOptions) {
			if (EntityCacheUtil.getResult(
						SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
						SurveyQuestionOptionImpl.class,
						surveyQuestionOption.getPrimaryKey(), this) == null) {
				cacheResult(surveyQuestionOption);
			}
		}
	}

	/**
	 * Clears the cache for all survey question options.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(SurveyQuestionOptionImpl.class.getName());
		EntityCacheUtil.clearCache(SurveyQuestionOptionImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the survey question option.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(SurveyQuestionOption surveyQuestionOption) {
		EntityCacheUtil.removeResult(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionImpl.class, surveyQuestionOption.getPrimaryKey());
	}

	/**
	 * Creates a new survey question option with the primary key. Does not add the survey question option to the database.
	 *
	 * @param surveyQuestionOptionId the primary key for the new survey question option
	 * @return the new survey question option
	 */
	public SurveyQuestionOption create(long surveyQuestionOptionId) {
		SurveyQuestionOption surveyQuestionOption = new SurveyQuestionOptionImpl();

		surveyQuestionOption.setNew(true);
		surveyQuestionOption.setPrimaryKey(surveyQuestionOptionId);

		return surveyQuestionOption;
	}

	/**
	 * Removes the survey question option with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey question option to remove
	 * @return the survey question option that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a survey question option with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the survey question option with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyQuestionOptionId the primary key of the survey question option to remove
	 * @return the survey question option that was removed
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption remove(long surveyQuestionOptionId)
		throws NoSuchSurveyQuestionOptionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SurveyQuestionOption surveyQuestionOption = (SurveyQuestionOption)session.get(SurveyQuestionOptionImpl.class,
					new Long(surveyQuestionOptionId));

			if (surveyQuestionOption == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						surveyQuestionOptionId);
				}

				throw new NoSuchSurveyQuestionOptionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					surveyQuestionOptionId);
			}

			return remove(surveyQuestionOption);
		}
		catch (NoSuchSurveyQuestionOptionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyQuestionOption removeImpl(
		SurveyQuestionOption surveyQuestionOption) throws SystemException {
		surveyQuestionOption = toUnwrappedModel(surveyQuestionOption);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, surveyQuestionOption);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionImpl.class, surveyQuestionOption.getPrimaryKey());

		return surveyQuestionOption;
	}

	public SurveyQuestionOption updateImpl(
		com.jhu.cvrg.portal.survey.model.SurveyQuestionOption surveyQuestionOption,
		boolean merge) throws SystemException {
		surveyQuestionOption = toUnwrappedModel(surveyQuestionOption);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, surveyQuestionOption, merge);

			surveyQuestionOption.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
			SurveyQuestionOptionImpl.class,
			surveyQuestionOption.getPrimaryKey(), surveyQuestionOption);

		return surveyQuestionOption;
	}

	protected SurveyQuestionOption toUnwrappedModel(
		SurveyQuestionOption surveyQuestionOption) {
		if (surveyQuestionOption instanceof SurveyQuestionOptionImpl) {
			return surveyQuestionOption;
		}

		SurveyQuestionOptionImpl surveyQuestionOptionImpl = new SurveyQuestionOptionImpl();

		surveyQuestionOptionImpl.setNew(surveyQuestionOption.isNew());
		surveyQuestionOptionImpl.setPrimaryKey(surveyQuestionOption.getPrimaryKey());

		surveyQuestionOptionImpl.setSurveyQuestionOptionId(surveyQuestionOption.getSurveyQuestionOptionId());
		surveyQuestionOptionImpl.setSurveyQuestionId(surveyQuestionOption.getSurveyQuestionId());
		surveyQuestionOptionImpl.setQuestion(surveyQuestionOption.getQuestion());
		surveyQuestionOptionImpl.setDisplayorder(surveyQuestionOption.getDisplayorder());

		return surveyQuestionOptionImpl;
	}

	/**
	 * Finds the survey question option with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey question option to find
	 * @return the survey question option
	 * @throws com.liferay.portal.NoSuchModelException if a survey question option with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey question option with the primary key or throws a {@link com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException} if it could not be found.
	 *
	 * @param surveyQuestionOptionId the primary key of the survey question option to find
	 * @return the survey question option
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption findByPrimaryKey(long surveyQuestionOptionId)
		throws NoSuchSurveyQuestionOptionException, SystemException {
		SurveyQuestionOption surveyQuestionOption = fetchByPrimaryKey(surveyQuestionOptionId);

		if (surveyQuestionOption == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					surveyQuestionOptionId);
			}

			throw new NoSuchSurveyQuestionOptionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				surveyQuestionOptionId);
		}

		return surveyQuestionOption;
	}

	/**
	 * Finds the survey question option with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey question option to find
	 * @return the survey question option, or <code>null</code> if a survey question option with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the survey question option with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param surveyQuestionOptionId the primary key of the survey question option to find
	 * @return the survey question option, or <code>null</code> if a survey question option with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption fetchByPrimaryKey(long surveyQuestionOptionId)
		throws SystemException {
		SurveyQuestionOption surveyQuestionOption = (SurveyQuestionOption)EntityCacheUtil.getResult(SurveyQuestionOptionModelImpl.ENTITY_CACHE_ENABLED,
				SurveyQuestionOptionImpl.class, surveyQuestionOptionId, this);

		if (surveyQuestionOption == null) {
			Session session = null;

			try {
				session = openSession();

				surveyQuestionOption = (SurveyQuestionOption)session.get(SurveyQuestionOptionImpl.class,
						new Long(surveyQuestionOptionId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (surveyQuestionOption != null) {
					cacheResult(surveyQuestionOption);
				}

				closeSession(session);
			}
		}

		return surveyQuestionOption;
	}

	/**
	 * Finds all the survey question options where surveyQuestionId = &#63;.
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @return the matching survey question options
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId) throws SystemException {
		return findBySurveyQuestion(surveyQuestionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the survey question options where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param start the lower bound of the range of survey question options to return
	 * @param end the upper bound of the range of survey question options to return (not inclusive)
	 * @return the range of matching survey question options
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId, int start, int end) throws SystemException {
		return findBySurveyQuestion(surveyQuestionId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the survey question options where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param start the lower bound of the range of survey question options to return
	 * @param end the upper bound of the range of survey question options to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching survey question options
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestionOption> findBySurveyQuestion(
		long surveyQuestionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				surveyQuestionId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<SurveyQuestionOption> list = (List<SurveyQuestionOption>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_SURVEYQUESTION,
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

			query.append(_SQL_SELECT_SURVEYQUESTIONOPTION_WHERE);

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

				list = (List<SurveyQuestionOption>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Finds the first survey question option in the ordered set where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching survey question option
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a matching survey question option could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption findBySurveyQuestion_First(
		long surveyQuestionId, OrderByComparator orderByComparator)
		throws NoSuchSurveyQuestionOptionException, SystemException {
		List<SurveyQuestionOption> list = findBySurveyQuestion(surveyQuestionId,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyQuestionId=");
			msg.append(surveyQuestionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyQuestionOptionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last survey question option in the ordered set where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching survey question option
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a matching survey question option could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption findBySurveyQuestion_Last(
		long surveyQuestionId, OrderByComparator orderByComparator)
		throws NoSuchSurveyQuestionOptionException, SystemException {
		int count = countBySurveyQuestion(surveyQuestionId);

		List<SurveyQuestionOption> list = findBySurveyQuestion(surveyQuestionId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("surveyQuestionId=");
			msg.append(surveyQuestionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSurveyQuestionOptionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the survey question options before and after the current survey question option in the ordered set where surveyQuestionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param surveyQuestionOptionId the primary key of the current survey question option
	 * @param surveyQuestionId the survey question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next survey question option
	 * @throws com.jhu.cvrg.portal.survey.NoSuchSurveyQuestionOptionException if a survey question option with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SurveyQuestionOption[] findBySurveyQuestion_PrevAndNext(
		long surveyQuestionOptionId, long surveyQuestionId,
		OrderByComparator orderByComparator)
		throws NoSuchSurveyQuestionOptionException, SystemException {
		SurveyQuestionOption surveyQuestionOption = findByPrimaryKey(surveyQuestionOptionId);

		Session session = null;

		try {
			session = openSession();

			SurveyQuestionOption[] array = new SurveyQuestionOptionImpl[3];

			array[0] = getBySurveyQuestion_PrevAndNext(session,
					surveyQuestionOption, surveyQuestionId, orderByComparator,
					true);

			array[1] = surveyQuestionOption;

			array[2] = getBySurveyQuestion_PrevAndNext(session,
					surveyQuestionOption, surveyQuestionId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyQuestionOption getBySurveyQuestion_PrevAndNext(
		Session session, SurveyQuestionOption surveyQuestionOption,
		long surveyQuestionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SURVEYQUESTIONOPTION_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(surveyQuestionOption);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SurveyQuestionOption> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the survey question options.
	 *
	 * @return the survey question options
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestionOption> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the survey question options.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey question options to return
	 * @param end the upper bound of the range of survey question options to return (not inclusive)
	 * @return the range of survey question options
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestionOption> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the survey question options.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey question options to return
	 * @param end the upper bound of the range of survey question options to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of survey question options
	 * @throws SystemException if a system exception occurred
	 */
	public List<SurveyQuestionOption> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<SurveyQuestionOption> list = (List<SurveyQuestionOption>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SURVEYQUESTIONOPTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYQUESTIONOPTION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SurveyQuestionOption>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SurveyQuestionOption>)QueryUtil.list(q,
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
	 * Removes all the survey question options where surveyQuestionId = &#63; from the database.
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySurveyQuestion(long surveyQuestionId)
		throws SystemException {
		for (SurveyQuestionOption surveyQuestionOption : findBySurveyQuestion(
				surveyQuestionId)) {
			remove(surveyQuestionOption);
		}
	}

	/**
	 * Removes all the survey question options from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SurveyQuestionOption surveyQuestionOption : findAll()) {
			remove(surveyQuestionOption);
		}
	}

	/**
	 * Counts all the survey question options where surveyQuestionId = &#63;.
	 *
	 * @param surveyQuestionId the survey question id to search with
	 * @return the number of matching survey question options
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySurveyQuestion(long surveyQuestionId)
		throws SystemException {
		Object[] finderArgs = new Object[] { surveyQuestionId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SURVEYQUESTION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYQUESTIONOPTION_WHERE);

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
	 * Counts all the survey question options.
	 *
	 * @return the number of survey question options
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

				Query q = session.createQuery(_SQL_COUNT_SURVEYQUESTIONOPTION);

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
	 * Initializes the survey question option persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.jhu.cvrg.portal.survey.model.SurveyQuestionOption")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SurveyQuestionOption>> listenersList = new ArrayList<ModelListener<SurveyQuestionOption>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SurveyQuestionOption>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SurveyQuestionOptionImpl.class.getName());
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
	private static final String _SQL_SELECT_SURVEYQUESTIONOPTION = "SELECT surveyQuestionOption FROM SurveyQuestionOption surveyQuestionOption";
	private static final String _SQL_SELECT_SURVEYQUESTIONOPTION_WHERE = "SELECT surveyQuestionOption FROM SurveyQuestionOption surveyQuestionOption WHERE ";
	private static final String _SQL_COUNT_SURVEYQUESTIONOPTION = "SELECT COUNT(surveyQuestionOption) FROM SurveyQuestionOption surveyQuestionOption";
	private static final String _SQL_COUNT_SURVEYQUESTIONOPTION_WHERE = "SELECT COUNT(surveyQuestionOption) FROM SurveyQuestionOption surveyQuestionOption WHERE ";
	private static final String _FINDER_COLUMN_SURVEYQUESTION_SURVEYQUESTIONID_2 =
		"surveyQuestionOption.surveyQuestionId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyQuestionOption.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SurveyQuestionOption exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SurveyQuestionOption exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(SurveyQuestionOptionPersistenceImpl.class);
}