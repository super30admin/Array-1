

// Time Complexity : O(n) where n is length of array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes


// approach : Took one result array and kept finding left product of left side elements each time. Then I'm storing right product in right variable and I kept iterating in reverse way 


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if( nums == null || nums.length <2 )
            return nums;
        
        int n = nums.length;
        int[] result = new int[n];
        result[0] =1;
        int right =1;
        
        for(int i=1;i<n;i++){
            result[i] = result[i-1] * nums[i-1];
        }
        
        for(int i=n-1;i>=0;i--){
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}