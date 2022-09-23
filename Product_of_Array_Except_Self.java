// TC : O(n)
// SC : O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod = 1;
        int n = nums.length;
        int[] leftPass = new int[n];
        
        leftPass[0] = prod;
        
        for(int i = 1; i < n; i++) {
            prod = prod * nums[i - 1];
            leftPass[i] = prod;
        }
        int k;
        prod = 1;
        k = nums[n - 1];
        nums[n - 1] = prod;
        for (int i = n - 2; i >= 0; i--) {
            prod = prod * k;
            k = nums[i];
            nums[i] = prod;
        }
        
        for(int i = 0; i < n; i++) {
            leftPass[i] = nums[i] * leftPass[i];
        }
        
        return leftPass;
    }
}
