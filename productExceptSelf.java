//https://leetcode.com/problems/product-of-array-except-self/
/*
Time: O(N) where N=length of the nums
Space: O(N) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

// 1:
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        L[0] = 1;
        int rp = 1;
        //calculate the product of all the elements on the left side except the current element
        for(int i = 1; i < nums.length; i++) {
            rp = rp * nums[i-1];
            L[i] = rp;
        }
        //calculate the product of all the elements on the right side except the current element
        int[] R = new int[nums.length];
        R[nums.length - 1] = 1;
        rp = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i+1];
            R[i] = rp;
        }
        int output[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            output[i] = L[i] * R[i];
        }
        return output;
        
    }
}


//2.

//Time complexity: O(N)
//Space complexity: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        int rp = 1;
        for(int i = 1; i < nums.length; i++) {
            rp = rp * nums[i-1];
            output[i] = rp;
        }
        rp = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i+1];
            output[i] = output[i] * rp;
        }
        return output;
        
    }
}

