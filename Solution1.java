// Time Complexity :O(n)
// Space Complexity :O(1) as auxiliary space is not used
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english-Took a running product
// it stores the product of a number on its left 
//Then used the same variable to store the running product to store product of all numbers on its right

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result= new int [nums.length];
        int rp=1;
        
        result[0]=rp;
       for(int i=1;i<nums.length;i++){
           rp=rp*nums[i-1];
           result[i]=rp;
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i]=rp*result[i];              
          
        }
        return result;
    }
}