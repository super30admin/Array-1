// Time Complexity : O(n) where n is the length of the array
// Space Complexity : O(n) where n is the length of the array
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: commented the code please look at the comments

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // left array will the product of all the elements to the left of the element at the ith position.
        int [] left  = new int[nums.length];
        // right array will the product of all the elements to the right of the element at the ith position.
        int [] right = new int[nums.length];
        int [] result = new int[nums.length];
        // for the first element the product will be equal to 1
        left[0] = 1;
        right[nums.length - 1] = 1;
        // for the last element the product will be equal to 1

        // find the left product
        for(int i = 1;i<nums.length;i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        // find the right product
        for(int i=nums.length - 2;i>=0;i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        // final result
        for(int i=0;i<nums.length;i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
// Time Complexity : O(n) where n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: commented the code please look at the comments

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int left = 1;
        int right = 1;
        result[0] = 1;
        result[nums.length - 1] = 1;

        // calculate the left product
        for(int i=1;i<nums.length;i++) {
            left = left * nums[i-1];
            result[i] = left;
        }

        // calculate the right product
        for(int i=nums.length - 2; i>=0;i--) {
            right = right * nums[i+1];
            result[i] = result[i] * right;
        }
        return result;
    }
}
