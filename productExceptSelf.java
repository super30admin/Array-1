// Time Complexity: O(n) we are performing 3 passes through the whole array giving us 3n of complexity. approximately O(n).
// Space Complexity: O(2n) as we have taken 2 arrays => O(n)
// Did you complete it at leetcode: Yes
// any problems faced: could not identify it as a DP solution initially as it seemed to be single pass exclusion. With failing edge cases, had to look for other possibilities


// Write your approach here
// Idea is to divide the problem into subproblems by identifying that for each value  we are calculating its left and right subarray and returning the product of both.
// we can simplify it by creating 2 arrays for left and right calculation.
// each element can use previous calculated value with multiplication to previous value to get left product of current index and similarly on right.
// finally result of left and right part is result.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] leftMul = new int[nums.length];
        int[] rightMul = new int[nums.length];
        leftMul[0] = 1; rightMul[rightMul.length-1] = 1;
        for(int i = 1; i<nums.length; i++) {
            leftMul[i] = leftMul[i-1]*nums[i-1];
        }
        for(int j=nums.length-1; j>0; j--) {
            rightMul[j-1] = rightMul[j]*nums[j];
        }
        for(int k = 0; k<nums.length; k++) {
            result[k] = leftMul[k]*rightMul[k];
        }
        return result;
    }
}