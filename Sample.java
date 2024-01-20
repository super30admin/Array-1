// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Calculate prod of right of each index and then multiply by running product of left of each index on second iteration

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        result[result.length-1] = 1;

        for(int i = result.length-2; i > -1; i--){
            result[i] = result[i+1] * nums[i+1];
        }

        int runningProduct = 1;

        for(int i = 0; i < result.length; i++){
            result[i] = result[i] * runningProduct;
            runningProduct *= nums[i];
        }

        return result;
        
    }
}
