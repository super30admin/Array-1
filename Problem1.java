// Time Complexity :
//      n - size of array 
//      productExceptSelf() - O(n)
//      
// Space Complexity :
//      productExceptSelf() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null ||nums.length <= 1)
            return new int[]{};
        
        int[] arr = new int[nums.length];
        
        //left pass
        int rp = 1;
        int temp = 1;
        
        for(int i = 0; i < nums.length; ++i)
        {
            rp *= temp;
            temp = nums[i];
            arr[i] = rp;
        }
        
        rp = 1;
        temp = 1;
        
        for(int i = nums.length-1; i >= 0 ; --i)
        {
            rp *= temp;
            temp = nums[i];
            arr[i] *= rp;
        }
        
        return arr;
    }
}