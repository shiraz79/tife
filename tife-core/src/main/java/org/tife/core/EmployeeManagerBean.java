/**
 * 
 */
package org.tife.core;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.tife.core.entity.Employee;

/**
 * @author a.memon
 *
 * @version 1.0-SNAPSHOT
 */
@Stateless
@Remote (value = {EmployeeManager.class})
public class EmployeeManagerBean implements EmployeeManager{
	Logger logger= Logger.getLogger(EmployeeManagerBean.class);
	
	@PersistenceContext(unitName = "tifedb")
	EntityManager em;
	/* (non-Javadoc)
	 * @see org.tife.core.EmployeeManager#addEmployee(org.tife.core.entity.Employee)
	 */
	@Override
	public void addEmployee(Employee e) {
		logger.info("adding employee");
		em.persist(e);
		
	}

	/* (non-Javadoc)
	 * @see org.tife.core.EmployeeManager#removeEmployee(org.tife.core.entity.Employee)
	 */
	@Override
	public void removeEmployee(Employee e) {
		logger.info("removing employee");
		em.remove(e);
	}

	/* (non-Javadoc)
	 * @see org.tife.core.EmployeeManager#updateEmployee(org.tife.core.entity.Employee)
	 */
	@Override
	public void updateEmployee(Employee e) {
		logger.info("updating employee");
		em.merge(e);
	}

	/* (non-Javadoc)
	 * @see org.tife.core.EmployeeManager#findEmployeeById(java.lang.Integer)
	 */
	@Override
	public void findEmployeeById(Integer id) {
		logger.info("find employee by id");
		em.find(Employee.class, id);
		
	}

}
