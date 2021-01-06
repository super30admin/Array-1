//Problem 26 : Optimized - Product of Array Except Self 
// Time Complexity : O(n), number of elements in input array
// Space Complexity : O(1), because extra array is the output array which is not auxillary
// Did this code successfully run on Leetcode :Yes

// Your code here along with comments explaining your approach 
/*
  Optimal     : 1) Create one array called left array of similar size of input array. 
                2) Initialize leftArr first index with 1 and then store product of 0 to n-2 elements of input array in the left array.
                3) Then initialise a variable called running product with 1.
                4) Start from n-2 element from the left array. Multiple existing runnning product with last element (n-1) of actual/input array and store it to the runninng product.
                5) Then multiply that running product with the n-2 element of the left array and update the resultant
                6) Follow above steps 4 and 5 until u reach first element of the array.   

*/
class Solution26Optimized {
    public int[] productExceptSelf(int[] nums) {
     
        //TC: O(n), SC:O(1)
        
        if(nums==null || nums.length==0){
            return new int[0];
        }
        
        int[] leftArr = new int[nums.length];
        leftArr[0] = 1;
        
        //left pass
        for(int i=1;i<nums.length;i++){
            leftArr[i] = leftArr[i-1]*nums[i-1];
        }
        
        //Now right pass on the same array
        int runProd = 1;//running product
        for(int i=nums.length-2;i>=0;i--){
            runProd = runProd*nums[i+1];
            leftArr[i] = runProd * leftArr[i];
        }
        
        return leftArr;
    }
}