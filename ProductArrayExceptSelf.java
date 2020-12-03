class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod_right = 1;
        int n = nums.length;
        for(int i=n-1;i>0;i--){
            prod_right = prod_right * nums[i];
            ans[i] = prod_right;
        }
        int prod_left = 1;
        for(int i=0;i<n-1;i++){
            ans[i] = prod_left*ans[i+1];
            prod_left = prod_left * nums[i];
        }
        ans[n-1] = prod_left;
        return ans;
    }
}