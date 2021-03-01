// Time Complexity : O(n)
// Space Complexity : O(1) if we did not consider the output array size
// else it's O(1) since we did not use extra space
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/*
Get the Product Except self by multiplying and saving inarray with +1 pointer element from left to right
Then traverse from multiplying right to left and product with the product previous array
Using a temp variable, multiplying with itself and element at same index in previous array gives the cumulative product except itself
This gives the product of other element except itself.
*/
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i=1;i<nums.length;i++){
            res[i] = nums[i-1]*res[i-1];
        }
        int temp = 1;
        for(int j=nums.length-1;j>=0;j--){
            res[j] *= temp;
            temp *= nums[j];
        }
        return res;
    }
}
