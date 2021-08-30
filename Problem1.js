// Time Complexity : O(n) n number of array elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//We take the product of the elements to the left of a particular element and then multiply
// it by elements to the right of that element


var productExceptSelf = function (nums) {
    let result = [];
    if (!nums || nums.length === 0) return result;
    let product = 1;
    result[0] = product;
    //Left
    for (let i = 1; i < nums.length; i++) {
        product = product * nums[i - 1]
        result[i] = product;
    }
    product = 1;
    //Right
    for (let i = nums.length - 2; i >= 0; i--) {
        product = product * nums[i + 1];
        result[i] *= product;
    }

    return result;
};