package practice.algorithms.sorting;

import practice.algorithms.utils.AlgoUtils;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = AlgoUtils.getInputArrayForSortingAlgorithm();
        long startTime = System.currentTimeMillis();

        sort(arr, 0, arr.length);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("This program took "
                + (endTime - startTime)
                + "ms");
    }

    public static void sort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (end + start) / 2;

        // sort left side
        sort(arr, start, mid);

        // sort right side
        sort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        if (arr[mid - 1] <= arr[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }
}
