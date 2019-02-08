/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONTest;

import java.util.Scanner;
import org.json.simple.JSONObject;


/**
 *
 * @author David Vera
 */
public class JSONExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
	   JSONObject firstobj = new JSONObject();
	   JSONObject secondobj = new JSONObject();
	   
	   System.out.println("First Name: ");
	   String firstname = input.nextLine();
	   System.out.println("Last Name: ");
	   String lastname = input.nextLine();
	   System.out.println("Email: ");
	   String email = input.nextLine();
	   System.out.println("Phone: ");
	   String phone = input.nextLine();
	   
	  firstobj.put("Last Name: ", lastname);
	  firstobj.put("First Name: ", firstname);
	  firstobj.put("Email: ", email);
	  firstobj.put("Phone: ", phone);
	  
	  secondobj.put("Last Name: ", "Baque");
	  secondobj.put("First Name: ", "Guadalupe");
	  secondobj.put("Email: ", "mg_baquepuebla@hotmail.com");
	  secondobj.put("Phone: ", "0990048958");
	  
      System.out.print(firstobj);
      System.out.println();
      System.out.print(secondobj);
    }
    
}
