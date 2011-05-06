/**
 * 
 */
package org.tife.core;

import java.util.Date;

import org.tife.core.entity.Address;
import org.tife.core.entity.Employee;

/**
 * @author a.memon
 * 
 * @version 1.0-SNAPSHOT
 */
public class TestUtil {
	static String[] firstName = { "John", "Paul", "Mike", "Sam" };
	static String[] lastName = { "McKane", "Aristo", "Adler", "Oetinger" };
	@SuppressWarnings("deprecation")
	static Date[] dob = { new Date(1978, 12, 12), new Date(1976, 8, 1),
			new Date(1977, 9, 2), new Date(1978, 10, 3) };
	static String[] city = { "London", "Newyork", "Berlin", "Toronto" };
	static String[] country = { "UK", "US", "Germany", "Canada" };
	
	public static Employee[] getEmployees() {
		Employee[] eArr = new Employee[4];
		for (int i = 0; i < eArr.length; i++) {
			Employee e = new Employee();
			Address a = new Address();
			a.setCity(city[i]);
			a.setCountry(country[i]);
			a.setHouseNumber(new Long(Math.round((i+1)*10.0)).toString());
			a.setStreet(city[i]+" street" + String.valueOf(i+1));
			e.setDob(dob[i]);
			e.setFirstName(firstName[i]);
			e.setLastName(lastName[i]);
			e.setAddress(a);
			eArr[i] = e;
		}
		return eArr;
	}
	
	public static void main(String[] args) {
		Employee[] e = getEmployees();
		for (int i = 0; i < getEmployees().length; i++) {
			
			System.out.println(e[i].getFirstName());
		}
	}
}
