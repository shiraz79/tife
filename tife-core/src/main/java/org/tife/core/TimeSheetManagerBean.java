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
import org.tife.core.entity.TimeSheetEntry;

/**
 * @author a.memon
 *
 * @version 1.0-SNAPSHOT
 */
@Stateless
@Remote(value = { TimeSheetManager.class })
public class TimeSheetManagerBean implements TimeSheetManager{
	Logger logger = Logger.getLogger(TimeSheetManagerBean.class);
	/* (non-Javadoc)
	 * @see org.tife.core.TimeSheetManager#stampIn(org.tife.core.entity.Employee, org.tife.core.entity.TimeSheet)
	 */
	
	@PersistenceContext(unitName = "tifedb")
	EntityManager em;
	
	@Override
	public void stampIn(Employee e) {
		logger.info("stamping in");
		TimeSheetEntry te = new TimeSheetEntry();
		te.setEmployee(e);
		em.persist(te);
	}

	/* (non-Javadoc)
	 * @see org.tife.core.TimeSheetManager#stampOut(org.tife.core.entity.Employee, org.tife.core.entity.TimeSheet)
	 */
	@Override
	public void stampOut(Employee e) {
		logger.info("stamping out");
		
	}

}
