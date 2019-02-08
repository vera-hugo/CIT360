/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON3;

import java.io.FileReader;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

/**
 *
 * @author David Vera
 */
public class JSONReader {
    
    public static void main(String[] args) throws Exception {
        
        // Parsing from my student.json file
        Object read = new JSONParser().parse(new FileReader("student.json"));
        
        // Typecasting 
        JSONObject obj = (JSONObject) read;
        
        // Getting data from JSON file
        String firstname = (String) obj.get("fname");
        String lastname = (String) obj.get("lname");
        
        System.out.println(firstname); 
        System.out.println(lastname); 
    }
}
