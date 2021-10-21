// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// First traverse list and take products of left side excluding current element
// Do same from right to left and multiply the values with above product.
// We complete it in 2 traversal without using extra space 

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] product = new int[nums.length];
        
        product[0] = 1;
        
        for(int i=1;i<nums.length;i++) {
            product[i] = product[i-1]*nums[i-1];
        }
        int temp = 1;
        for(int i=nums.length-1;i>=0;i--) {
            product[i] = product[i]*temp;
            temp *=nums[i];
        }
        return product;
    }
}