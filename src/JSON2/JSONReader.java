/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON2;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author David Vera
 */
public class JSONReader {
    
   
    
    public static void main(String[] args) throws Exception {
        
        //String test = "{"fname":"Hugo David","lname":"Vera Moreira","id":1308145000,"age":37}";
        // Parsing from my student.json file
        JSONParser read = new JSONParser();
                //.parse(new FileReader("C:\\Users\\David Vera\\Documents\\NetBeansProjects\\CIT360\\WEEK2\\src\\JSON2\\student.json"));
        
        // Typecasting 
        JSONObject obj = (JSONObject) read.parse(new FileReader("C:\\Users\\David Vera\\Documents\\NetBeansProjects\\CIT360\\WEEK2\\src\\JSON2\\student.json"));
                       
        // Getting data from JSON file
        String fname = (String) obj.get("fname");
        String lname = (String) obj.get("lname");
        long id = (long) obj.get("id");
        long age = (long) obj.get("age");
        String state = (String) obj.get("state");
        String country = (String) obj.get("country");
        long phonenumber = (long) obj.get("phonenumber");
        
        
        System.out.println(fname); 
        System.out.println(lname); 
         System.out.println(id);
        System.out.println(age);
        System.out.println(state);
        System.out.println(country);
        System.out.println(phonenumber);
       
    }

          
    
}

