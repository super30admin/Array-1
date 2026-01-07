/*
Problem - Product of Array except self
Approach - First, we do a left-to-right pass storing running products before each index.
Then, we do a right-to-left pass multiplying the existing results with right-side products.
This way, each element gets the product of all other elements without using division.
Time Complexity - O(n)
Space Complexity - O(1)
 */

import java.util.Arrays;

public class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int rp  = 1; // running product
        result[0] = 1;
        for (int i = 1; i < n; i++) { // left traversal
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp  = 1;
        for (int i = n - 2; i >= 0; i--) { // right traversal
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }
        return  result;
    }
    public static void main(String[] args) {
        ArrayProduct ap = new ArrayProduct();
        int[] product1 = ap.productExceptSelf(new int[] {1,2,3,4});
        int[] product2 = ap.productExceptSelf(new int[] {-1,1,0,-3,3});
        System.out.println(Arrays.toString(product1));
        System.out.println(Arrays.toString(product2));
    }
}
