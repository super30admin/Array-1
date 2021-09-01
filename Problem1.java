// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes 238
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //create and output array as we are returning this o/p array sc is o(1)
        int[] output = new int[nums.length];
        //currently running product is 1 initally
        int rp =1;
        //for 0th index, running product until before element is 1
        output[0]=1;
            
        for(int i=1;i<nums.length;i++){
            //caluclate at that index rp is equal to rp until before elements
            rp = rp*nums[i-1];
            //and putting those rp in output array
            output[i]=rp;
        }
        //setting back the rp to 1 as we have some value in it
        rp=1;
        //starting from last but one index becoz the last index rp will be 1
        for(int i=nums.length-2;i>=0;i--){
             //caluclate at that index rp is equal to rp until before elements
            rp = rp*nums[i+1];
            //and putting those rp in output array and multplying with already existing avlues in o/p array
            output[i]= output[i] * rp;
        }
        return output;
    }
}