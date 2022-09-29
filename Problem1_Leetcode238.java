// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Solution1:
// TC: O(N) + O(N) = O(2N) = O(N)
// SC: O(N) + O(N) = O(2N) = O(N)

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         if(nums == null || nums.length == 0) return new int[]{};
//         int n = nums.length;
//         int rp = 1;

//         // calculate the left product for each element going from left to right
//         int[] leftProd = new int[n];
//         leftProd[0] = 1;
//         for(int i = 1; i < n; i++) {
//             rp = rp * nums[i - 1];
//             leftProd[i] = rp;
//         }

//         rp = 1;
//         // calculate the right product for each element going right to left
//         int[] rightProd = new int[n];
//         rightProd[n - 1] = 1;
//         for(int i = n - 2; i >= 0; i--) {
//             rp = rp * nums[i + 1];
//             rightProd[i] = rp;
//         }

//         // multiply leftProd and rightProd at each index to get final result
//         int[] res = new int[n];
//         for(int i = 0; i < n; i++) {
//             res[i] = leftProd[i] * rightProd[i];
//         }

//         return res;
//     }
// }

// Solution2:
// TC: O(N) + O(N) = O(2N) = O(N)
// SC: O(N)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};

        int n = nums.length;
        int rp = 1;
        int[] result = new int[n];

        // calculate the left product for each element going from left to right
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }

        rp = 1;
        // calculate the right product for each element going right to left and also add to previous left product
        for(int i = n - 2; i >= 0; i--) {
            // check for boundry condition i + 1
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }

        return result;
    }
}