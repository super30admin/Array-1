//Time complexity: O(n)
//Space complexity: O(1)
//Did it run successfully on Leetcode: YES

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        L[0] = 1;
        
        for(int i=1; i<nums.length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }
        int R = 1;
        
        for(int i=nums.length - 1; i>=0; i--) {
            L[i] = L[i] * R;
            R = R * nums[i];
        }
        return L;
    }
}
