
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english 
// 1. Calculate the product of all elements to the left of each element
// 2. Calculate the product of all elements to the right of each element
// 3. Multiply the left and right products for each element
// Product of all no's of element to left * element
// Product of all no's of element to right * element
// Auxuliary space is not used as we are storing the left product in the result array and using a variable to store the right product.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        
        int rightProduct = 1;
        result[0] = 1;

        // Left products
        for (int i = 1; i < nums.length; i++) {
            rightProduct = rightProduct * nums[i - 1];
            result[i] = rightProduct;
        }

        // Right products
        rightProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct = rightProduct * nums[i + 1];
            result[i] = result[i] * rightProduct;
        }

        return result;
    }
}