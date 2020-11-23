package practice.algorithms.recursion;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int inputNum = 10;
        int result = factorial(inputNum);

        long endTime = System.currentTimeMillis();
        System.out.println("Factorial of " + inputNum + " is : " + result);
        System.out.println("This program took "
                + (endTime - startTime)
                + "ms");
    }

    private static int factorial (int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}
