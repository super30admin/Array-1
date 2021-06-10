// 238.
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


 class Solution {
 
    public int[] productExceptSelf(int[] nums) {

        int [] arr = new int [nums.length];
        if(nums.length == 0 || nums == null) return arr;
        int rp = 1; arr[0] = 1;
        //left side 
        for(int i = 1 ; i < nums.length; i++){
            rp = rp * nums[i - 1];
            arr[i] = rp;
        }
        rp = 1;
        //right side
        for(int i = nums.length -2; i >= 0; i--){
            rp = rp * nums[i + 1];
            arr[i] = rp * arr[i];
        }
        return arr;
    }    
}