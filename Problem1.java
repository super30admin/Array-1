
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int [] result = new int[n];
        result[0] = 1;
        for(int i =1; i < n; i++)
        {
            //left running product
            product *= nums[i-1];   //multiply with left elements
            result[i] = product;
        }
        product=1;
        for(int i = n-2; i >= 0; i--)
        {
            product *= nums[i+1];  //multiply with right elements
            result[i] *= product;   //multiply the product with result array.
        }
        return result;
    }
}