package com.primefaces.hibernate.data.pojo;

import java.util.Date;


/*Primefaces Spring & Hibernate Integration Example Tutorial
 * 
 * We’ve discussed a Primefaces, Spring 
 * and Hibernate frameworks in a separate tutorials, 
 * but this time we will show you how can
 *  integrate all of them to create a layered (tiered) application.
 * 
 * Layered (tiered) application is a popular design that
 *  most of the enterprise applications are aligned with. 
 *  In which:

Primefaces framework will be used for handling all UI concerns 
and verify client’s inputs.
Hibernate framework will be used for communicating 
with your own persistence store that probably is a MySQL database.
Spring framework will be used to glue between all of these frameworks.

 * Before getting started delve into, 
 * let’s see the required tools that you would need:

Eclipse Kepler 4.3.
Hibernate 3.x.
Spring 4.x.
Primefaces 5.x.
JDK 1.6+.
MySQL 5.x.
 */

public class Employee {

	private long employeeId;
	private String employeeName;
	private Date employeeHireDate;
	private double employeeSalary;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getEmployeeHireDate() {
		return employeeHireDate;
	}

	public void setEmployeeHireDate(Date employeeHireDate) {
		this.employeeHireDate = employeeHireDate;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
