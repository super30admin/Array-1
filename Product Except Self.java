// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];
        leftProd[0] = 1;
        rightProd[nums.length-1] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            leftProd[i] = leftProd[i-1] * nums[i-1];
            rightProd[nums.length-i-1] = rightProd[nums.length-i] * nums[nums.length-i];
            }
        int[] output = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            output[i] = leftProd[i] * rightProd[i];
        }
        return output;
    }
}
