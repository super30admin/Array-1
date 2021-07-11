// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //base case to check if the array is empty
        if(nums == null || nums.length == 0)
            return new int[0];
        
        int[] result = new int[nums.length];
        //instead of a whole array we just use a right variable
        //we set it to be one at first becuase the rightmost in the array format was one
        int right = 1;
        
        //left
        //the first element should be 1 because nothing on left to multiply with it
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }
        //right
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] = result[i] * right;
            right = right * nums[i];
            
        }
        //result
        return result;
    }
}