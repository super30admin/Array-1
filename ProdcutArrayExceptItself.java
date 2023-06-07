// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We use a two-pass approach to calculate the products,first by calculating the products of all elements to the left of each index and then multiplying them with the products of all elements to the right of each index. We can use running product to temporarily store the products. 

// Your code here along with comments explaining your approach

import java.util.Arrays;

public class ProdcutArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        int temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        ProdcutArrayExceptItself obj = new ProdcutArrayExceptItself();
        int[] arr = { 1, 2, 3, 4 };
        System.out.println("Product of Input Array Except Itself: " + Arrays.toString(obj.productExceptSelf(arr)));
    }

}