class Solution {
    
    // Time Complexity: O(n) - n is the size of the array
    //Space Complexiity: O(n) - n is the size of the array
    //Logic : find left product seperately. find right product seperately and combine them
    // Work in LeetCode: Yes
    
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};
        int[] ans = new int[nums.length];
        
        //do left product 
        ans[0] = 1;
        for(int i = 1; i < nums.length;i++)
            ans[i] = ans[i - 1] * nums[i - 1];
        
        //do right product
        int r = 1;
        for(int i = nums.length - 1; i >=0; i--) {
            ans[i] = ans[i] * r;
            r=r*nums[i];
        }
        
        return ans;
    }
}
