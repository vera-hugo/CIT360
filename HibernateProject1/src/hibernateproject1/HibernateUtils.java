/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject1;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author David Vera
 */

public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory()
    {
        try {
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                    configure("hibernateproject1/hibernate.cfg.xml").build();
            
            Metadata metadata = new MetadataSources(serviceRegistry).
                    getMetadataBuilder().build();
            
            return metadata.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creeation failed." + ex);
            
            throw new ExceptionInInitializerError(ex);
        }   
    }
    
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    
    public static void shutdown()
    {
        getSessionFactory().close();
    }
}