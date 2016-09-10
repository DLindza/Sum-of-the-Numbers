package lindsay.devon.SumoftheNumbers;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by devonlindsay on 9/9/16.
 */
public class NumSum {
    //Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
static int sum = 0;

    public static int numSum() {

        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        for (int i = 1; i <= userNum; i++) {

            sum += i;

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Enter a postive number");

      numSum();
        System.out.println("The factorial of your number is: " + sum);


        }
    }


