package practice.algorithms.sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSortMethod(intArray, 0, intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSortMethod (int[] input, int start, int end) {
        if (end - start < 2) {
            // this means we're dealing with one element array
            return;
        }

        // now figure out the position of pivot
        int pivotIndex = partition(input, start, end);

        // now, once we have our pivot element,
        // we'll sort our subarray left to the pivot element
        // and sort the subarray in the right side of the pivot element
        quickSortMethod(input, start, pivotIndex);
        quickSortMethod(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first input as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
