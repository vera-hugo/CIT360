/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author David Vera
 */
public class ControllerClass {
    
    private ViewClass theView;
    private ModelClass theModel;
	
	public ControllerClass(ViewClass theView, ModelClass theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				String function = theView.getFunction();
				
				theModel.doCalc(firstNumber, secondNumber, function);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Numeric Values");
				
			}
			
		}
		
	}
    
}
