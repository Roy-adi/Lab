package com.bookhibernate.exphibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bookhibernate.exphibernate.entity.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("ss");
    	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s = sf.openSession();
    	
       Book b = new Book();
       
       b.setId(101);
       b.setName("java");
       b.setPage(500);
       System.out.println(b.getId()+" "+b.getName()+" "+b.getPage());
       s.save(b);
       Transaction t = s.beginTransaction();
       t.commit();
        sf.close();
        s.close();
        System.out.println("done");
       
    }
}
