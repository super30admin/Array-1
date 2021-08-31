// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//1) Store the values of products from left hand side to right
//2) Create a variable to track values of products from right to left
//3) Find the product by multiplying right product with left product

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prod = new int[nums.length];
        int prev = 1;

        prod[0] = nums[0];

        for(int i=1; i<nums.length; i++)
            prod[i] = prod[i-1] * nums[i];

        for(int i=nums.length-1; i>0; i--){
            prod[i] = prod[i-1] * prev;
            prev = prev * nums[i];
        }
        prod[0] = prev;
        return prod;
    }
}

// Your code here along with comments explaining your approach