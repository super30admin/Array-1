//Problem 238 : Product of Array Except Self
//Time Complexity : O(n) + O(n) = O(2n) ~ O(n)
//Space Complexity : O(1) as we don't consider input array and output array in calculating space used.
//Successfully solved on leetcode and faced No issues.
// Approach : I first initialized an output array and calculated the prefix product (product of elements to the left) for each element. Then, I initialized a variable for the suffix product (product of elements to the right) starting at 1. After that, I traversed the array from right to left, updating each output element by multiplying it with the current suffix product, and then updated the suffix product by multiplying it with the current element. 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length]; //initialising output array of size nums.length
        output[0] = 1;
        //calculate prefix product first
        for(int i = 1; i< nums.length ; i++){   
            output[i] = output[i-1] * nums[i-1];
        }
        int rp = 1; //let inital rightproduct be 1
        for(int i = nums.length-1 ; i>=0 ; i--){
            output[i] = rp * output[i];
            rp = rp * nums[i];
        }
        return output;
    }
}