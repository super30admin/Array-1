public class ProductExceptSelf {
    /**
     * Maintain 2 running products from each end of the array and multiply these coming from
     * either end at any given index to calculate the given problem
     *
     * Time: O(n) Space: O(1)
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int forwardProduct = 1;
        int[] backwardProduct = new int[len];
        backwardProduct[len - 1] = 1;

        for (int i = len - 2; i >= 0; i--) {
            backwardProduct[i] = backwardProduct[i + 1] * nums[i + 1];

            if (backwardProduct[i] == 0) {
                break;
            }
        }

        for (int i = 0; i < len; i++) {
            backwardProduct[i] = forwardProduct * backwardProduct[i];
            forwardProduct *= nums[i];
        }

        return backwardProduct;
    }
}
