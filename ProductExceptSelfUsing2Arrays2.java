// TC: O(n)
// SC: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[]{};
        }
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                left[i] = 1;
                right[n - i - 1] = s1;
            } else {
                left[i] = left[i - 1] * nums[i - 1];
                right[n - i - 1] = right[n - i] * nums[n - i];
            }
        }
        for(int i = 0; i < n; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}