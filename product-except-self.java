// Time - O(N)
// Space - O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[] {};
        }
        
        int[] left = new int[nums.length];
        int rp = 1, temp = 1;
        for(int i=0;i<nums.length;i++) {
            rp = rp * temp;
            left[i] = rp;
            temp = nums[i];
        }
 
        int rightProd = 1;
        temp = 1;
        for(int i=nums.length-1;i>=0;i--) { 
            rightProd = rightProd * temp;
            left[i] = left[i] * rightProd;
            temp = nums[i];
        }
        
        return left;
    }
}
