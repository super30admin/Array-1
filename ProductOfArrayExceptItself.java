// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return new int[0];			//Base Case
        int[] left = new int[n];
        int prodLeft = 1;
        for (int i = 0; i < n; i++) {
            left[i] = prodLeft;			//Filling the left array with left products
            prodLeft *= nums[i];
        }
        int prodRight = 1;
        int[] retArr = new int[n];
        for (int i = n - 1; i >= 0; i--) {	//Filling the right/output array with right products along with left array products 
            retArr[i] = prodRight * left[i];
            prodRight *= nums[i];
        }
        return retArr;
    }
}
