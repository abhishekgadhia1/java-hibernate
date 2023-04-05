package com.practice.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println(factory);
        System.out.println(factory.isClosed());
        
        Student std = new Student();
        std.setId(101);
        std.setName("Johny");
        std.setCity("Raipur");
        
        System.out.println(std);
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(std);
        session.getTransaction().commit();
        session.close();
    }
}
