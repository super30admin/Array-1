//TC: O(N) SC: O(1)
class ProOfArrExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];
        out[0] = 1;
        // left product
        for(int i = 1; i < n; i++) {
            out[i] = nums[i-1]*out[i-1];
        }
        //right product * left
        int rp = 1;
        for(int i = n-2; i >=0; i--) {
            rp *= nums[i+1];
            out[i] = out[i] * rp;
        }

        return out;
    }
}