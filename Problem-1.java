// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// do a forward pass to multiply all the elements from start
// again do a backward pass and multiply all the elements after that
// now multiply both elements

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output =  new int[n];
        int prod = 1;
        for(int i=0; i < n; i++){
            output[i] = prod;
            prod *= nums[i];
        }
        prod = 1;
        for(int i = n-1;i>-1;i-- ){
            output[i] *= prod;
            prod *= nums[i];
        }
        return output;


    }
}