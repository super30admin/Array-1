// Given an integer array nums, return an array answer such that answer[i] is equal to the product of 
// all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

// Constraints:
// 2 <= nums.length <= 105
// -30 <= nums[i] <= 30
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)


const productExceptSelf = (nums) => {
    let n = nums.length;
    let rp = 1; // runningProduct
    let result = new Array(n); // create an array of size 'n', so that we do not use extra space
    result[0] = 1; // since this value will be used to multiply and calculate running product
    // left of 'i'
    for (let i = 1; i < n; i++){
        rp *= nums[i - 1]; // since we are multiplying rp left of i
        result[i] = rp; // we will use this later 
    }
    rp = 1;

    // right of'i'
    for (let i = n - 2; i >= 0; i--){
        rp *= nums[i + 1];
        result[i] *= rp; //multiplying since we are changing the values of each index from the previous 'result' array.
    }
    return result;
}

console.log(productExceptSelf([1, 2, 3, 4]));
console.log(productExceptSelf([1, 3, 1, 4]));
console.log(productExceptSelf([-1, 1, 0, -3, 3]));




// Time Complexity : O(2n) ==> O(n)
// Space Complexity : O(1), since we are using a 'result' array of constant auxillary space.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: 
// We have used the running product approach here. 
// Calculate the running product of elements on left of 'i'
// Calculate the running product of elements on right of 'i'
// finally, multiply the two, which gives us resultant array.