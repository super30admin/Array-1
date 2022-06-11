// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
          int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int j = n - 2; j >= 0; j--) {
            rp = rp * nums[j + 1];
            result[j] = result[j] * rp;
        }
        return result;        
    }
}