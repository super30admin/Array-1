// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int N = nums.length;

        int output[] = new int[N];
        int right = 1;

        output[0] = 1;



        for(int i = 1 ; i<N ; i++)
        {
            output[i] = nums[i-1]*output[i-1];
        }

        for(int i = nums.length-1; i>=0 ; i--)
        {
            output[i] = output[i]*right;
            right*=nums[i];
        }

        return output;

    }
}
