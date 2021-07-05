// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //edge condition
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        int[] right=new int[nums.length];
        //declaring new result array of size of nums array;
        int[] ans=new int[nums.length];
        
        
        ans[0]=1;
        //calculating the left hand products 
        for(int i=1;i<=nums.length-1;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        
        right[nums.length-1]=1;
        //calculating the right hand products 
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
            ans[i]=ans[i]*right[i];
        }
    
        return ans;
    }
}
