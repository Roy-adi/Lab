package com.sechibernate.proHibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Phibernate.Song;




public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtill.makeSession();   
     Song s = new Song();
     s.setId(10);
     s.setSong_name("abc");
     s.setSinger("xyx");
     System.out.println(s.getId()+" "+ s.getSong_name()+" "+s.getSinger());
     
     
     Transaction t = session.beginTransaction();
     session.save(t);
     t.commit();
     session.close();
     System.out.println("done");
     
     
     
        
    }
}
