package lindsay.devon.SumoftheNumbers;

/**
 * Created by devonlindsay on 9/10/16.
 */
public class Calculator {
    int sum = 0;

    public int calculate(int userNum) {
        for (int i = 1; i <= userNum; i++) {
            sum += i;
            }
        return sum;

    }
}
