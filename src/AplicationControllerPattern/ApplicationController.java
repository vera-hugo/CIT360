/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicationControllerPattern;

import java.util.HashMap;

/**
 *
 * @author David Vera
 */
public class ApplicationController {
    
    public static HashMap<String, DoingMathStuff> mathCommands = new HashMap<String, DoingMathStuff>();
    
    public void ApplicationController() {
        
    }
    
    public static double handleMathCommands(String operator, int firstinput, int secondinput) {
        
        mathCommands.put("+", new Addition());
        mathCommands.put("-", new Subtraction());
        mathCommands.put("*", new Multiplication());
        mathCommands.put("/", new Division());
        mathCommands.put("^", new Power());
        mathCommands.put("Mean", new MathMean());

        DoingMathStuff mathCalc = mathCommands.get(operator);
        
        return mathCalc.execute(firstinput, secondinput);
    }
    
}
