// TC: O(2N) = O(N) -  N is the no. of elements of nums array
// SC: O(N) - N is the no. of elements of nums array
// Did it run successfully on Leetcode? : Yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length];
        
       if ( nums == null || nums.length == 0)
           return result;
        
        int[] left = new int[nums.length];
        int right = 1;
        
        left[0] = 1;
        for ( int i = 1; i < nums.length; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }
        
        for ( int i = result.length-1 ; i >= 0; i--)
        {
            result[i] = left[i] * right;
            right = right * nums[i];
        }
        
        return result;
    }
    
}
