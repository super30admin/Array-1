// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
/*
 * First started taking running product(rp) from left excluding the value of first index and kept them storing in result array
 * Then started taking rp from right excluding the last element and also mutiplying the value from the result array for same index
*/

// Your code here along with comments explaining your approach

class ProductArrayExcludeSelf {
    public int[] productExceptSelf(int[] nums) {
        // return bruteForce(nums);
        // return helperTwoArray(nums);
        return helperOneArray(nums);
    }

    public int[] helperOneArray(int nums[]) {
        int n = nums.length;
        // counter to store running product
        int rp = 1;
        // Array to store result
        int result[] = new int[n];

        // Set to one in order to exclude the first value
        result[0] = 1;

        // take rp from left
        for (int i = 1; i < n; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }

        // take rp from right
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            // Also mutiply the value of rp from left
            result[i] = rp * result[i];
        }

        return result;
    }

    // public int[] helperTwoArray(int nums[]) {
    // int n = nums.length;
    // int rp = 1;
    // int result[] = new int[n];

    // int left[] = new int[n];
    // int right[] = new int[n];

    // left[0] = 1;
    // right[n - 1] = 1;

    // for (int i = 1; i < n; i++) {
    // rp *= nums[i - 1];
    // left[i] = rp;
    // }

    // rp = 1;
    // for (int j = n - 2; j >= 0; j--) {
    // rp *= nums[j + 1];
    // right[j] = rp;
    // }

    // for(int i = 0; i <= n-1; i++) {
    // result[i] = left[i] * right[i];
    // }

    // return result;
    // }

    // public int[] bruteForce(int nums[]) {
    // int n = nums.length;
    // int result[] = new int[n];

    // for(int i = 0; i < n; i++) {
    // int rp = 1;
    // for(int j = 0; j < n; j++) {
    // if(i != j) {
    // rp *= nums[j];
    // result[i] = rp;
    // }
    // }
    // }

    // return result;
    // }
}