class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if (nums == null || nums.length == 0)
            return result;
        result[0] = 1;
        int rp = 1;
        for (int i = 1; i < nums.length; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            result[i] *= rp;
        }
        return result;
    }
}