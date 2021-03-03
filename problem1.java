// Time Complexity : O(n) where n is length of array
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {
        //first we will take the leftproduct initially as 1
        int leftProduct=1;
        int[] output = new int[nums.length];
        
        //Left product excluding the number itself at each index;
        for(int i=0;i<nums.length;i++){
            output[i]=leftProduct;
            leftProduct*=nums[i];
        }
        //[1,1,2,6]
        int rightProduct=1;
        //Right product*leftproduct excluding the number itself at each index;
        for(int i=nums.length-1;i>=0;i--){
            output[i]*=rightProduct;
            rightProduct*=nums[i];
        }
        //[24,12,8,6]
        
        return output;
    }
}
