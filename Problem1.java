// Time Complexity : O(n)
// Space Complexity : O(1) - not using any auxillary space
// Did this code successfully run on Leetcode : yes, 1ms 
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


// So the basic idea is to traverse the numbers from left to right initially and store the current number as the product of previous result and previous number, and on the second iteration go from right to left
// and multiply the numbers from right to the numbers in the result array

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] result = new int[n];
        
        result[0] = 1;
        
        for(int i = 1; i < nums.length; i++){
            
            result[i] = nums[i-1]*result[i-1];
            
        }
        
        int right = 1;
        
        for(int i = n-1; i >= 0; i--){
            
            result[i] = result[i]*right;

            right = right*nums[i];
        }
        
        return result;
}
}