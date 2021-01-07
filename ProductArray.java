// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Knowing to use left and right product lists. 
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return nums;
        }
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        int rp = 1;
        
        left[0] = 1;
        right[right.length-1] = 1;
        
        for(int i = 1; i < left.length; i++){
            rp *= nums[i-1];
            left[i] = rp;
        }
        
        rp = 1;
        
        for(int i = right.length-2; i >= 0; i--){
            rp *= nums[i+1];
            right[i] = rp;
        }
        
        
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = left[i] * right[i];
        }
        
        // System.out.println(Arrays.toString(nums));
        return nums;
    }
}