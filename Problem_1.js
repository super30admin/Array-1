// Time Complexity : O(n)
// Space Complexity: O(1) as result array is not considered as taking space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Store product of left numbers at each index
// Multiply product of right numbers at each index with existing(left product)

// Your code here along with comments explaining your approach
// https://leetcode.com/problems/product-of-array-except-self/

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
    if (nums === null || nums.length === 0)
        return [];
    let rProd = 1;
    let ans = new Array(nums.length);
    // Store product of left numbers at each index
    ans[0] = 1;
    for (let i = 0; i < ans.length; i++) {
        ans[i] = rProd;
        rProd = rProd * nums[i];
    }
    // Multiply product of right numbers at each index with existing(left product)
    rProd = 1;
    for (let i = ans.length - 1; i >= 0; i--) {
        ans[i] *= rProd;
        rProd *= nums[i];
    }
    return ans;
};
