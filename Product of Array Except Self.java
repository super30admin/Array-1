/*
Time Complexity : O(n)
Space Complexity:O(1)( Considering the output array does not count as extra space for space complexity analysis.)
*/
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0||nums==null){
            return new int[]{};
        }
        int rp = 1;//maintain a running product
        int[] res = new int[nums.length];
        res[0] = 1;//assign the first element with 1 indicating the multiple of first element with left which is nothing and hence 1
        
        //find the multiple of the left elements for each item in the array
        for(int i=1;i<nums.length;i++){
            rp = nums[i-1]*rp;
            res[i] = rp;
        }
        rp = 1;////find the multiple of the right elements for each item in the array 
        for(int i=nums.length-2;i>=0;i--){
            rp = nums[i+1]*rp;
            res[i] = rp * res[i];// multiply the left and right parts
        }
        return res;
    }
}