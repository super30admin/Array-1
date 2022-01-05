// TC O(N) 
// SC O(1)
public class Product {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        if (nums == null || nums.length == 0) {
            return prod;
        }

        int rp = 1;
        prod[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rp = rp * nums[i - 1];
            prod[i] = rp;
        }
        rp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            prod[i] = rp * prod[i];
        }
        return prod;
    }
}
