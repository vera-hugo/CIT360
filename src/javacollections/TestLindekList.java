package javacollections;

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
public class TestLindekList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> peoples=new LinkedList<String>();
        
        peoples.add("John");
        peoples.add("Victor");
        peoples.add("Hugo");
        peoples.add("Laura");
        
        System.out.println(peoples.size());
        
        ListIterator<String> it=peoples.listIterator();
        
        it.next();
        
        it.add("David");
        
        for (String people : peoples){
            
            System.out.println(people);
        
        }
    }
    
}
