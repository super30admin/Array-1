// Time Complexity : The time complexity is O(n) where n is the length of the array
// Space Complexity : The space complexity is O(1) since we are not using any extra space.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We will maintain two multiplications, one from the left and one from the right. The left multiplication multiplies all the
// numbers from 0 to current-1 and stores in the current index. The right multiplication multiplies all the numbers from
// n-1 to current-1 and stores in the current index. This way we can multiply all the numbers except the current number.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        Arrays.fill(output,1);

        int leftMul = 1;
        int rightMul = 1;
        int start = 0;
        int end = nums.length-1;

        while(start < nums.length){

            // Multiplies the numbers on the left and stores in current index
            output[start] *= leftMul;
            leftMul *= nums[start];

            // Multiplies the numbers on the right and stores in current index
            output[end] *= rightMul;
            rightMul *= nums[end];

            start++;
            end--;

        }

        return output;

    }
}