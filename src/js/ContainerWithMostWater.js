/**
 * @param {number[]} height
 * @return {number}
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
console.log("Test 1 passed? : " + (maxAreaBruteforce([4,3,2,1,4]) === 16));
console.log("Test 1 passed? : " + (maxAreaBruteforce([1,2,1]) === 2));