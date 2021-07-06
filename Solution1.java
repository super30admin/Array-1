// Time Complexity : O(N), where N is the length of nums array. 
// Space Complexity : O(N).
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/submissions/detail/517833247/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0]; 
        int n = nums.length;
        
        //created 2 auxiliary arrays one to store product from left and other to store product from right. 
        int[] leftProduct = new int[n]; 
        leftProduct[0] = 1;
        for(int i=1; i<n; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1]; 
        }
        
        int[] rightProduct = new int[n]; 
        rightProduct[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i+1]; 
        }
        
        // assuming array is mutable, used the auxiliary arrays to calculate the product of element except self.
        for(int i=0; i<n; i++) {
            nums[i] = leftProduct[i] * rightProduct[i]; 
        }
        
        return nums;
    }
}

