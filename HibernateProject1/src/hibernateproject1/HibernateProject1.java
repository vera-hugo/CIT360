/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject1;

import java.util.List;

/**
 *
 * @author David Vera
 */
public class HibernateProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CustomerDAO t = CustomerDAO.getInstance();

        List<Customer> c = t.getCustomers();
        for (Customer i : c) {
            System.out.println(i);
        }

        System.out.println(t.getCustomer(1));
    }
    
}
