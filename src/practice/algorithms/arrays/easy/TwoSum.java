package practice.algorithms.arrays.easy;

import java.util.HashMap;

/**
 * Given an array of integers,
 * return the indices of the two numbers that add up to a given target
 *
 * Let's define boundaries:
 * <ul>
 *    <li>
 *        Q: Are the numbers positive or can there be negatives?<br/>
 *        A: Alll numbers are positive.
 *    </li>
 *    <li>
 *        Q: Are there duplicate numbers?<br/>
 *        A: No, there no duplicates.
 *    </li>
 *    <li>
 *        Q: What do we return if there's no solution<br/>
 *        A: Just return null
 *    </li>
 *    <li>
 *        Q: Will there always be a solution available?<br/>
 *        A: Yes, there will always be a solution available
 *    </li>
 *    <li>
 *        Q: Can there be multiple pairs that add up to the target?<br/>
 *        A: No, only 1 pair of numbers add up to the target.
 *    </li>
 * </ul>
 *
 * Let's think about test cases considering above boundaries:
 * <ul>
 *     <li>
 *         [1,3,7,9,2] t=11 VALID_SCENARIO 7
 *     </li>
 *     <li>
 *         [1,2,3,4,5] t=25 VALID_SCENARIO OUTPUT_NULL
 *     </li>
 *     <li>
 *         [] t=25 VALID_SCENARIO OUTPUT_NULL
 *     </li>
 *     <li>
 *         [5] t=8 VALID_SCENARIO OUTPUT_NULL
 *     </li>
 *     <li>
 *         [5] t=5 VALID_SCENARIO OUTPUT_NULL
 *     </li>
 *     <li>
 *         [1,6] t=7 VALID_SCENARIO 1
 *     </li>
 * </ul>
 *
 * Approach we'll take:
 *  - Two pointers (p1, p2 are two pointers)
 *  - number to find = Target - nums[p1]
 *
 * @link{https://leetcode.com/problems/two-sum/}
 */

public class TwoSum {
    public static void main(String[] args) {
//        int[] nums1 = {1,3,7,9,2};
//        int t1 = 11;
//
//        int[] nums2 = {1,2,3,4,5};
//        int t2 = 25;
//
//        int[] nums3 = {};
//        int t3 = 25;
//
//        int[] nums4 = {5};
//        int[] nums5 = {5};
//        int[] nums6 = {1,6};

        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums, target); // should return [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for (int p = 0; p < nums.length; p++) {
            int currentMapVal = numsMap.getOrDefault(nums[p], -1);

            if (currentMapVal >= 0) {
                return new int[] {currentMapVal, p};
            } else {
                int numberToFind = target - nums[p];
                numsMap.put(numberToFind, p);
            }
        }
        return null;
    }
}
