class Solution {

    /**
     * nums- [1,2,3,4]
     * <p>
     * left pass - multiplication of all elements left to the current element
     * left - [1,1,2,6]
     * <p>
     * right pass - multiplication of all elements left to the current element
     * right- [24,12,4,1]
     * <p>
     * multiply 2 arrays
     * [24,12,8,6]
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        // space can be optimized. Left pass in result, multiply by right pass in same array - return
        int[] left = new int[len];
        int[] right = new int[len];
        int[] result = new int[len];

        // left pass
        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1]; // remember prev of nums * prev of left
        }

        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1]; // remember next of nums * next of right
        }

        for (int i = 0; i < len; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
