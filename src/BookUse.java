/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Vera
 */
public class BookUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book book1=new Book("Be patient", "Jose Alonzo", 2354);
        Book book2=new Book("Be patient", "Jose Alonzo", 2355);
        
        //book1=book2;
        if(book1.equals(book2)){
            System.out.println("Is the same book");
            System.out.println(book1.hashCode());
            System.out.println(book2.hashCode());
        }else {
            System.out.println("Is not the same book");
            System.out.println(book1.hashCode());
            System.out.println(book2.hashCode());
        }
    }
    
}
