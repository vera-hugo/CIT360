/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicationControllerPattern;

/**
 *
 * @author David Vera
 */
public class MathMean implements DoingMathStuff {

    public MathMean() {
    } public double execute(int number1, int number2) {
        double result = Math.sqrt(number1*number2);
        return result;
    }
    
}
