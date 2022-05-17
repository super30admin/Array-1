// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int rp=1;
        res[0]=1;
        //Calculate rolling product upto the previous element at each element
        for(int i=1; i<nums.length; i++){
            rp*=nums[i-1];
            res[i]=rp;
        }
        rp=1;
        //Calculate rolling product from the last to the next element at each element
        for(int i=nums.length-2; i>=0; i--){
            rp*=nums[i+1];
            res[i]*=rp;
        }
        return res;
    }
}
