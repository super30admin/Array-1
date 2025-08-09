// Time Complexity : O(n)    (We loop through the array 3 times)
// Space Complexity: O(n)    (Extra space for left[] and right[])
// Did this code successfully run on Leetcode? : Yes
// Any problem you faced while coding this : No

// Approach:
// 1. Create a left[] array where left[i] stores the product of all elements to the left of i.
// 2. Create a right[] array where right[i] stores the product of all elements to the right of i.
// 3. The final result for index i is left[i] * right[i].

class ProductArrSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Left product array
        int[] left = new int[n];
        left[0] = 1;
        int runningProduct = 1;
        for (int i = 1; i < n; i++) {
            runningProduct *= nums[i - 1];
            left[i] = runningProduct;
        }

        // Right product array
        runningProduct = 1;
        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            runningProduct *= nums[i + 1];
            right[i] = runningProduct;
        }

        // Result array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}


// Time Complexity : O(n)    -> Two passes over the array
// Space Complexity: O(1)    -> Output array used for storage (no extra arrays)
// Did this code successfully run on Leetcode? : Yes
// Any problem you faced while coding this : No

// Approach:
// 1. Use the result[] array to store the left product for each index in the first pass.
// 2. In the second pass (from right to left), maintain a runningProduct for the right side,
//    and multiply it directly into result[i] to get the final answer.

class ProductExceptSelfOptimised {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // First pass: store left products
        result[0] = 1;
        int runningProduct = 1;
        for (int i = 1; i < n; i++) {
            runningProduct *= nums[i - 1];
            result[i] = runningProduct;
        }

        // Second pass: multiply with right products
        runningProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            runningProduct *= nums[i + 1];
            result[i] *= runningProduct;
        }

        return result;
    }
}



