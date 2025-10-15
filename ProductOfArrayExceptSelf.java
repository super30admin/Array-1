// 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description/

// Solution 1 => Brute force

/**
 * Time Complexity :  O(n^2) since for every element we traverse entire array again
 * Space Complexity : O(1) since no extra linear space and answer array is not considered as auxillary space
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int ans[] = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            int prod = 1;
            for(int j = 0 ; j < nums.length ; j++){
                if(i != j){
                    prod = prod * nums[j];
                }
            }

            ans[i] = prod;
        }

        return ans;
    }
}

// Solution 2 => Prefix & Suffix

/**
 * Time Complexity :  O(n) since for every element
 * Space Complexity : O(1) since no extra linear space and answer array is not considered as auxillary space
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] ans = new int[nums.length];

        ans[0] = 1;

        int suffix = 1; // store suffix product

        for(int i = 1; i < nums.length ; i++){ // prefix
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        for(int j = nums.length - 2 ; j >= 0 ; j--){ // suffix
            suffix = suffix * nums[j + 1];
            ans[j] = ans[j] * suffix;
        }

        return ans;
    }
}