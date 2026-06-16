class Solution {
    public int[] productExceptSelf(int[] nums) {
        // TC - O(n)
        // SC - O(1) (not including result array)
        /*
            To calculate product of all elements except self, we first run a loop from left to right
            and calculate prouduct with each element to the left (which will be stored at index - 1 as we have already calculated that).
            And then we pass the array right to left and keep a runningSum initialize with the rightmost element and then keep
            multiplying it with values at the index. We also keep multiplying the runningSum value at each index.
        */

        int[] product = new int[nums.length];
        product[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            product[i] = nums[i - 1] * product[i - 1];
        }

        int runningProduct = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            product[i] = product[i] * runningProduct;
            runningProduct *= nums[i];
        }

        return product;
    }
}