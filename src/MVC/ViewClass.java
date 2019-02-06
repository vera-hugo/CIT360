/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author David Vera
 */
public class ViewClass extends JFrame{
    
        private JTextField firstNumber  = new JTextField(10);
	private JButton functionButton = new JButton("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
        

	
	ViewClass(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		functionButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(functionButton.getText()=="+") {
					functionButton.setText("-");
				}
				else if(functionButton.getText()=="-") {
					functionButton.setText("*");
				}
				else if(functionButton.getText()=="*") {
					functionButton.setText("/");
				}
				else  {
					functionButton.setText("+");
				}
			}
			
		});
		
		calcPanel.add(firstNumber);
		calcPanel.add(functionButton);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}
	
	public String getFunction(){
		
		return functionButton.getText();
		
	}
	
	public void getCalcSolution(){
		
		return;

		
	}
	
	public void setCalcSolution(double d){
		
		calcSolution.setText(Double.toString(d));
		
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}
	
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
    
}
