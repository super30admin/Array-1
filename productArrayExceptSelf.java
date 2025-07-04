// Time Complexity : O(n)
// Space Complexity : O(1) because the array we created we have returned it.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
    //we compute product of all elements to the left of the current element and
    //product of all element to the right of the current element
    //we take help of running product variable to keep track and finally take the product of left and right running product

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {

        //initialize running product and a result array of same size as input nums
        int rp = 1;
        int[] res = new int[nums.length];

        //product to left
        for(int i = 0; i < nums.length; i++){
            res[i] = rp;
            rp = rp * nums[i];
        }

        //reset running product
        rp = 1;

        //product to right
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] = res[i] * rp;
            rp = rp * nums[i];
        }

        //return result
        return res;

    }
}