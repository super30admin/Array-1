// Time Complexity : O(n+n)=O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
    //Calculate the product of all the element the the left current element and then using the right elemnts product to find the final answer

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
            return new int[0];
        
        int[] leftprod= new int[nums.length];
        leftprod[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            leftprod[i] =leftprod[i-1]*nums[i-1]; 
        }
        int rightprod=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            rightprod *= nums[i+1];
            leftprod[i] *= rightprod;
        }
        return leftprod;

    }
}