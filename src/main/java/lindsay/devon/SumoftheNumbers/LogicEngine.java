package lindsay.devon.SumoftheNumbers;

import java.util.Scanner;

/**
 * Created by devonlindsay on 9/9/16.
 */
public class LogicEngine {
    //Write a program that asks the user for a number n and prints the sum of the numbers 1 to n


    public void logicEngine() {
        Display display = new Display();
        int value1 = display.getUserInt();

        Calculator cal = new Calculator();

        display.displayMessage(cal.calculate(value1));




        }
    }


