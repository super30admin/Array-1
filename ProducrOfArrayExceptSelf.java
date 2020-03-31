// Time Complexity: O(n)
// Space Complexity: O(n)
 class Solution {
     public int[] productExceptSelf(int[] nums) {
         int n = nums.length;

         int[] left = new int[nums.length];
         if(n == 0) {
             return left;
         }
         int[] right = new int[nums.length];

         left[0] = 1;
         right[n-1] = 1;
         for(int i=1; i<n; i++) {
             left[i] = left[i-1] * nums[i-1];
         }

         for(int i=n-2; i>=0; i--) {
             right[i] = right[i+1] * nums[i+1];
         }

         for(int i=0; i<n; i++) {
             left[i] *= right[i];
         }

         return left;
     }
 }

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for(int i=1; i<n; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        int right = 1;

        for(int i=n-1; i>=0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }
}