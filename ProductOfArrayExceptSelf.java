class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int result[] = new int[n];
        
        for (int i = 0; i < n; ++i) {
            result[i] = 1;
        }
        
        for (int i = 1; i < n; ++i) {
            result[i] = result[i - 1] * nums[i - 1];
            // [1,2,3,4]
            // [1,1,2,6]
        }

        int rp = 1;

        // [1*(1*4*3*2),1*(1*4*3),2*(1*4),6*1]
        // [24,12,8,6]
        for (int i = n - 1; i >= 0; --i) {
            result[i] = result[i] * rp;
            rp = rp * nums[i];
        }

        return result;
    }
}