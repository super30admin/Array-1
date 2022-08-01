//Product of Array Except Self

// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;;
        int[] result = new int [n];
        if(nums == null || n == 0) return result;

        int rp = 1;
        result[0] = 1;

        for (int i = 1; i < n; i++){
            rp *= nums[i-1];
            result[i] = rp;
        }

        rp=1;
        for(int i = n-2; i >= 0 ; i--) {
            rp = rp *nums[i+1];
            result[i] =  result[i] *rp;
        }
        return result;


    }
}
