//Time Complexity: O(2n) = o(n); n : length of array;
//Space Complexity: O(1) ; no extra space
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        left[0] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        int RightProd = 1;
        for (int i = length - 1; i >= 0; i--) {
            left[i] = left[i] * RightProd;
            RightProd *= nums[i];
        }

        return left;
    }
}