// Time Complexity :O(2N)= O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yess
// Three line explanation of solution in plain english: i calculate the product of all the left number of that element and then right and multipy with each other to get product of all the element except that number.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0]=1;
        // left
        int leftProduct = 1;
        for (int i = 1; i < n; i++) {    
            leftProduct =leftProduct* nums[i-1];
            result[i] = leftProduct;
        }

        // right
        int rightProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct =rightProduct* nums[i+1];
            result[i] = result[i] * rightProduct;

        }

        return result;
    }
}

