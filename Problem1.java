// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Calculate running product from two passes over the matrix - one from left to right and another from right to left
This should give a resultant array with products of all elements except the current element
 */

//Problem statement: https://leetcode.com/problems/product-of-array-except-self/

class Problem1 {
                public int[] productExceptSelf(int[] nums) {
                    int[] result = new int[length];

                    result[0] = 1;
                    for (int i = 1; i < nums.length; i++) {
                        result[i] = nums[i - 1] * result[i - 1];
                    }

                    int run = 1;
                    for (int i = nums.length - 1; i >= 0; i--) {
                        result[i] = result[i] * run;
                        run *= nums[i];
                    }

                    return result;
                }
            }
    }
}