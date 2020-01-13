// S30 Big N Problem #25 {Medium}
// 238. Product of Array Except Self
// Time Complexity :O(n) {2 parse}
// Space Complexity :No extra space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result=new int [nums.length];
        //edge case
        if(nums==null || nums.length==0) return result;
        //logic
        int rp=1;
        int tmp=1;
        
        //left to right
        //nums[1,2,3,4]
        //result[1,1,2,6]
        for(int i=0;i<nums.length;i++){
            rp*=tmp;
            result[i]=rp;
            tmp=nums[i];
        }
        
        rp=1;
        tmp=1;
        
        //right to left
        //nums[1,2,3,4] --->[]rp tmp 1 1 ;1 4;4 3;12 2;24 1
        //result[1,1,2,6] ---> final[24,12,8,6]
        for(int i=nums.length-1;i>=0;i--){
            rp*=tmp;
            result[i]*=rp;
            tmp=nums[i];
        }
        return result;
    }
}