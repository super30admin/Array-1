/**

Time Complexity : O(N) N = input size
Space Complexity : O(N) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
**/
class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int length = nums.length;
        int leftProduct[] = new int[length];
        int rightProduct[] = new int[length];
        int output[] = new int[length];
        
        int product = 1;
        for(int i = 0; i < nums.length; i++)
        {
            leftProduct[i] = product;
            product = product * nums[i];
        }
        
        product = 1;
        
        for(int i=length-1; i>=0; i--)
        {
            rightProduct[i] = product;
            product = product * nums[i];
        }
        
        for(int i=0 ;i < length; i++)
        {
            output[i] = leftProduct[i] * rightProduct[i];
        }
        
        return output;
    }
}