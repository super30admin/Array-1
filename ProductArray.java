// TC : O(n) 
// SC : 
class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;
        int n = nums.length;
        int ans[] = new int[n];
        if(nums == null || nums.length == 0) {
            return ans;
        }
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            rp *= nums[i - 1];
            ans[i] = rp;
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            ans[i] = ans[i] * rp;
        }
        return ans;
}
}