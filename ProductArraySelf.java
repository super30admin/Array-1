
class ProductArraySelf {
    public int[] productArrayself(int[] nums) {
        int[] product = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            product[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            product[i] = product[i - 1] * nums[i - 1];
        }
        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] = right * product[i];
            right = nums[i];
        }
        return product;

        // time: O(n)
        // space: O(n)
    }
}