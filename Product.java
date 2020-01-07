// Time Complexity : Brute force - O(N^N-1) optimised - O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out1 = new int[nums.length];		// initialize 2 new arrays
        int[] out2 = new int[nums.length];
        int[] out = new int[nums.length];		// output array
        Arrays.fill(out1, 1);
        Arrays.fill(out2, 1);
        
        
        /*boolean state = true;		// brute force solution
        int curr = 0;				// index to store the result in the index accordingly
        Arrays.fill(out, 1);		// default value in array is 0, we need to replace with 1 or else result would be 0 in all 
        
        for(int i = 0; i < nums.length; i++){		// traverse through the nums array to multiply the value other than current index
            for(int j = 0; j < nums.length; j++){	
                if(j != i){
                    out[curr] *= nums[j];			// out multiplied result is stored according to the index
                }
            }
            curr++;					// to ignore the current index
        }*/
        
        for(int i = 1; i< nums.length;i++){			// find the result from left to right
            out1[i] = nums[i-1] * out1[i-1];
        }
        
        for(int i = nums.length - 2; i>=0 ;i--){	// find the result from right to left
            out2[i] = nums[i+1] * out2[i+1];
        }
        
        for(int i = 0; i < nums.length ;i++){		// multiply the result of 2 out arrays to find the final result 
            out[i] = out1[i] * out2[i];
        }
        
        return out;			// return the final list
    }
}