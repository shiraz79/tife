/**
 * 
 */
package org.tife.core;

import org.tife.core.entity.Employee;
import org.tife.core.entity.TimeSheetEntry;

/**
 * @author a.memon
 *
 * @version 1.0-SNAPSHOT
 */
public interface TimeSheetManager {
	public void stampIn(Employee e);
	public void stampOut(Employee e);
	
}
