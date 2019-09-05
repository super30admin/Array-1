// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out=new int[nums.length];
        out[0]=1;
        for(int i=1;i<nums.length;i++){
            out[i]=out[i-1]*nums[i-1];
        }
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            out[i]=out[i]*r;
            r=nums[i]*r;
        }
        return out;
    }
}
