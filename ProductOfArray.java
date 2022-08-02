// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// first update the result array with running product at each index from left to right. Update the result array by multipying running product at each index
// from right to left
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int rsum = 1;
        for(int i=1;i<nums.length;i++){
            rsum *= nums[i-1] ;
            result[i] = rsum;
        }
        rsum=1;
        for(int i=nums.length-2;i>=0;i--){
            rsum *= nums[i+1] ;
            result[i] *= rsum;
        }
        return result;
    }
}
