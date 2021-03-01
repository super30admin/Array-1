// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Initializing my runningproduct to 1 and resultant array result[0] = 1. 
//Iterate through the array to get the runningproduct of left hand elements and storing them into result[].
//Iterate from right side of the array, multiplying runningproduct with the element in result[] and store it again in result[] to return.
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        
        if(nums == null || nums.length == 0) return result;
        
        int runningproduct=1; 
        result[0] = 1;
        
        for(int i=1; i<n; i++){
            runningproduct = runningproduct * nums[i-1];
            result[i] = runningproduct;
        }
        
        runningproduct=1;
        
        for(int i=n-2; i>=0; i--){
            runningproduct = runningproduct*nums[i+1];
            result[i] = runningproduct* result[i];
        }
        
        return result;
    }
}