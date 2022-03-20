// Time Complexity : O(n) , n is length of input
// Space Complexity : O(1) . result space in not extra space
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        //store prefix product in result array

        //start with 1
        result[0] = 1;

        //calculate prefix array
        for(int i=1; i<nums.length; i++)
        {
            result[i] = result[i-1]*nums[i-1];
        }

        //calculate suffix for each index on the fly and multiply it with prefix array to get result
        int suffix=1;

        for(int i=nums.length-1; i>=0; i--)
        {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }
}
