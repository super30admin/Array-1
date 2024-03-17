// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// 1. The solution iteratively calculates the product of all elements to the left of each index and stores them in an array.
// 2. Then, it iterates backward to compute the products of elements to the right, updating the result array with the cumulative products.
// 3. By combining left and right products, excluding the current element, the algorithm efficiently computes the product except self for each element in the array in O(N) time and space complexity.

public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int n = nums.Length;
        int rp=1;
        int[] result = new int[n];
        result[0] =1;

        //left prod
        for(int i=1; i<n ; i++)
        {
            rp = rp*nums[i-1];
            result[i] = rp;
        }

        //right prod -> result = [1, 1, 2, 6, 24]
        rp=1; // 1*5 =5
        //[1 1 2 30 24]
        //[120 60 40 30 24]
        for(int i=n-2; i>=0; i--)
        {
            rp = rp*nums[i+1];
            result[i] = rp*result[i];
        }
        return result;
    }
}