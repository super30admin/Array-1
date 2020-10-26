// Time Complexity : O(N^2) - no of elements
// Space Complexity : O(N) - No of elements
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int[] output = new int[nums.length];
        Arrays.fill(output, 1);
        for(int i = 0 ;i<nums.length;i++){
            for(int j = 0 ;j<nums.length;j++){
                if(i != j){
                    output [j] *= nums[i];                 
                }
            }
        }
        return output;
    }
}