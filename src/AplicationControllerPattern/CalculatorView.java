/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicationControllerPattern;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author David Vera
 */
public class CalculatorView {
    
    public void CalculatorView() {
        
    }
    
    public void doMathInput() throws IOException {
        ApplicationController handle = new ApplicationController();
        int firstinput;
        int secondinput;
        String operator;
        
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter your first number: ");
            firstinput = Integer.parseInt(in.nextLine());
            System.out.println("Enter a math operator (+, -, *, /, ^, Mean): ");
            operator = in.nextLine();
            System.out.println("Enter your second number: ");
            secondinput = Integer.parseInt(in.nextLine());

            System.out.print("\n" + firstinput + " " + operator + " " + secondinput + " = ");
            System.out.println(handle.handleMathCommands(operator, firstinput, secondinput));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
