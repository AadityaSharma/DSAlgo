package practice.algorithms.sorting;

import practice.algorithms.utils.AlgoUtils;

import java.util.Arrays;

/**
 * Insertion Sort Algo
 *
 * It's an in-place algorithm (means we didn't have to create another
 * array to perform the sort).
 * As long as the extra memory you're using doesn't depend on the
 * input array, it's an in-place algorithm.
 *
 * O(n2) time complexity - quadratic
 * It's  stable algorithm
 *
 * It'll take:
 *  -- 100 steps to sort 10 items,
 *  -- 10,000 steps to sort 100 items,
 *  -- 1,000,000 steps to sort 1000 items
 *
 *  However, it doesn't require as much swapping as bubble sort
 *
 * So, we can say that, this algorithm degrades quickly.
 * Hence, should avoid using it (specially when the array size could be large)
 *
 * @author  Aaditya Sharma
 */

public class InsertionSort {
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

    public static void sort(int[] arr) {
        int unsortedArrayIndex = 1;

        while (unsortedArrayIndex < arr.length) {
            int newElement = arr[unsortedArrayIndex];
            int i;
            for (i = unsortedArrayIndex; i > 0 && arr[i-1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;

            unsortedArrayIndex++;
        }
    }
}
