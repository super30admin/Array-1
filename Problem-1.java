// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];

        int prod=1;
        for(int i=0;i<nums.length;i++ ){
            if(i==0)
                L[i]=1;
            else{
                prod=prod*nums[i-1];
                L[i]=prod;
            }
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            L[i] *= prod;
            prod=prod*nums[i];
        }

        
        return L;
        
    }
}