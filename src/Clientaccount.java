
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Vera
 */
public class Clientaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Client cl1=new Client ("George Clooney", "00001", 100000);
        Client cl2=new Client ("Richard Gere", "00002", 200000);
        Client cl3=new Client ("Thomas Monson", "00003", 300000);
        Client cl4=new Client ("Nefi Moroni", "00004", 5000000);
        
        Set <Client> BankClients=new HashSet<Client>();
        
        BankClients.add(cl1);
        BankClients.add(cl2);
        BankClients.add(cl3);
        BankClients.add(cl4);
        
        for (Client Client : BankClients) {
            System.out.println(Client.getName()+ " " + Client.getNumberaccount()+ " " + Client.getBalance() );
        }
    }
    
}
