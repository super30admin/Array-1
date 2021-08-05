/* Time Complexity :  O(n) where n is length of the input array
   Space Complexity :   O(1) 
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int rp=1; // running product
        res[0]=1;
        for(int i=1;i<nums.length;i++) //Calculating left prefix sum
        { 
            rp = rp * nums[i-1];
            res[i]=rp;
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--) //Calculating right prefix sum using left prefix sum and given array
        {
            rp = rp * nums[i+1];
            res[i] = rp * res[i];
        }
        return res;
    }
}