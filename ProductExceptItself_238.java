// Time Complexity : O(N) for both
// Space Complexity : O(N) for approach-1 and O(1) for approach-2
// Did this code successfully run on Leetcode : yes


/*
Approach 
========
1. First update the result array with product of every element's left elements.
2. Now, iterate from right to left, keeping track of right product so far using a "prod" variable. 
3. Multiply value in result array with the prod variable and keep updating prod variable to get product of array elements except itself.
*/

// ==================== Approach - 1 using O(N) space ===============================

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int prod = 1;
        left[0] = 1;
        // left product
        for( int i = 1; i < nums.length; i++) {
            left[i] = nums[i-1]*left[i-1];
        }
        
        right[nums.length - 1] = 1;
        prod = 1;

        //right product
        for( int i = nums.length-2; i >= 0; i--) {
            right[i] = nums[i+1]*right[i+1];
        }

        //updating array with the result
        for(int i = 0; i < nums.length; i++) {
            right[i] = right[i] * left[i];
        }
        
        return right;
    }
}

// ==================== Approach - 2 using constant space ===============================

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        // calculate left sub-product
        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i-1]*nums[i-1];
        }

        // Use right variable to keep track of right product so far and update result array with right subproduct as well
        // result would be result of right and left subproducts after this step
        int right = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}

