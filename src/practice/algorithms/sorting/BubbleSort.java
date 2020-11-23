package practice.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 32, 44, 23, 67, 23, 34, 46, 55, 83};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int maxLen = arr.length;
        while (maxLen > 0) {
            for (int i = 1; i < maxLen; i++) {
                if (arr[i] < arr[i - 1]) {
                    arr[i] = arr[i] + arr[i - 1];
                    arr[i - 1] = arr[i] - arr[i - 1];
                    arr[i] = arr[i] - arr[i - 1];
                }
            }
            maxLen--;
        }
    }
}
