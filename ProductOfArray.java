
class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int mul = 1;
        int n = nums.length;

        result[0] = 1;

        for(int i = 1; i < n; i++ ) {
            mul *= nums[i-1];
            result[i] = mul;
        }

        mul = 1;

        for(int j = n-2; j >= 0; j-- ) {
            mul *= nums[j+1];
            result[j] *= mul;
        }

        return result;
    }
}