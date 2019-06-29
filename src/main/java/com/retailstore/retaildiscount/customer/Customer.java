package com.retailstore.retaildiscount.customer;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7968105649952450018L;

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "CUSTOMER_ID")
	private String customerId;

	@Column(name = "CUSTOMER_TYPE")
	private String customerType;

	@Column(name = "JOINING_DATE")
	private Timestamp joiningDate;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, String customerId, String customerType,
			Timestamp joiningDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
		this.customerType = customerType;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", customerId="
				+ customerId + ", customerType=" + customerType + ", joiningDate=" + joiningDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Timestamp getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Timestamp joiningDate) {
		this.joiningDate = joiningDate;
	}

}
