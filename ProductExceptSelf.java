import java.util.Arrays;
//Time Complexity: O(n)
//Space Complexity: O(1), output is not considered in the space complexity
//Did this code successfully run on Leetcode : Yes
//Approach: maintain prefix product in the output array, keep an int variable for postfix product,
// at each i, multiply the prefix at i with postfix, update postfix by multiplying with nums[i]
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        final int[] output = new int[nums.length];
        output[0] = 1;

        //prefix product array
        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= postfix;
            postfix *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        final ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        System.out.println(Arrays.toString(productExceptSelf.productExceptSelf(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf.productExceptSelf(new int[] {1, 2, 3, 4, 5})));
    }
}
