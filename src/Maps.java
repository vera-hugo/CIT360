/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author David Vera
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, employess> personal=new HashMap<String, employess>();
        
        personal.put("100", new employess("Ricardo"));
        personal.put("101", new employess("Juan"));
        personal.put("102", new employess("Alejandro"));
        personal.put("103", new employess("Nelson"));
        personal.put("104", new employess("Hernan"));
        
        System.out.println(personal);
        
        personal.remove("102");
        System.out.println(personal);
    }
    
}

class employess{

    public employess(String n){
        name=n;
        salary=2000;
    }
    
    public String toString(){
    
        return "[Name= " + name + ", salary" + salary + "]";
        
    }
    
    private String name;
    private double salary;
}
