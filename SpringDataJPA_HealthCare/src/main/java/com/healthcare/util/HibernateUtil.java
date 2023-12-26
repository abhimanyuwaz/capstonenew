package com.healthcare.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.healthcare.entity.Admin;
import com.healthcare.entity.Cart;
import com.healthcare.entity.Product;
import com.healthcare.entity.User;
import com.healthcare.entity.Wishlist;





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
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Wishlist.class);
		
		
		// STEP 2: create Session Factory object and return
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;

	}

}
