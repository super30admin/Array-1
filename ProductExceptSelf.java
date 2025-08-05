// Time Complexity  : O(n)  
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Approach:
// 1. First, build a prefix product array where each element holds the product of all elements to the left.
// 2. Then, traverse from the end and multiply with the suffix product (product of all elements to the right).
// 3. This gives the final result where result[i] = product of all elements except nums[i].

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int rp = 1;
        result[0] = 1;

        for(int i = 1; i < n; i++){
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        

        rp = 1;
        for(int i = n - 2; i >= 0; i--){
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }

        return result;
    }
}
