/*package com.primefaces.hibernate.sampletest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.primefaces.hibernate.data.pojo.Employee;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

 DDB Notes: 
 * Hibernate 4 is used for Testing purpose, this version of hibernate isn’t 
 * applicable when it comes to integrate with Spring 4. 
 * 
 * To integrate with Spring 4, you are requested to use Hibernate 3.
 Using of latest version of hibernate requires you to use
 StandardServiceRegistryBuilder to build SessionFactory.

 <dependency>
 <groupId>org.hibernate</groupId>
 <artifactId>hibernate-core</artifactId>
 <version>4.3.5.Final</version>
 <scope>provided</scope>
 </dependency>
 -----------------OR --------
 <dependency>
 <groupId>org.hibernate</groupId>
 <artifactId>hibernate-core</artifactId>
 <version>3.6.10.Final</version>
 </dependency>
 * 
 
public class SampleHibernateMain {

	public static void main(String[] args) {
		// Create a configuration instance
		Configuration configuration = new Configuration();
		// Provide configuration file
		configuration.configure("hibernate.cfg.xml");
		// Build a SessionFactory
		SessionFactory factory = configuration
				.buildSessionFactory(new StandardServiceRegistryBuilder()
						.configure().build());
		// Get current session, current session is already associated with
		// Thread
		Session session = factory.getCurrentSession();
		// Begin transaction, if you would like save your instances, your
		// calling of save must be associated with a transaction
		session.getTransaction().begin();
		// Create employee
		Employee emp = new Employee();
		emp.setEmployeeName("Peter Jousha");
		emp.setEmployeeSalary(2000);
		emp.setEmployeeHireDate(new Date());
		// Save
		session.save(emp);
		// Commit, calling of commit will cause save an instance of employee
		session.getTransaction().commit();
	}
}
*/