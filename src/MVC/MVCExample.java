/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author David Vera
 */
public class MVCExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ViewClass theView = new ViewClass();
        
    	ModelClass theModel = new ModelClass();
        
        ControllerClass theController = new ControllerClass(theView,theModel);
        
        theView.setVisible(true);
        
    
    }
    
}
