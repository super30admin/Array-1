// Time Complexity :o(n) + o(n) for the two for loops
// Space Complexity : O(n) for storing the resultant array
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// 2 3 4 5
// 1 2 6 12 -->left
// 60 20 5 1 -->right
// 60*1 2*60 6*5 12*1

// to generate left we use prod variable and in result we first store the previous prod and then 
// mutiply the current element with the prod which is gonna be stored in the next iteration  
// similarly for the right,we do it from the other end but this time we multiply the old value
//  (stored in result array due to last for loop) with the new prod 

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] res = new int[n];

        int prod = 1;
        // for element i , we are storing the left product from 1 to i-1 in res [i]
        for (int i = 0; i < n; i++) {
            res[i] = prod;
            prod = prod * nums[i];
        }

        prod = 1;
        // for element i , we are storing -->
        // (right product from i+1 to n in res [i])*(its previous value)
        for (int i = n - 1; i >= 0; i--) {
            res[i] = prod * res[i];
            prod = prod * nums[i];
        }

        return res;

    }
}