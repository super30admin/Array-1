public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] result = new int[nums.Length];
        int rp = 1;
        result[0] = 1;
        for (int i = 1; i < nums.Length; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int i = nums.Length - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] *= rp;
        }
        return result;
    }
}