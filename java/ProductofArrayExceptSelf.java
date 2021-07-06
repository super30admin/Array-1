// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
--> Calculate left product of the array  and update the o/p array with
--> update the same o/p array with right product and multiply with with existing array's value(left product)
--> Return the o/p array
 */
// Your code here along with comments explaining your approach
/*
return product of left and right elemsnt's product
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0) return null;
        int len = nums.length;
        // Final answer array to be returned
        int[] ans = new int[len];
        //left product
        ans[0] = 1;
        for(int i=1; i<len; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        //right product
        int right = 1;
        for(int i=len-1; i>=0; i--){
            ans[i] =  ans[i] * right;
            right = right * nums[i];

        }
        return ans;
    }
}
