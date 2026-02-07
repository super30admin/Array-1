
/**
 * 238. Product of Array Except Self
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                // for any i, calculate all j's except i

                if (i == j) {
                    continue;
                }
                product = product * nums[j];
            }
            result[i] = product;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4, 5});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");
        result = new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");

    }
}
