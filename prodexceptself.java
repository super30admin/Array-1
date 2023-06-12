// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : No issues faced

// Your code here along with comments explaining your approach: rp is the running product
// we are calcuting the left running product and storing it in the result array.
// now we need to calculate the right running product . at the n-1 element there is no right element so the rp will be 1 so we are not doing anything
// else we need to find the right tunning product and multiply that with the previous value in the result array i.e .. left running product till that index
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rp=1;
        int n = nums.length;
        int result[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(i==0)
                result[i] = rp;
            else 
                rp = rp* nums[i-1];
                result[i] = rp;
        }
        rp=1;
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)
                continue;
            else 
                rp = rp* nums[i+1];
                result[i] = result[i]* rp;
        }
        return result;
    }
}