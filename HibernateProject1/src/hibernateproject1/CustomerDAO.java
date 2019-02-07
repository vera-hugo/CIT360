/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject1;

/**
 *
 * @author David Vera
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

/** TestDAO implemented using a singleton pattern
 *  Used to get customer data from my MYSQL database*/
public class CustomerDAO {

    SessionFactory factory = null;
    Session session = null;

    private static CustomerDAO single_instance = null;

    private CustomerDAO()
    {
        factory = HibernateUtils.getSessionFactory();
    }

    /** This is what makes this class a singleton.  You use this
     *  class to get an instance of the class. */
    public static CustomerDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new CustomerDAO();
        }

        return single_instance;
    }

    /** Used to get more than one customer from database
     *  Uses the OpenSession construct rather than the
     *  getCurrentSession method so that I control the
     *  session.  Need to close the session myself in finally.*/
    public List<Customer> getCustomer() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernateproject1.Customer";
            List<Customer> cs = (List<Customer>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    /** Used to get a single customer from database */
    public Customer getCustomer(int customerId) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Customer where id=" + Integer.toString(customerId);
            Customer c = (Customer)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return c;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}

