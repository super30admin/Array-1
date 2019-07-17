// Time Complexity: O(n)
// Space Complexity: O(n)
// Run on LeetCode: Yes


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        int[] output = new int[nums.length];
        
        // Filling left array by initializing L[0] to be 1 as there are no elements to the left/
        left[0] = 1;
        for(int i=1; i<nums.length;i++){
            left[i] = nums[i - 1]*left[i - 1];            
        }
        // Filling left array by initializing right[LastElemt] to be 1 as there are no elements to the right/
        right[nums.length - 1] = 1;
        for(int i=nums.length - 2; i>=0;i--){
            right[i] = nums[i + 1]*right[i + 1];            
        }
        
        //Calculating final answer
        for(int i=0; i<nums.length;i++){
            output[i] = left[i]*right[i];
        }
        
        return output;
    }
}