// Time Complexity : O(2n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach - first store all left products in the output array in first pass in nums array. then use variable for right product and multiply that variable to output[i] and store in output[i]. at the end return output array.

public class ProductElementsExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int output[] = new int[n];

        output[0] = 1;  //store left products in output array

        for(int i=1; i<n; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        int r = 1;  //variable to calculate right product
        for(int i=n-1; i>=0; i--) {
            output[i] = output[i] * r;
            r = r * nums[i];
        }

        return output;
    }

    //helper function to print output array
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
        ProductElementsExceptSelf solver = new ProductElementsExceptSelf();

        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solver.productExceptSelf(nums1);
        System.out.println("Input: [1,2,3,4], Output: " + arrayToString(result1));

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solver.productExceptSelf(nums2);
        System.out.println("Input: [-1,1,0,-3,3], Output: " + arrayToString(result2));
    }
}
