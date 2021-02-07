// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] ans = new int[length];

        // calculate products of alements to left and store in ans array
        ans[0] = 1;
        for(int i=1; i<length; i++) {
            ans[i] = ans[i-1]*nums[i-1];
        }
        
        //calculate products to right
        //and update ans with product of right and left of elemnt
        int lp = 1;
        for(int i=length-2;i>=0;i--) {
            lp *= nums[i+1];
            ans[i] = ans[i]*lp;
        }
       
        return ans;
    }
}
