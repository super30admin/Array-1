// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: running product from left and right and storing in result array, then multiplying both the products to get the final result.
// Your code here along with comments explaining your approach: calculate prdouct of all the elements to the left of the current element and store it in result array, then calculate product of all the elements to the right of the current element and multiply it with the value stored in result array to get the final result.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
        
        int rp = 1;
        result[0] = 1;

        for(int i=1; i<n; i++){ // left pass
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp = 1;
     
        for(int i=n-2; i>=0; i--){ // right pass
            rp = rp*nums[i+1];
            result[i] = result[i] * rp;
        }

        return result;
    }
}
