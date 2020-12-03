/**
 * @param {number[]} height
 * @return {number}
 * @link {https://leetcode.com/problems/container-with-most-water/}
 */
var maxAreaBruteforce = function(height) {
    let maxArea = 0;
    let j = height.length;

    for (let i = 0; i < height.length; i++) {
        for (let j = height.length - 1; j > i; j--) {
            maxArea = Math.max(Math.min(height[i], height[j]) * (j - i), maxArea);
        }
    }

    return maxArea;
};

console.log("Test 1 passed? : " + (maxAreaBruteforce([1,1]) === 1));
console.log("Test 2 passed? : " + (maxAreaBruteforce([4,3,2,1,4]) === 16));
console.log("Test 3 passed? : " + (maxAreaBruteforce([1,2,1]) === 2));
console.log("Test 4 passed? : " + (maxAreaBruteforce([4,8,1,2,5,9]) === 32));
console.log("Test 5 passed? : " + (maxAreaBruteforce([4,3,1,2,5,9]) === 16));

/**
 * Using two pointer technique
 * @param {number[]} height
 * @return {number}
 */
var maxAreaOptimal = function(height) {
    let maxArea = 0, i = 0, j = height.length - 1;

    while (j > i) {
        maxArea = Math.max(Math.min(height[i], height[j]) * (j - i), maxArea);
        if (height[i] <= height[j]) {
            i++;
        } else {
            j --;
        }
    }

    return maxArea;
};
console.log("============");
console.log("Test 1 passed? : " + (maxAreaOptimal([1,1]) === 1));
console.log("Test 2 passed? : " + (maxAreaOptimal([4,3,2,1,4]) === 16));
console.log("Test 3 passed? : " + (maxAreaOptimal([1,2,1]) === 2));
console.log("Test 4 passed? : " + (maxAreaOptimal([4,8,1,2,5,9]) === 32));
console.log("Test 5 passed? : " + (maxAreaOptimal([4,3,1,2,5,9]) === 20));