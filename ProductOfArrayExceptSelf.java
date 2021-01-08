// TC: O(2N) = O(N) -  N is the no. of elements of nums array
// SC: O(1) - No extra space required
// Did it run successfully on Leetcode? : Yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length];
        
       if ( nums == null || nums.length == 0)
           return result;
        result[0] = 1;
        for ( int i = 1; i < nums.length; i++)
        {
           result[i] = result[i-1] * nums[i-1];
        }  
        int runningProduct = 1;
        for ( int i = nums.length-1; i>=0; i--)
        {
            result[i] = runningProduct * result[i];
            runningProduct = runningProduct * nums[i];
        }
        return result;
    }
    
}
