package com.spring.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.primefaces.hibernate.data.pojo.Employee;

@Component
public class EmployeeService {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void register(Employee emp){
		// Acquire session
		Session session = sessionFactory.getCurrentSession();
		// Save employee, saving behavior get done in a transactional manner
		session.save(emp);
	}
	/*
	 * 
	 * Transaction Manager will help you eliminate using a snippet of code 
	 * like session.getTransaction().begin() and commit(). 
	 * @Transactional annotation will be used alternatively. 
	 * That’s mean, executing of any Spring Service’s methods annotated with 
	 * @Transactional will be done in a Transnational manner. 
	 * In case you’ve called a CRUD operation against your session 
	 * within a Transnational scope like session.save(), 
	 * it will be executing directly into your own database 
	 * at the end of called method. That’s called Transaction Demarcation.
	 * 
	 * @Transactional annotation is used for Transaction Demarcation purpose. 
	 * Transaction demarcation is used for associating your contextual 
	 * session with an active Transaction. That will cause a 
	 * CRUD operation to get executed against your own database. 
	 * You should go through Spring Declarative Transaction Management Example.
	 */

}
