package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        StandardServiceRegistry sr = srb.build();
        SessionFactory factory = cfg.buildSessionFactory(sr);
        Session session = factory.openSession();
        session.beginTransaction();
        WorkerMan workerMan = new WorkerMan();
        workerMan.setId(1);
        workerMan.setName("y");
        session.save(workerMan);
        session.getTransaction().commit();
        session.close();
        factory.close();
        System.out.println( "Hello World!" );
        
    }
}
