import java.util.Arrays;

public class Problem1 {

    // TC : O(N)
    // SC : O(1)

    public static int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length <= 1) return new int[]{0};

        int[] output = new int[nums.length];

        output[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4}))); // [24, 12, 8, 6]
    }
}
