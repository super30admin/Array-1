

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftRes = new int[n];
        leftRes[0] = 1;

        for (int i = 1; i < n; i++) {
            leftRes[i] = leftRes[i - 1] * nums[i - 1];
        }

        int r = 1;
        int[] result = new int[n];

        for(int i = n-1; i >= 0 ; i--) {
            result[i] = leftRes[i] * r;
            r*= nums[i];
        }

        return result;
    }
}
