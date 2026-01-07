// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Question 1. https://leetcode.com/problems/product-of-array-except-self/description/
// Approach 1
// For each number in the array we calculate the product of other numbers
// We will skip the current element during multiplication and result store in new array
// Time complexity : O(n^2)
// Space complexity : O(1)
// It gave TLE (Time Limit Exceeded)
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length]; 
       for(int i=0;i<nums.length;++i){
         int prod = 1;
         for(int j=0;j<nums.length;++j){
            if(i!=j){
                prod = prod * nums[j];
            }
         }
         result[i] = prod;
       }
       return result;
    }
}
// Approach 2
// 1. First we do left to right pass store the running product before each index
// 2. Then we do right to left pass, multiple the existing product with right side products
// Time complexity : O(n)
// Space complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
        // left to right store the running product
        for(int i=1;i<nums.length;++i){
            result[i] = prod * nums[i-1];
            prod = prod * nums[i-1];
        }
        prod = 1;
        // right to left multiple the existing product with current product from right side
        for(int i=nums.length-2;i>=0;--i){
           prod = prod * nums[i+1];
           result[i] = result[i] * prod;
        }
        return result;
    }
}