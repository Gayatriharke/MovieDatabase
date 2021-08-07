package com.tast.project.MovieDatabase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Class {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("Movie.cgf.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
//		 create a movie class object
		Movie m = new Movie();
		m.setActor_name("Salman khan");
		m.setDirector_name("Karan Johar");
		m.setPhone(2727899725l);
		m.setYear(2020);
		System.out.println(m);
		Session session = buildSessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(m);
		tx.commit();
		session.close();
		 
	}
}
