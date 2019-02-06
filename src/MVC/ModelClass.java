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
public class ModelClass {
    
    // Holds the value of the sum of the numbers
	// entered in the view
	
	private double calculationValue;
	
	public void doCalc(int firstNumber, int secondNumber, String function){
		if(function=="+") {
			calculationValue = firstNumber + secondNumber;
		}
		else if(function=="-") {
			calculationValue = firstNumber - secondNumber;
		}
		else if(function=="*") {
			calculationValue = firstNumber * secondNumber;
		}
		else{
			calculationValue = firstNumber / (double) secondNumber;
		}
		
	}
	
	
	
	public double getCalculationValue(){
		
		return calculationValue;
		
	}
    
}
