// Time Complexity : O(n) + O(n) = O(n) as we doing two iterations
// Space Complexity : O(1) as we only have out array
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rp = 1;
        result[0] = 1;
        
        //keeping product till each index from left to right
        for(int i = 1; i < nums.length ; i++){
            rp *= nums[i-1];// running product from left till now * current-1 num
            result[i] = rp; 
        }

        rp = 1;
        //updating product till each index from right to left
        for(int i = nums.length-2; i >= 0 ; i--){ // starting from n-2 because n-2 index value will remain same as rp = 1
            rp *= nums[i+1]; // running product from right till now * current+1 num
            result[i] *= rp; // product from left * product from right 

        }

        return result;

    }
}