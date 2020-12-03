/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const numsMap = {};

    for (let p = 0; p < nums.length; p++) {
        // const currentMapVal = numsMap[nums[p]];

        if (numsMap[nums[p]] >= 0) {
            return [numsMap[nums[p]], p];
        } else {
            const numberToFind = target - nums[p];
            numsMap[numberToFind] = p;
        }
    }

    return null;
};

console.log("test 1 passed? : " +
    (JSON.stringify(twoSum([2,7,11,15], 9))
        === JSON.stringify([0,1])));
console.log("test 2 passed? : " +
    (JSON.stringify(twoSum([3,2,4], 6))
    === JSON.stringify([1,2])));
console.log("test 3 passed? : " +
    (JSON.stringify(twoSum([3,3], 6))
    === JSON.stringify([0,1])));
