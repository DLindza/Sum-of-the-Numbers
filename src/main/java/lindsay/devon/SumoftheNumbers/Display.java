package lindsay.devon.SumoftheNumbers;
import java.util.Scanner;
/**
 * Created by devonlindsay on 9/10/16.
 */
public class Display {

    public int getUserInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive whole number: ");
        return scanner.nextInt();

    }

    public void displayMessage(int output) {
        System.out.println("The factorial of your number is: " + output);
    }


}
