// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// We calculate the left most part of each index
// We calculate the right most part of each index
// We multiply them and store them in the resultant array which is res here

// Your code here along with comments explaining your approach






class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for(int i = 1; i < n; i++){
            res[i] = res[i - 1]*nums[i - 1];
        }

        int right = 1;

        for(int i = n - 1; i >= 0; i --){
            res[i] *= right;
            right *= nums[i];

        }


        return res;
    }
}