//----------------O(n) space SOLUTION--------------
// Time Complexity :O(n) where n is no of elements
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes

//we are using two arrays, one for left pass and one for right pass
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int n = nums.length;

        int[] leftPass = new int[n];
        int[] rightPass = new int[n];

        int runningProduct = 1;
        leftPass[0] = 1;
        // left Pass
        // left pass has product of all left elements except self
        for (int i = 1; i < leftPass.length; i++) {
            runningProduct *= nums[i - 1];
            leftPass[i] = runningProduct;

        }
        runningProduct = 1;
        rightPass[n - 1] = 1;
        // rightPass
        // right pass has product of all right elements except self
        for (int i = n - 2; i >= 0; i--) {
            runningProduct *= nums[i + 1];
            rightPass[i] = runningProduct;
        }
        // a end we'll do product of both arrays to get result
        for (int i = 0; i < n; i++) {
            leftPass[i] *= rightPass[i];
        }
        return leftPass;
    }
}

// -----------------constant space SOLUTION------------------
// Time Complexity :O(n) where n is no of elements
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes

// in this solution, instead of using whole array for right pass, we are using
// runningProduct at each index and mutiplying with the left pass matrix. Using
// same
// approach without using extra array

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int n = nums.length;

        int[] leftPass = new int[n];

        int runningProduct = 1;
        leftPass[0] = 1;
        // left Pass
        for (int i = 1; i < leftPass.length; i++) {
            runningProduct *= nums[i - 1];
            leftPass[i] = runningProduct;

        }
        // RIGHTpASS
        runningProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            runningProduct *= nums[i + 1];
            leftPass[i] = runningProduct * leftPass[i];
        }
        return leftPass;
    }
}