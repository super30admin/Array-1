// Time Complexity : o(n) ---- n is length of nums
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rsum = 1;
        result[0] = 1; //left product of 1st element
        //Left product
        for(int i=1; i<nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        //Right Product
        for(int i=nums.length-2; i>=0; i--){
            rsum = rsum * nums[i+1];
            result[i] = result[i] * rsum;
        }
      
        
       return result;
    }
}