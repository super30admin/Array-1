// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Calculate the running product of all the elements on the left side of each element
// and store it in an array. Calculate the running product of all the elements on the
// right side of each element and multiply it with the previous running product of each
// element and store the result in the same array to get the resultant array.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // initialize new array
        int[] arr = new int[nums.length];
        // intialize running product = 1 for left pass
        int rp = 1;
        // left pass
        // store the running product for each element on its left side and store it in array
        for(int i = 0; i < nums.length; i++){
            if(i == 0) rp = 1;
            else {
                rp = rp * nums[i - 1];
            }
            arr[i] = rp;
        }
        rp = 1;
        // right pass
        // calculate the running product for each element on its right side
        // multiply this running product with previously stored running product and store it
        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1) rp = 1;
            else {
                rp = rp * nums[i + 1];
            }
            arr[i] = arr[i] * rp;
        }
        return arr;
    }
}