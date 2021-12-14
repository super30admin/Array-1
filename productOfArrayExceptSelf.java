// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*We need to get product of each element except self, that means product of elements on its left and right.
We take two arrays left and right.
Left array contains products of left elements similarly right array stores right elements product.
We can now calculate final result multiplying this two array products.
}*/
// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int start = 1;
        int[] left = new int[nums.length];
        left[0] = start;

        for(int i = 1; i < nums.length;i++){
            left[i] = nums[i-1] * left[i-1];
        }
        int[] right = new int[nums.length];
        right[nums.length - 1] = start;

        for(int i = nums.length - 2; i >= 0;i--){
            right[i] = nums[i+1] * right[i+1];
        }

        for(int i = 0; i < nums.length;i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
} 