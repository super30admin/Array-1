// Time Complexity = O(n)
// Space Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Logic: Here every element in the input array is the product of its left and right elements.
// So traverse the input array from left to right and then store it in the result array
// Then traverse from last element to first to find the product using a right variable.
// Update the result array with the product of left and right.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        int[] ans = new int[n];

        // Initialize first element in the result array to 1, since the multiplication of the left elements is 1
        ans[0] = 1;

        //Traverse the array to find left elements product
        int left = 1;
        for (int i=1; i<n; i++) {
            ans[i] = left * nums[i-1];
            left = left * nums[i-1];
        }

        //Traverse the array from second last element to find right elements product with current element
        int right = 1;
        for (int i=n-2; i>=0; i--) {
            right = right * nums[i+1];
            ans[i] = right * ans[i];
        }

        return ans;
    }
}