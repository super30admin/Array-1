// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
compute left pass and right pass products by using single resultant array by considering running product
except the index of the current element and then eventually multiply the results of both these passes to
get the overall product.
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] productArr = new int[len];
        int product = 1;

        productArr[0] = 1;

        for(int i = 1 ; i < len ; i++) {
            product = product * nums[i - 1];
            productArr[i] = product;
        }

        product = 1;

        for(int i = len - 2 ; i >= 0 ; i--) {
            product = product * nums[i + 1];
            productArr[i] *= product;
        }
        return productArr;
    }
}