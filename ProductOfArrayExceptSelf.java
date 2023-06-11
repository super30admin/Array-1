public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;
        int result[] = new int[nums.length];
        result[0] = rp;
        for (int i = 1; i < nums.length; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            rp = rp * nums[j + 1];
            result[j] *= rp;
        }
        return result;
    }
}
