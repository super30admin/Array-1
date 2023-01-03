// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We first traverse the array from left and keep track of running product. 
// result[i] will have product of all nos to the left side of it
// We then traverse the array from right, calculate the running product(product of all numbers to the right of i), and multiply with result[i] to get the final answer

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rProduct =1;
        int n = nums.length;
        int[] result = new int[n];
        for(int i =0;i<n;i++)
            {
                result[i] = rProduct;
                rProduct = rProduct*nums[i];
            }
        rProduct = 1;
        for(int i=n-1;i>=0;i--)
            {
                result[i] = result[i]*rProduct;
                rProduct = rProduct*nums[i];
            }
            return result;
    }
}