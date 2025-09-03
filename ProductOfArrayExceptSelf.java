// Time Complexity : O(n)
// Space Complexity :O(1) -> output array is considered as auxillary space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 1. take the running product of the elements in the left side of that element
 2. take the running product of elements from right to left 
 3. that way we get the product of all the elements on the left and the rigth side without using divison operator
 */

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        //first element in the left pass will always be one as there are no rp for the elements on the left
        res[0] = 1;
        int rp = 1;

        // left pass
        for(int i = 1; i < nums.length; i++){
            rp = rp * nums[i - 1];
            res[i] = rp;
        }

        rp = 1;
        //right pass
        for(int i = nums.length - 2; i >= 0; i--){
            rp = rp * nums[i + 1];
            res[i] = res[i]  * rp;
        }
        return res;
    }
}