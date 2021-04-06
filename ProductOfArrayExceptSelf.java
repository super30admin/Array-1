/*
 *  Time Complexity: O(N) Where N is the length of nums array.
 *  Space Complexity: O(1) Since we are using only additional space to return the values. We do not consider that to the space complexity.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 *  Explanation: We first create a new array of the same length as nums array. We then fill the new array with the product of all the element to the right of that index in nums array. Now We iterate over the new array and multiply the current values with the prouduct of all the element prior to that index in this nums array (this can be easily maintained in a variable).
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0) return new int[]{};
        
        int currMult=1;
        int res[]= new int[nums.length];
        res[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            res[i]=res[i+1] * nums[i+1];
        }
        
        for(int i=1;i<nums.length;i++){
            currMult=currMult*nums[i-1];
            res[i]=res[i]*currMult;
        }
        return res;
    }
}
