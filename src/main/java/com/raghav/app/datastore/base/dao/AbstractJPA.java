/**
 * 
 */
package com.raghav.app.datastore.base.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;

import com.raghav.app.datastore.base.dataobject.BaseDO;
import com.raghav.app.datastore.base.exception.DataAccessException;

/**
 * @author Raghav Prabhu
 * @version 1.0
 */
public abstract class AbstractJPA<T extends BaseDO> implements Dao<T> {

	protected EntityManagerFactory entityManagerFactory;
	protected EntityManager entityManager;
	
			
	/**
	 * @return the entityManagerFactory
	 */
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	/**
	 * @param entityManagerFactory the entityManagerFactory to set
	 */
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param entityManager
	 *            the entityManager to set
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManagerFactory=Persistence.createEntityManagerFactory("hcs_mongodb_manager");
		this.entityManager = entityManagerFactory.createEntityManager();

	}

	/* (non-Javadoc)
	 * @see com.raghav.hcs.base.dao.Dao#save(com.raghav.hcs.base.dataobject.BaseHCSDO)
	 */
	public void save(T domainObject) {
		try {
			this.entityManager.persist(domainObject);
		} catch (Exception e) {

			throw new DataAccessException("Exception saving "
					+ domainObject.getClass().getName(), e);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.raghav.hcs.base.dao.Dao#update(com.raghav.hcs.base.dataobject.BaseHCSDO)
	 */
	public void update(T domainObject,String id) {
		try {
		
					
			this.entityManager.merge(domainObject);
	} catch (Exception e) {
        e.printStackTrace();
		/*throw new DataAccessException("Exception saving "
				+ domainObject.getClass().getName(), e);*/
	}
		
	}

	/* (non-Javadoc)
	 * @see com.raghav.hcs.base.dao.Dao#save(java.util.Collection)
	 */
	public void save(Collection<T> domainObjects) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.raghav.hcs.base.dao.Dao#get(java.lang.Class, int)
	 */
	public T get(Class<T> domainClass, String id) {
		try {
			return entityManager.find(domainClass, id);
			} catch (Exception e) {

				throw new DataAccessException("Exception fetching "
						+ domainClass.getName(), e);
			}
	}

	
	/* (non-Javadoc)
	 * @see com.raghav.hcs.base.dao.Dao#getAll(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public Collection<T> getAll(Class<T> domainClass) {
		String queryStr = "select c from " + domainClass.getSimpleName() + " c";
		Query query = entityManager.createQuery(queryStr);
		return query.getResultList();
	}
	
	/**
	 * This method will fecth results based on object attribute values. It tries
	 * to mimic Hibernate Criteria API functionality but limited by primitive
	 * types i.e. only primitive attributes value should be populated and passed
	 * to this method. NOTE: ONLY PRIMITIVE TYPE ATTRIBUTES WILL WORK, COMPLEX
	 * TYPE ATTRIBUTES WON'T WORK!!!
	 */
	public List<T> get(Class<T> domainClass, T domainObject) {

		List<T> results = new ArrayList<T>();

		@SuppressWarnings("rawtypes")
		Map props = null;

		try {
			props = BeanUtils.describe(domainObject);
		} catch (Exception e) {
			return null;
		}

		String queryStr = "select c from "
				+ domainObject.getClass().getSimpleName() + " c where ";
		if (props != null) {
			for (Object key : props.keySet()) {
				if (!key.equals("class") && !(key.equals("updatedDate"))) {
					Object value = props.get(key);
					if (value != null && !(value.equals("0"))
							&& !(value.equals("0.0"))) {
						try {
							ConvertUtils.convert(props.get(key), PropertyUtils
									.getPropertyType(domainObject,
											key.toString()));
							queryStr += "c." + key + " =:" + key + " and ";
						} catch (Exception e) {
						}
					}
				}
			}

			queryStr = queryStr.substring(0, queryStr.indexOf("and"));
			Query query = entityManager.createQuery(queryStr);
			for (Object key : props.keySet()) {
				if (!key.equals("class")) {
					if (props.get(key) != null) {
						try {
							Object obj = ConvertUtils.convert(props.get(key),
									PropertyUtils.getPropertyType(domainObject,
											key.toString()));
							query.setParameter(key.toString(), obj);
						} catch (Exception e) {
						}
					}
				}
			}

			System.out.println(queryStr);
			@SuppressWarnings("unchecked")
			List<T> resultList = query.getResultList();
			if (resultList != null) {
				results.addAll(resultList);
			}
		}

		return results;
	}

	/* (non-Javadoc)
	 * @see com.raghav.hcs.base.dao.Dao#delete(com.raghav.hcs.base.dataobject.BaseHCSDO, java.lang.Integer)
	 */
	public void delete(Class<T> domainClass, String id) {
		try {
			
			T domain=(T) this.entityManager.find(domainClass, id);
			this.entityManager.remove(domain);
		} catch (Exception e) {

			throw new DataAccessException("Exception deleting "
					+ domainClass.getName(), e);
		}
		
		
	}

	/* (non-Javadoc)
	 * @see com.raghav.hcs.base.dao.Dao#deleteAll(java.util.Collection)
	 */
	public void deleteAll(Collection<T> domainObjectList) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	

}
