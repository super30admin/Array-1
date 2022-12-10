public class Product_except_self {
    // Time: O(n), Space: O(n)
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int L[] = new int[length];
        int R[] = new int[length];
        int ans[] = new int[length];

        L[0] = 1;
        for (int i = 1; i<length; i++) {
            L[i] = L[i-1] * nums[i-1];
        }
        R[length-1] = 1;
        for (int j = length-2; j>=0; j--) {
            R[j] = R[j+1] * nums[j+1];
        }

        for (int k = 0; k<length; k++) {
            ans[k] = L[k] * R[k];
        }

        return ans;
    }
}