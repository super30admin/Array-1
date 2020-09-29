// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        // over here we are splitting the result by finding left side and right side of the number individually
        // left side array consists of array on the left except the self and same with the right array
        int[] result = new int[ nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        
        left[0] = 1;
        for (int i = 1; i <  nums.length; i++) 
        {
            left[i] = nums[i - 1] * left[i - 1];
        }
        
        right[nums.length-1] = 1;
        for (int i =  nums.length - 2; i >= 0; i--) 
        {
            right[i] = nums[i+1] * right[i+1];
        }   
        
        for(int i=0;i<nums.length;i++)
        {
            result[i]=left[i]*right[i];
        }
   
        return result;
    }
}