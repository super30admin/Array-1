
// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        ans[0]=1;
        int leftsum=1;
        
        for(int i=1;i<n;i++){     //store the left to ans array
            leftsum*=nums[i-1];
            ans[i]=leftsum;
        }
        int rightsum=1;
        for(int j=n-2;j>=0;j--){   //cal the rightsum and multiply with the existing right sum in the ans array
            rightsum*=nums[j+1];
            ans[j]=ans[j]*rightsum;
        }
            
        return ans;
    }
}