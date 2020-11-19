package practice.algorithms.basics;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        Integer[] sequence = new Integer[11];
        getFibonacciSequence(10, sequence);
        System.out.println(Arrays.toString(sequence));
    }

    static int getFibonacciSequence(int i, Integer[] arr) {
        if (i <= 1) {
            if (arr[i] == null) {
                arr[i] = i;
            }
            return i;
        }
        int nextVal = getFibonacciSequence(i - 2, arr) + getFibonacciSequence(i - 1, arr);
        if (arr[i] == null) {
            arr[i] = nextVal;
        }
        return nextVal;
    }
}
