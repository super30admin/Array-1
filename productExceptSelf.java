// Time Complexity: O(n) we are performing 3 passes through the whole array giving us 3n of complexity. approximately O(n).
// Space Complexity: O(1) manipulating only result array
// Did you complete it at leetcode: Yes
// any problems faced: could not identify it as a DP solution initially as it seemed to be single pass exclusion. With failing edge cases, had to look for other possibilities


// Write your approach here
// Idea is to divide the problem into subproblems by identifying that for each value  we are calculating its left and right subarray and returning the product of both.
// we can simplify it by creating 2 arrays for left and right calculation.
// each element can use previous calculated value with multiplication to previous value to get left product of current index and similarly on right.
// finally result of left and right part is result.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] left = new int[nums.length];
        int rProd=1;
        left[0] = rProd;
        for(int i=1; i<nums.length; i++) {
            rProd = rProd*nums[i-1];
            left[i] = rProd;
        }
        rProd=1;
        for(int j= nums.length-2; j>=0; j--) {
            rProd = rProd*nums[j+1];
            left[j] = rProd * left[j];
        }
        return left;
    }
}