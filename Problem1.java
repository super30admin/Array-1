//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];    
        int last = 1;
        for (int i = 0; i < len; last *= nums[i++]) left[i] = last;
        last = 1;
        for (int i = len - 1; i >= 0; last *= nums[i--]) right[i] = last;        
        for (int i = 0; i < len; i++) nums[i] = left[i] * right[i];        
        return nums;
    }
}
