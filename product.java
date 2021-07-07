//Time Complexity : O(n)
//Space Complexity : O(n)
// did you try it on leetcode : yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        int[] result = new int[nums.length];
        L[0] = 1;
        R[nums.length -1] = 1;
        for(int i = 0; i<nums.length-1 ; i++)
        {
           L[i+1] = L[i] * nums[i]; 
        }
        for(int i = nums.length - 2;i>=0;i--)
        {
            R[i] = R[i+1] * nums[i+1];
        }
        for(int i =0;i<nums.length ; i++)
        {
            result[i] = L[i]*R[i];
        }
        return result;
    }
}