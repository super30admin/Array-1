//Problem 26 : Product of Array Except Self
// Time Complexity : O(n), number of elements in input array
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode :Yes

// Your code here along with comments explaining your approach 
/*
  Brute force : For each element calculate product of all except itself-TC->O(n^2), SC->O(1)
  Optimal     : 1) Create two arrays called left array and right array of similar size of input array. 
                2) Initialize leftArr first index with 1 and then store product of 0 to n-2 elements of input array in the left array.
                3) Initialize rightArr last index with 1 and then store product of n-1 to 1 elements of input array in the right array.
                4) Finally just multiply both left and right array and store the result in the input array, if editing of input array is allowed.

*/
class Solution26 {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums==null || nums.length==0){
            return new int[0];
        }
        
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        
        leftArr[0] = 1;
        rightArr[nums.length-1] = 1;
        
        for(int i=1;i<nums.length;i++){
            leftArr[i] = leftArr[i-1]*nums[i-1];
        }
        
        for(int i=nums.length-2;i>=0;i--){
            rightArr[i] = rightArr[i+1]*nums[i+1];
        }
        
        
        for(int i=0;i<nums.length;i++){
            nums[i] = leftArr[i]*rightArr[i];
        }
     
        return nums;
    }
}