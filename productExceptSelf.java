// Time Complexity :O(N) n are the elements in the given array.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:Storing the product of left elements in the result and then multiplying it with 
// the product of the right elements.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0]=1;
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int prev=1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]*=prev;
            prev*=nums[i];
        }
        return result;
    }
}