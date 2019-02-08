/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.JSONObject;



/**
 *
 * @author David Vera
 */
public class JSONWriter {
    
    public static void main(String[] args) throws FileNotFoundException {
        // New JSON Object created
        JSONObject obj = new JSONObject();
        //JSONObject obj1 = new JSONObject();
        // Adding data to my newly formed JSON Object
        obj.put("fname", "Hugo David");
        obj.put("lname", "Vera Moreira");
        obj.put("age", 37);
        obj.put("id", 1308145000);
        obj.put("state", "Manabí");
        obj.put("country", "Ecuador");
        obj.put("phonenumber", 981288188);
        
        /*obj1.put("fname", "Nickole");
        obj1.put("lname", "Vera");
        obj1.put("age", 19);
        obj1.put("id", 1308145001);*/
        
        // Writing simple JSON to a file created here
        PrintWriter print = new PrintWriter("C:\\Users\\David Vera\\Documents\\NetBeansProjects\\CIT360\\WEEK2\\src\\JSON2\\student.json");
        print.write(obj.toString());
        //print.write(obj1.toString());
        
        print.flush();
        print.close();
    }
    
}
