class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sol[i] = 1;
        }
        int pre = 1;
        int post = 1;

        for (int i = 0; i < nums.length; i++) {
            sol[i] = sol[i] * pre;
            pre = pre * nums[i];
            sol[nums.length - i - 1] = sol[nums.length - i - 1] * post;
            post = post * nums[nums.length - i - 1];
        }
        return sol;
    }
}