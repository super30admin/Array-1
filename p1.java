// Time Complexity : O(n)
// Space Complexity : Constant O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Take running sum from left and store it in the result array. Take running sum from the right and store it in the running sum variable. Multiple the left running sum and right running sum to get the answer

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Result array to store temp result and then final result
        int[] result = new int[nums.length];
        // Storing first element as 1 as there is nothin to the left
        result[0] = 1;
        // Traversing through the array to get left ruuning sum
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        // Traversing through the array from right to get the running sum
        // Multiplying it with left running sum to get the result
        int rs = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * rs;
            rs = rs * nums[i];
        }

        return result;
    }
}