/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicationControllerPattern;
import static java.lang.Math.pow;

/**
 *
 * @author David Vera
 */
public class Power implements DoingMathStuff {

    public double execute(int number1, int number2) {
        double result = pow(number1,number2);
        return result;
    }
}
