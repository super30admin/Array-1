class Solution {
    public int[] productExceptSelf(int[] nums) {

        //o(n) space and o(n) time
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        int run = 1;
        for (int i=1; i<nums.length; i++) {
            left[i] = left[i - 1] * run;
        }

        run = 1;
        for (int i=nums.length; i>=0; i--) {
            right[i] = right[i + 1] * left[i];
        }
        return right;

    }
}