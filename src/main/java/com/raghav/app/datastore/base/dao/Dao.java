package com.raghav.app.datastore.base.dao;

import java.util.Collection;
import java.util.List;

import com.raghav.app.datastore.base.dataobject.BaseHCSDO;



/**
 * 
 * @author Raghav Prabhu
 * @version 1.0
 * @param <T>
 */
public interface Dao<T extends BaseHCSDO> {

	/**
	 * This method is used to save domain object to the database. Persisted
	 * classes implement the DomainObject interface by extending the
	 * AbstractDomainObject class.
	 * 
	 * @param domainObject
	 *            - the object to be persisted
	 */
	void save(T domainObject);
	
	/**
	 * This method is used to update domain object to the database. Persisted
	 * classes implement the DomainObject interface by extending the
	 * AbstractDomainObject class.
	 * 
	 * @param domainObject
	 *            - the object to be persisted
	 */
	void update(T domainObject,String id);
	
	
	/**
	 * This method is used to save a collection of any domain objects to the
	 * database. Persisted classes implement the DomainObject interface by
	 * extending the AbstractDomainObject class.
	 * 
	 * @param domainObjects
	 *            - collection to be persisted
	 */
	void save(Collection<T> domainObjects);

	/**
	 * This method retrieves a persisted domain object from the database.
	 * 
	 * @param domainClass
	 *            - the class type to be retrieved
	 * @param id
	 *            - the id of the object to be retrieved
	 * @return - the domain object identified by the id
	 */
	T get(Class<T> domainClass, String id);
	
	/**
	 * This method retrieves a persisted domain object from the database based on given object values (object query)
	 * It tries to mimic Hibernate Criteria API functionality but limited by primitive types i.e. only primitive attributes value
	 * should be populated and passed to this method.
	 * NOTE: ONLY PRIMITIVE TYPE ATTRIBUTES WILL WORK, COMPLEX TYPE ATTRIBUTES WON'T WORK!!!
	 * @param domainClass - class type to be retrieved
	 * @param domainObject - object with query values
	 * @return List of result objects
	 */
	List<T> get(Class<T> domainClass, T domainObject);

	/**
	 * This method returns a collection of all objects of the given class.
	 * 
	 * @param domainClass
	 *            - type of objects to retrieve
	 * @return - Collection of the domainClass objects
	 */
	Collection<T> getAll(Class<T> domainClass);

	/**
	 * This method deletes the persisted domain object from the database.
	 * 
	 * @param domainObject
	 *            - the domain object to be deleted
	 */
	void delete(Class<T> domainClass, String id);

	/**
	 * Delete all given persistent instances of domain objects from the
	 * database.
	 * 
	 * @param domainObjectList
	 *            - the list of domain object to be deleted.
	 */
	void deleteAll(Collection<T> domainObjectList);

}
