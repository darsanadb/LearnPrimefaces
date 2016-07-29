package com.primefaces.managedbeans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.primefacesjsf.pojo.Employee;

/* This program is written by DDB */

@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean implements Serializable{

	private List<Employee> employees = new ArrayList<Employee>();
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@PostConstruct
	public void populateEmployeeList(){
		for(int i = 1 ; i <= 10 ; i++){
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("Employee#"+i);
			this.employees.add(emp);
		}
	}

}
