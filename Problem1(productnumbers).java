/*
Leetcode problem: 238
Algorithm:
    1. Traverse the array in forward direction, while traversing save the product of previous elements of the array in the respective index of result array.
    2. Traverse the array in backward direction, while traversing multiply the existing value in result array with the product of elements towards the right of the original array.
    3. Return the result array
    
Time Complexity: O(n)
Space Complexity: O(1) as we not using extra space apart from the result required array.

Did the solution run on leetcode; Yes?
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //Base case
        if(nums.length==0 || nums==null)
            return nums;
        
        int[] result = new int[nums.length];
        
        int temp =1;
        int runningsum=1;
        for(int i=0; i<nums.length; i++){
            runningsum*=temp;
            result[i] = runningsum;
            temp = nums[i];
        }
        runningsum =1;
        temp =1;
        for(int i=nums.length-1; i>=0 ;i--){
            runningsum *= temp;
            result[i] *= runningsum;
            temp = nums[i];
        }
        
        return result;
        
    }
}