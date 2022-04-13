public class Problem1 {
    //Time Complexity O(n)
    // Space Complexity O(1)
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};
        int rp = 1;
        int length = nums.length;
        int[] result = new int[length];
        result[0] = 1;

        for (int i = 1; i < length; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int j = length - 2; j >= 0; j--) {
            rp = rp * nums[j + 1];
            result[j] = result[j] * rp;
        }

        return result;
    }
}
