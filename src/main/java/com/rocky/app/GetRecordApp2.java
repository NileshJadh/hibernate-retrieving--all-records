package com.rocky.app;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rocky.model.Student;

public class GetRecordApp2 {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().
				addAnnotatedClass(Student.class).buildSessionFactory();
		Session session1 = null;
		
		try {
			
			session1 = sessionFactory.openSession();
			// select * from studenttable
			
//			Query<Student> query = session1.createQuery("FROM Student WHERE scity=:city", Student.class);
			// this will return all the column
			
			Query<String> query = session1.createQuery("SELECT sname FROM Student WHERE scity IN(:city1,:city2)", String.class);
			// this is for specific column 
			query.setParameter("city1", "Pune");
			query.setParameter("city2", "Jalgoan");
			List<String> listStudent = query.list();
			
//			for(Student s: listStudent) {
//				System.out.println(s);
//			}
			
			listStudent.forEach((s)->System.out.println(s));
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
