// Time Complexity : O(n) , n-> length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * we need to calculate the running product from left and right for every number and at end multiply them to get the result
 * and store it in the array.
 * We use a result array to store the products
 */
// Your code here along with comments explaining your approach
/*
 * 1st calculate the product from left for every element in the array and store in result
 * then calculate the product from right and store in the result array by multiplying it with the current result index value
 */
class productArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        if (nums.length == 0 || nums == null)
            return nums;
        int[] res = new int[nums.length];

        int lP = 1;
        res[0] = lP;
        for (int i = 1; i < nums.length; i++) {
            lP *= nums[i - 1];

            res[i] = lP;
        }

        lP = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            lP *= nums[i + 1];
            res[i] = res[i] * lP;
        }

        return res;

    }

}
