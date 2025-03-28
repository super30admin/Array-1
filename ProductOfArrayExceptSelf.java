/**
 * TC: O(3n)
 * SC: O(2n) as the result array is not considered in space complexity
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        int rp = 1; // running product
        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) { //left product
            rp = rp * nums[i - 1];
            left[i] = rp;
        }

        rp = 1;
        for (int i = n - 2; i >= 0; i--) { //right prdt
            rp = rp * nums[i + 1];
            right[i] = rp;
        }

        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}

/**
 * Approach - 2
 * TC: O(2n)
 * SC: O(1)
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        int rp = 1; // running product
        result[0] = 1;
        result[n-1] = 1;

        for(int i = 1; i < n; i++){ //left product
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp = 1;
        for(int i = n-2; i >= 0; i--){
            rp = rp * nums[i+1]; //right product
            result[i] = result[i] * rp;
        }

        return result;
    }
}