// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Store the previous multiplication result and multiply with current element to get the product for next element. 
// Use two different directions from 1->length and length-1->0 to perform this operation 
class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {


        int[] result = new int[nums.length];

        // Initialize first element as 1
        result[0] = 1;

        // Iterate to right side of array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        // Initialize m to 1 as there won't be any element on rightmost
        int m = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            // update m to contain product of all elements to the right
            result[i] = result[i] * m;
            m *= nums[i];
        }

        return result;
    }
}