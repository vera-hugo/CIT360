/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON2;

import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONTokener;



/**
 *
 * @author David Vera
 */
public class JSONReader {
    
    public static void main(String[] args) throws Exception {
        
        // Parsing from my student.json file
        //Object json = new JSONTokener(response).nextValue();
         Object read = new JSONReader().parse(new FileReader("C:\\Users\\David Vera\\Documents\\NetBeansProjects\\CIT360\\WEEK2\\src\\JSON2\\student.json"));
        
        // Typecasting 
        JSONObject obj = (JSONObject) read;
        
        // Getting data from JSON file
        String firstname = (String) obj.get("fname");
        String lastname = (String) obj.get("lname");
        String age = (String) obj.get("age");
        String id = (String) obj.get("id");
        
        System.out.println(firstname); 
        System.out.println(lastname); 
    }

    private Object parse(FileReader fileReader) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

