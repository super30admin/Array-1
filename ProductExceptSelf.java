// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traverse the nums array to build two arrays,left and right.
// Left array will contain product till the nums number from left to right.
// Right array will contain product till the nums number from right to left.
// Multiply both the values at each index to get a result array.

// Your code here along with comments explaining your approach

class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
    int[] left=new int[nums.length];
    int[] right=new int[nums.length];
    
    left[0]=1;
    right[nums.length-1]=1;
        
    for(int i=1;i<nums.length;i++)
    {
        left[i]=left[i-1]* nums[i-1];
        
    }
            
    for(int i=nums.length-2;i>=0;i--)
    {
        right[i]=nums[i+1]*right[i+1];
    }
        
    int [] result=new int[nums.length];
    
    for(int i=0;i<nums.length;i++)
    {
        result[i]=left[i]*right[i];
    }
    
return result;    
    }
}