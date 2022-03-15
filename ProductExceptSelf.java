/**
 * Time complexity is O(n)
 * space complexity is O(1) -- no additional space except for result
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lp = new int[nums.length];
        lp[0] = 1;
        
        for(int i = 1; i < nums.length; i++) {
            lp[i] = lp[i-1]*nums[i-1];
        }
        int rp = 1;
        
        for(int i = nums.length -2; i >= 0; i--) {
            rp = rp*nums[i+1];
            lp[i] = rp*lp[i];
        }
        
        return lp;
    }
}