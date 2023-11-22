// problem 1: https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
// Accepted in LeetCode
//TC O(n) and SC O(1)

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    
    let n = nums.length;
    //let leftArr = [n];
    //let rightArr= [n];
    let output =[n];

    output[0]=1
    //leftArr[0]=1;
    //rightArr[n-1]=1;

    for(let i=1; i<n; i++){
        //leftArr[i]=nums[i-1]*leftArr[i-1];
        output[i]=nums[i-1]*output[i-1];
    }

    let r=1;
    for(let i=n-1; i>=0;i--){
        output[i]=output[i]*r;
        r= r*nums[i]
    }

    // for(let i=n-2; i>=0;i--){
    //     rightArr[i]=nums[i+1]*rightArr[i+1];
    // }

    // for(let i=0;i<n;i++){
    //     output[i]=leftArr[i]*rightArr[i]
    // }

return output;


};