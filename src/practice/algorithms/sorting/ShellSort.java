package practice.algorithms.sorting;

import practice.algorithms.utils.AlgoUtils;

import java.util.Arrays;

/**
 * Shell Sort Algo
 *
 * It's an in-place algorithm (means we didn't have to create another
 * array to perform the sort).
 * As long as the extra memory you're using doesn't depend on the
 * input array, it's an in-place algorithm.
 *
 * Calculating Time Complexity:
 * Difficult to nail down the time complexity because it will depend on the gap.
 *
 * Worst Case Complexity: O(n2), but it can perform much better than that.
 *
 * It doesn't require as much shifting as insertion sort, so it usually performs better.
 *
 * It's an unstable algorithm
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

public class ShellSort {
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
        int gap = arr.length / 2;

        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];

                int j = i;

                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = newElement;
            }

            gap = gap / 2;
        }
    }
}
