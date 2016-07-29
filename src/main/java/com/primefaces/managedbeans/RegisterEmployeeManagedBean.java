package com.primefaces.managedbeans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.primefaces.hibernate.data.pojo.Employee;
import com.spring.service.EmployeeService;

/*
 * 
 *  DDB notes:
RegisterEmployeeManaged Bean is developed with 
using of @ManagedProperty annotation that will help you get a 
Spring EmployeeService instance injected. That association won’t 
be applicable if you don’t provide a special faces-config.xml 
file that contains a newly added Spring’s el-resolver. 
	<el-resolver>org.springframework.web.jsf.el.SpringBeanFacesELResolver</el-resolver>

 */

@ManagedBean
@SessionScoped
public class RegisterEmployeeManagedBean implements Serializable{

	@ManagedProperty("#{employeeService}")
	private EmployeeService employeeService;

	private Employee employee = new Employee();

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String register() {
		// Calling Business Service
		employeeService.register(employee);
		// Add message
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("The Employee "+this.employee.getEmployeeName()+" Is Registered Successfully"));
		return "";
	}
}
