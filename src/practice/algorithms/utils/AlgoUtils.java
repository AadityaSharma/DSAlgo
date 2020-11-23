package practice.algorithms.utils;

public class AlgoUtils {
    public static void swapInArr(int[] arr, int i, int j) {
        if (i == j || arr[i] == arr[j]) {
            return;
        }

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
