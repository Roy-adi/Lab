package com.sechibernate.proHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {

	public static Session makeSession() {
		Configuration cfg = new Configuration();
        System.out.println("done..");
        cfg.configure("hibernate.cfg.xml");
        System.out.println("done....");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        return session;
	}
}
