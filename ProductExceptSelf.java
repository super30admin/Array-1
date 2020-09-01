// Time Complexity : O(n) where n is the length of input array
// Space Complexity : O(1) , no extra space other than the returning array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Initialized an array of length same as input to maintain the product on the left side of elements at each index
//initialized a variable prod as 1 to find product for 1st element
//looped through the input array from behind to find the right product and instead of having an array, update the left array itself at each index
//this helps in saving extra space
//return the left array which has product of both left and right side at each index.


class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0||nums==null) return new int[0];
        int[] left=new int[nums.length];
        
        
        int prod=1;
        for(int i=0;i<nums.length;i++){
            left[i]=prod;
            prod*=nums[i];
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            left[i]*=prod;
            prod*=nums[i];
        }
        return left;
    }
}