// Prefix sum O(n) time, O(n) space
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] prefix = new int[n];
//         int[] postfix = new int[n];
//         int[] ans = new int[n];

//         prefix[0] = 1;
//         postfix[n-1] = 1;

//         for (int i = 0; i < n; i++) {
//             prefix[i] = prefix[i-1] * nums[i-1];
//         }

//         for (int i = n-2; i >= 0; i--) {
//             postfix[i] = postfix[i+1] * nums[i+1];
//         }

//         for (int i = 0; i < n; i++) {
//             ans[i] = prefix[i] * postfix[i];
//         }

//         return ans;
//     }
// }

// Prefix sum O(n) time, O(1) space
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        int runningProduct = 1;

        for (int i = 0; i < n; i++) {
            runningProduct = runningProduct * nums[i-1];
            ans[i] = runningProduct;
        }

        runningProduct = 1;
        for (int i = n-2; i >= 0; i--) {
            runningProduct = runningProduct * ans[i+1];
            ans[i] = ans[i] * runningProduct;
        }

        return ans;
    }
}