/**
 * 
 */
package org.tife.core;

import static org.junit.Assert.fail;

import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;
import org.tife.core.entity.Address;
import org.tife.core.entity.Employee;
import org.tife.core.entity.TimeSheetEntry;

import static org.junit.Assert.*;
/**
 * @author a.memon
 * 
 * @version 1.0-SNAPSHOT
 */
public class TimeStamperTest extends BaseTest {
	TimeSheetManager tm;

	@Before
	public void setup() {
		try {
			tm = (TimeSheetManager) ctx.lookup("TimeSheetManagerBean/remote");
		} catch (NamingException e) {
			fail();
		}
	}

	@Test
	public void testStampIn() {
		Employee e = new Employee();
		Address a = new Address();
		a.setCity("Kaula Lampur");
		a.setCountry("Malaysia");
		a.setHouseNumber("21");
		a.setStreet("Lordstr");
		e.setAddress(a);
		e.setFirstName("Oska");
		e.setLastName("Jamal");
		TimeSheetEntry te  = new TimeSheetEntry();
		te.setEmployee(e);
	}

	@Test
	public void testStampOut() {
		System.out.println("test stamp out");
	}
}
