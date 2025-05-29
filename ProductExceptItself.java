/*
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/

public class ProductExceptItself {

    public static int[] getProductExceptItself(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Initialize the result array
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        // Calculate the product of elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= arr[i];
        }

        // Calculate the product of elements to the right of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }

}
