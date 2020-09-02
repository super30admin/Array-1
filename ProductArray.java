// Time Complexity : O(N) N =  length of output array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//1. Consider an array named output which will keep track of the product of elements towards the left of the array.
//2. Secondly consider a variable which will return the product value of the elements towards the right and store in the same output array.
// Your code here along with comments explaining your approach
class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;

        // left
        for (int i = 0; i < nums.length; i++) {
            output[i] = product;
            product *= nums[i];
        }

        // right
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * product;
            product *= nums[i];
        }
        return output;

    }

    public static void main(String args[]) {
        ProductArray obj = new ProductArray();
        int nums[] = { 1, 2, 3, 4 };
        for (int num : obj.productExceptSelf(nums))
            System.out.print(" " + num);

    }
}