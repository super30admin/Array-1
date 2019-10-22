/*
Author: Akhilesh Borgaonkar
Problem: LC 238. Product of Array Except Self (Array-1)
Approach: Used the fact that the product of elements until i-1 and beyond i+1 is equal to product of array except ith element. 
	Optimized the solution by using no extra space other than output array and 1 runningProd variable. Two-passes required.
Time Complexity: O(n) where n is number of elements in nums[].
Space complexity: O(1) constant
LC verified
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] output = new int[l];
        output[0]=1;

        for(int i=1; i<l; i++){
            output[i] = output[i-1]*nums[i-1];	//calcualting left multiplication
        }

        int runningProd = 1;
        for(int j=l-2; j>=0; j--){				//adding the runningProd delayed by 1 element
            runningProd *= nums[j+1];
            output[j] *= runningProd;
        }
        
        return output;
    }
}