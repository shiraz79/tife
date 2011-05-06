/**
 * 
 */
package org.tife.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author a.memon
 * 
 * @version 1.0-SNAPSHOT
 */
@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private Date dob;

	@OneToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name = "add_fk")
	private Address address;
	
	@OneToMany(mappedBy="employee")
	private List<TimeSheetEntry> timeSheets;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the address
	 */

	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the timeSheets
	 */
	
	public List<TimeSheetEntry> getTimeSheets() {
		return timeSheets;
	}

	/**
	 * @param timeSheets
	 *            the timeSheets to set
	 */
	public void setTimeSheets(List<TimeSheetEntry> timeSheets) {
		this.timeSheets = timeSheets;
	}

}
