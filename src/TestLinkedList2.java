
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Vera
 */
public class TestLinkedList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> countries=new LinkedList<>();
        
        countries.add("Espain");
        countries.add("Ecuador");
        countries.add("Colombia");
        countries.add("Mexico");
        countries.add("Peru");
        
        LinkedList<String> capitals=new LinkedList<>();
        
        capitals.add("Madrid");
        capitals.add("Quito");
        capitals.add("Bogota");
        capitals.add("DF");
        capitals.add("Lima");
        
        //System.out.println(countries);
        //System.out.println(capitals);
        
        
        ListIterator<String> itcountries=countries.listIterator();
        ListIterator<String> itcapitals=capitals.listIterator();
        
        while(itcapitals.hasNext()){
        
            if(itcountries.hasNext()){
                
                itcountries.next();
            }
            
            itcountries.add(itcapitals.next());
        }
        System.out.println(countries); 
        
        itcapitals=capitals.listIterator();
        
        while(itcapitals.hasNext()){
        
            itcapitals.next();
            
            if(itcapitals.hasNext()){
            
                itcapitals.next();
                
                itcapitals.remove();
            }
        }
        
        System.out.println(capitals);
        
        countries.removeAll(capitals);
        
        System.out.println(countries);
    }
    
}
