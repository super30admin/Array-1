// Time Complexity : O(n);
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//save prev product in res array, and then multiply each item by the right product till that item

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        
        ans[0] = 1;
        
        //initialize ans array with product of all elements till prev item
        for(int i=1; i < n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        int temp = 1; //store right product in temp
        for(int j = n - 1; j >= 0; j--) {
            ans[j] *= temp; //multiply ans by temp
            temp *= nums[j]; //update temp
        }
        return ans;
        
    }
}