// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


//we can calculate lift product and take a running product * lift curr wil give the whole product val

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rp=1;
        result[0] = 1;


        //left
        for(int i =1; i < nums.length; i++){
            rp = rp*nums[i-1];
            result[i] = rp;
        }

        //right
        rp = 1;
        for(int i = nums.length-2; i>= 0; i--){
            rp = rp*nums[i+1];
            result[i] = rp*result[i]; // running product * lift
        }

        return result;
    }
}