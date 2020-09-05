/*
238. Product of Array Except Self - MEDIUM
https://leetcode.com/problems/product-of-array-except-self/
Did this code successfully run on Leetcode: Yes
*/

import java.util.Arrays;

public class ProductExceptSelf {

    // Brute force solution with 2 loops
    // multiple values except when i is not equal to j
    // TC: O(n)
    // SC: O(1); not considering the output space
    public static int[] productExceptSelfBruteForce(int[] nums) {
        int prod[] = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = 1;
            for (int j = 0; j < nums.length; j++) {
                // exclude 'self' from product
                if (i != j) {
                    product = product * nums[j];
                }
            }
            prod[i] = product;
        }
        return prod;
    }
    
    // break the problem into 2 parts
    // for every element in the array, calculate the product of elements to its left, and store in an array
    // for every element in the array, calculate the product of elements to its right, and store in an array
    // the final answer is the product of left(i) & right(i)
    // TC: O(n) + O(n) + O(n) ~ O(n) => left array + right array + product
    // SC: O(2n); left array + right array, and not including the return space
    public static int[] productExceptSelfWithExtraSpace(int[] nums) {
        int n = nums.length;
        int prod[] = new int[n];
        
        int left[] = new int[n];
        int right[] = new int[n];
        
        // left product
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        
        // right product
        right[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        
        // result = left * right
        for (int i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
        }
        
        return prod;
    }
    
    // break the problem into 2 parts, product of elements on the left & product of elements on the right
    // instead of storing separately, calculate either the left product or right product first
    // if right product calculated first, the start loop from beginning, calculate running product of elements before position i
    // multiply product with the value in right array
    // return right array as the result
    // TC: O(n) + O(n) => once calculate right product + calculate left product and multiple to result
    // SC: O(1) => no extra space, other than the result
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // right product
        result[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            result[i] = result[i+1] * nums[i+1];
        }
        
        int prod = 1;

        // running left product * right product
        for (int i = 0; i < n; i++) {
            result[i] = result[i] * prod;
            prod = prod * nums[i];
        }
        
        return result;
    }

    public static void main(String args[]) {
        int arr[] = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelfBruteForce(arr)));
        System.out.println(Arrays.toString(productExceptSelfWithExtraSpace(arr)));
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
