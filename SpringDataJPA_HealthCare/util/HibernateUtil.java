package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import com.simplilearn.entity.Airline;

import com.simplilearn.entity.Destination;
import com.simplilearn.entity.Flight;
import com.simplilearn.entity.Price;
import com.simplilearn.entity.Source;
import com.simplilearn.entity.UserLogin;


public class HibernateUtil {

	static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory != null)
			return sessionFactory;

		// STEP 1: Creating Configuration object and providing DB inforamation and
		// mapping information
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Admin.class);
		configuration.addAnnotatedClass(Cart.class);
		configuration.addAnnotatedClass(Products.class);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Wishlist.class);
		
		
		// STEP 2: create Session Factory object and return
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;

	}

}
