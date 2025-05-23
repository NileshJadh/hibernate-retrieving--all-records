package com.rocky.app;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rocky.model.Student;

public class GetRecordApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().
				addAnnotatedClass(Student.class).buildSessionFactory();
		Session session1 = null;
		
		try {
			
			session1 = sessionFactory.openSession();
			// select * from studenttable
			
			Query<Student> query = session1.createQuery("FROM Student", Student.class);
			List<Student> listStudent = query.list();
			
			for(Student s: listStudent) {
				System.out.println(s);
			}
			
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session1.close();
			sessionFactory.close();
		}
		
	}

}
