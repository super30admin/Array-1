//Time Complexity : O(n)
//Space Complexity : O(1)  // output array not counted
//Did this code successfully run on Leetcode : Yes
//First, we create a result list where each position will store the final answer.

//Then we do a left pass: for every index, we multiply all numbers to its left and store that in result.

//Next, we do a right pass: we multiply everything to its right and add it to the result.

//Combining left × right gives the final answer for each position without using division.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];

        // LEFT PASS
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // RIGHT PASS
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return result;
    }
}

