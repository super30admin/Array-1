/**
 * 238. Product of Array Except Self
 * Time Complexity: O(n)
 * Space Complexity: O(1) if we don't consider the output array, otherwise O(n)
 */
public class ProductOfArrayExceptSelf1 {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length - 1;
        int[] result = new int[nums.length];
        // LPS
        int product = 1;
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                product = product * nums[i - 1];
            }
            result[i] = product;
        }
        // RPS
        product = 1;
        for (int i = n; i >= 0; i--) {
            if (i != n) {
                product = product * nums[i + 1];
            }
            result[i] = result[i] * product;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result = new ProductOfArrayExceptSelf1().productExceptSelf(new int[]{1, 2, 3, 4, 5});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");
        result = new ProductOfArrayExceptSelf1().productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");

    }
}
