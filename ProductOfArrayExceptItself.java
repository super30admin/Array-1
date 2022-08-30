// Time complexity: O(n)
// Space complexity: O(n)

// Approach: the product at every element of the index, is the product of all the element to the left of the element, times the product of all elements to the right of the element. So we first calculate the left product of all elements, then right product of all elements, then find the product of left and right

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
       if (nums == null || nums.length == 0) {
           return result;
       }
        
       int prod = 1;
       int[] leftProd = new int[nums.length];
       int[] rightProd = new int[nums.length];
        leftProd[0] = 1;
        rightProd[nums.length-1] = 1;
        for (int i = 1; i < nums.length; i++) {
            prod = prod * nums[i-1];
            leftProd[i] = prod;
        }
        
        prod = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            prod = prod * nums[i+1];
            rightProd[i] = prod;
        }
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProd[i]*rightProd[i];
        }
        
        return result;
    }
}