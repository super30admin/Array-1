// Time Complexity : O(N) traversing through nums array elements
// Space Complexity : O(N) used result array to store the results
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: Same as class

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //sanity check
        if(nums == null || nums.length == 0) return new int[0];
        
        //initialize array to store results
        int[] result = new int[nums.length];
        
        //initialize left and right products
        int leftProduct = 1, rightProduct = 1;
        
        //initial i-1 which is 0 is 1 as left Product is 1
        result[0] = 1;
        
        //loop to calculate left product for each element
        for(int i=1; i<nums.length; i++){
            result[i] = leftProduct * nums[i-1];
            leftProduct = result[i];
        }
        
        //loop to calculate right product for each element
        for(int i = nums.length-1; i>=0; i--){
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        
        return result;
    }
}