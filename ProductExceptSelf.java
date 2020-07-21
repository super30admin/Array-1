// Time Complexity : O(N) N is the number of elements in input array.
// Space Complexity :O(N) since we are using two intermediate arrays to get to the output.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
For every given index, i, we will make use of the product of all the numbers to the left of it and multiply it by the product
 of all the numbers to the right. This will give us the product of all the numbers except the one at the given index i.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L= new int[nums.length];
        int[] R= new int[nums.length];
        int[] answer = new int[nums.length];
        
        L[0] = 1;
        for(int i=1; i<nums.length;i++)
        {
            
            L[i] = nums[i-1] * L[i-1];
        }
        R[nums.length-1] = 1;
        for(int i=nums.length - 2; i>=0; i--)
        {
            
            R[i]= nums[i+1] * R[i+1];
        }
        
        for(int i=0; i<nums.length; i++)
        {
            answer[i] = L[i]*R[i];
        }
        return answer;
    }
}