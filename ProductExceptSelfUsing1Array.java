// TC: O(n)
// SC: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[]{};
        }
        int left = 1;
        int n = nums.length;
        int[] right = new int[n];
        right[n - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < n; i++) {
            int temp = nums[i];
            nums[i] = left * right[i];
            left = left * temp;
        }
        return nums;
    }
}