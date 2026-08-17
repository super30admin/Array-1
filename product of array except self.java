class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lp = new int[n];
        int rp = 1;
        lp[0] = 1;
        for(int i=1; i< n; i++) {
            lp[i] = rp * nums[i-1];
            rp = lp[i];
        }
        rp=1;
        for(int j=nums.length-2; j >= 0; j--) {
            rp = rp * nums[j+1];
            lp[j] = lp[j] * rp;
        }
        return lp;
    }
}