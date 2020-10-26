// Problem 1: 

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Time Limit Exceeds
// Any problem you faced while coding this : Couldn't think about other approach to optimize the solution.  I hope will get better understanding after the session.


// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int a=1;
        for(int i=0;i<n;i++){
            a=1;
            for(int j=0;j<n;j++)
               if(i!=j) a*=nums[j];
            ans[i]=a;
        }
        return ans;
    }
}