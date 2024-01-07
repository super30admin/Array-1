// Time Complexity : O(n)
// Space Complexity : O(n)
// Approach : creating left products array and right products array for every index , multiplying both array values at that index


/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
    const leftProducts = new Array(nums.length);
    const rightProducts = new Array(nums.length);
    const answer = new Array(nums.length);

    leftProducts[0] = 1;
    for (let i = 1; i < nums.length; i++) {
        leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
    }

    rightProducts[nums.length - 1] = 1;
    for (let i = nums.length - 2; i >= 0; i--) {
        rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
    }

    // Calculate the answer using left and right products.
    for (let i = 0; i < nums.length; i++) {
        answer[i] = leftProducts[i] * rightProducts[i];
    }

    return answer;
};