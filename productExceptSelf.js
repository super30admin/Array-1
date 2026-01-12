/**
 * @param {number[]} nums
 * @return {number[]}
 Intuition:

 As we aren't allowed to use division operation, here i am using running product to solve this problem.
 result is initialized with 1 and in the forward pass we are storing the left side product of each number.
 In the backward pass, i am using a variable product to reduce another array, and it is initialized with 1,
 At each location i am multiplying product with res[i-1] to get the final value and product is multiplied by 
 nums[j] to store the running product of right side values.

 */
var productExceptSelf = function(nums) {
    let res = [1];
    // forward pass
    for(let i=1; i<nums.length; i++){
       res[i] = res[i-1] * nums[i-1];
    }
     
    // backward pass
    // initialize the product as 1, we are using this variable to minimize the space to O(1).
    let product = 1;
    for(let j = nums.length-1; j > 0; j--){
       res[j] = product * res[j];
       product *= nums[j];
    }
    res[0] = product;
    return res;
};