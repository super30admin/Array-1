// Time complexity: O(n)
// Space complexity: O(1)

// Approach: the product at every element of the index, is the product of all the element to the left of the element, times the product of all elements to the right of the element. So we first calculate the left product of all elements, then right product of all elements, then find the product of left and right. This is a space optimized solution. Here we are just using 1 result array instead of 2

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
       if (nums == null || nums.length == 0) {
           return result;
       }
        
        int prod = 1;
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prod = prod * nums[i-1];
            result[i] = prod;
        }
        
        prod = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            prod = prod*nums[i+1];
            result[i] = result[i]*prod;
        }
        
        return result;
    }
}