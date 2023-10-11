// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class ProductArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n= nums.length;
            int result[] = new int[n];
            result[0] = 1;
            int product = 1;

            for(int i = 1; i < n; i++){
                product = product * nums[i - 1];
                result[i] = product;
            }

            product = 1;

            for(int i = n-2; i >= 0; i--){
                product = product * nums[i + 1];
                result[i] = result[i] * product;
            }

            return result;
        }
    }
}
