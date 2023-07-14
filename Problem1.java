// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// created a left and right array to maintain the running sum. left and right elements are multiplied
//to get the result

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        int[] ans = new int[nums.length];
         L[0] = 1;
        R[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++){
            L[i] = nums[i-1]*L[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            R[i] = nums[i+1]*R[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i] = L[i]*R[i];
        }
        return ans;
    }
}