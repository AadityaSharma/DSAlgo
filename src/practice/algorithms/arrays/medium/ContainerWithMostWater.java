package practice.algorithms.arrays.medium;

/**
 * @see: {https://leetcode.com/problems/container-with-most-water/}
 * @see: {https://github.com/AadityaSharma/DSAlgo/issues/1}
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println("Test 1 passed? :" + (maxArea(new int[] {1,1}) == 1));
        System.out.println("Test 2 passed? :" + (maxArea(new int[] {4,3,2,1,4}) == 16));
        System.out.println("Test 3 passed? :" + (maxArea(new int[] {1,2,1}) == 2));
        System.out.println("Test 4 passed? :" + (maxArea(new int[] {4,8,1,2,5,9}) == 32));
        System.out.println("Test 5 passed? :" + (maxArea(new int[] {4,3,1,2,5,9}) == 20));
    }

    public static int maxArea(int[] height) {
        int p1 = 0, p2 = height.length - 1, maxArea = 0;

        while (p2 > p1) {
            maxArea = Math.max(maxArea, Math.min(height[p1], height[p2]) * (p2 - p1));
//            System.out.println(p1 + "," + p2 + " :" + maxArea);
            if (height[p1] <= height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return maxArea;
    }
}
