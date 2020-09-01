// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// first iterated array from left to right to calculate the left product, and then iterated from right to left to calculate the right product. multiplied the left and right product to get the output array.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums ==null || nums.length==0){
            return new int[0];
        }
        
        int[] output = new int[nums.length];
        int product=1;
        
        for(int i=0;i<nums.length;i++){
            output[i]=product;
            product= product*nums[i];
        }
        
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            output[i]=output[i]*product;
            product=product*nums[i];
        }
        return output;
    }
}