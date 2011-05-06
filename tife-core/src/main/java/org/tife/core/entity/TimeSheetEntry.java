/**
 * 
 */
package org.tife.core.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author a.memon
 * 
 * @version 1.0-SNAPSHOT
 */
@Entity
public class TimeSheetEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(insertable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date stampIn;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date stampOut;
	
	@ManyToOne
	@JoinColumn(name="employee_fk")
	private Employee employee;
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}
	/**
	 * @return the stampIn
	 */
	public Date getStampIn() {
		return stampIn;
	}
	/**
	 * @param stampIn the stampIn to set
	 */
	public void setStampIn(Date stampIn) {
		this.stampIn = stampIn;
	}
	/**
	 * @return the stampOut
	 */
	public Date getStampOut() {
		return stampOut;
	}
	/**
	 * @param stampOut the stampOut to set
	 */
	public void setStampOut(Date stampOut) {
		this.stampOut = stampOut;
	}
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
