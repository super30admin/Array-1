//space complexity is O(1) and time complexity is O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        int rprod = 1;
        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            // this is the first loop for left side multiplication
            rprod = rprod * nums[i - 1];
            res[i] = rprod;
        }

        rprod = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rprod = rprod * nums[i + 1];
            res[i] = res[i] * rprod;
        }

        return res;
    }
}