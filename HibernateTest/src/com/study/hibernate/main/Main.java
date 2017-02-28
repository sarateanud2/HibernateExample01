package com.study.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.study.hibernate.model.Stud;
import com.study.hibernate.util.HibernateUtil;


public class Main {

	public static void main(String[] args) {
		Stud student = new Stud();
		student.setName("Marin");
		student.setAge(28);
		student.setYear(4);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.persist(student);
		//Commit transaction
		session.getTransaction().commit();

		
		//terminate session factory, otherwise program won't end
		sessionFactory.close();
		System.out.println("successfully saved");  

	}

}
