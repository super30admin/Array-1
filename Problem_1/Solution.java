// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * For calculating product of all elements except self, we need product of elements on left side and right side.
 * To get this product in constant time, we use two arrays left and right.
 * Left array stores product of all elements on left side except current one for each element
 * Right array stores product of all elements on right except current one for each element
 * Using this two arrays, we can calculate final result( which is reslt[i] = left[i] * right[i] )
*/
// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {
	//left sub array to store product of elements of left side 
        int start = 1;
        int[] left = new int[nums.length];
        left[0] = start;
        
        for(int i = 1; i < nums.length;i++){
            left[i] = nums[i-1] * left[i-1];
        }
        //right sub array to store product of elements of right side
        int[] right = new int[nums.length];
        right[nums.length - 1] = start;
        
        for(int i = nums.length - 2; i >= 0;i--){
            right[i] = nums[i+1] * right[i+1];
        }
        
	//Final result which gives product of all elements except self
	//Which is product of elements on right * products of elements on left
        for(int i = 0; i < nums.length;i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}