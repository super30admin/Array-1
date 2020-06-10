//Product of All Elements (LC 238)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes it was tricky to come up with running product

//Using a running product and temp variable we can use two for loops to calculate the product overall

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let result = [];
    let runProd = 1; let temp = 1;
    for(let i=0;i<nums.length;i++){
        runProd = runProd * temp;
        result[i]=runProd;
        temp=nums[i];
    }
    runProd = 1; temp =1;
    for(let i=nums.length-1;i>=0;i--){
       runProd = runProd * temp;
        result[i] = result[i]*runProd;
        temp = nums[i];
    }
    return result;
};