/**
 * 
 */
package org.tife.core;

import org.tife.core.entity.Employee;

/**
 * @author a.memon
 *
 * @version 1.0.1-some experiment
 */
public interface EmployeeManager {
	public void addEmployee(Employee e);
	public void removeEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void findEmployeeById(Integer id);
}
