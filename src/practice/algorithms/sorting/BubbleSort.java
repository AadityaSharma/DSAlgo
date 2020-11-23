package practice.algorithms.sorting;

import java.util.Arrays;

import practice.algorithms.utils.AlgoUtils;

/**
 * Bubble Sort Algo
 *
 * It's an in-place algorithm (means we didn't have to create another
 * array to perform the sort)
 *
 * O(n2) time complexity - quadratic
 *
 * It'll take:
 *  -- 100 steps to sort 10 items,
 *  -- 10,000 steps to sort 100 items,
 *  -- 1,000,000 steps to sort 1000 items
 *
 * So, we can say that, this algorithm degrades quickly.
 * Hence, should avoid using it (specially when the array size could be large)
 *
 * @author  Aaditya Sharma
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = AlgoUtils.getInputArrayForSortingAlgorithm();
        long startTime = System.currentTimeMillis();
        sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("This program took "
                + (endTime - startTime)
                + "ms");
    }

    private static void sort(int[] arr) {
        int maxLen = arr.length;
        while (maxLen > 0) {
            for (int i = 1; i < maxLen; i++) {
                if (arr[i] < arr[i - 1]) {
                    AlgoUtils.swapInArr(arr, i, i - 1);
                }
            }
            maxLen--;
        }
    }
}
