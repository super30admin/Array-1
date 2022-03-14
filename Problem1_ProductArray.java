// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english

/*
For each element, we need product of all elements of its left side and right side
// First pass, will be calculating product of elements from left to right
//Second pass, will be calculating profduct of elements from right to left with multiplying value of previous produxt

//No auxilliary data strucure --> Constant space 
*/


// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        result[0] = 1;
        int mult = 1;
        //Left Product
        for(int i = 1; i< nums.length; i++){
            mult = mult * nums[i-1];
            result[i] = mult ;
        }
        
        mult = 1;
        //Right product
        for(int i = nums.length - 2; i >= 0; i--){
            mult = mult * nums[i+1];
            result[i] = result[i] * mult;
        }
        return result;
        
    }
}