/**
 * 
 */
package org.tife.core;

import static org.junit.Assert.fail;

import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;
import org.tife.core.entity.Employee;
import static org.junit.Assert.*;
/**
 * @author a.memon
 * 
 * @version 1.0-SNAPSHOT
 */
public class TestEmployeeManager extends BaseTest {
	EmployeeManager em;

	@Before
	public void setup(){
		try {
			em = (EmployeeManager) ctx.lookup("EmployeeManagerBean/remote");
		} catch (NamingException e) {
			fail();
		}
	}
	
	@Test
	public void testEmployeeUtil(){
		System.out.println("\n\tSample Employees Data\n");
		System.out.println("\t=====================");
		for (Employee e : TestUtil.getEmployees()){
			System.out.println(e.getFirstName());
			System.out.println(e.getLastName());
			System.out.println(e.getAddress().getCountry());
			System.out.println();
		}
	}
	
	@Test
	public void testAddEmployee(){
		em.addEmployee(TestUtil.getEmployees()[0]);
	}
}
