// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        result[0] = 1;//no left side product for first element
        for(int i=1; i<nums.length; i++){//product of left side
            product = product * nums[i-1];
            result[i] = product;
        }
        product = 1;//again to calculate product of right elements
        for(int i=nums.length-2; i>=0; i--){//product of right side
            product = product*nums[i+1];
            result[i] = result[i] * product;
        }
        return result;
    }
}
