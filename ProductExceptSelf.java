// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english:
// - count cumulative left product, store it into array.
// - while counting cumulative right product, multiply it to number stored previously

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];


        if (nums.length == 0) return new int[0];

        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int mul = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            res[i] = res[i] * (mul * nums[i + 1]);
            mul = mul * nums[i + 1];
        }


        return res;
    }
    //space complexity: O(n)
    public int[] productExceptSelf1(int[] nums) {
        int[] res = new int[nums.length];
        int[] temp = new int[nums.length];

        if (nums.length == 0) return new int[0];
        temp[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            temp[i] = temp[i - 1] * nums[i - 1];
        }

        res[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            res[i] = res[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] *= temp[i];
        }
        return res;
    }
}
