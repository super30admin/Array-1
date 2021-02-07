/**
Time complexity: O(n)
Space complexity: O(1)
Execute successfully on Leetcode: Yes
Any problems faced: No
*/

class Solution {
    /**
    Approach:
    - We use the output array to first store all the products to the left of an element in the nums array.
    - Modify the same output array to then compute the final product by calculating the products to the right of an element.
    */
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] output = new int[nums.length];
        int productLeft = 1;
        
        for(int x=0; x<nums.length; x++) {
            output[x] = productLeft;
            productLeft *= nums[x];
        }
        int productRight = 1;
        for(int x= nums.length-1; x>=0; x--) {
            output[x] *= productRight;
            productRight *= nums[x];
        }
        return output;
    }
}
