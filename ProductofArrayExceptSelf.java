/**
Time Complexity - O(2 * N) ~ O(N) where N is the size of nums.
Space Complexity - O(N) where N is the size of nums.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return null;
        
        int[] pdt = new int[nums.length];
        int right = 1;
        pdt[0] = 1;

        for(int i = 1; i < nums.length; i++)
            pdt[i] = pdt[i - 1] * nums[i - 1];

        for(int i = nums.length - 1; i >= 0; i--) {
            pdt[i] = right * pdt[i];
            right = right * nums[i];
        }

        return pdt;
    }
}
