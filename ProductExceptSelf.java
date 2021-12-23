class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // TC : O(N)
        // SC : O(1)

        if (nums == null || nums.length == 0)
            return new int[] {};

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        // left array
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        // right array
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        // multipy each elemnt of left array with corresponding elment in right array
        for (int i = 0; i < nums.length; i++) {
            left[i] = left[i] * right[i];
        }
        return left;
    }
}
