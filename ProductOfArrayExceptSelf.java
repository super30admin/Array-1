/**
 * https://leetcode.com/problems/product-of-array-except-self/submissions/
 * 
 * time: O(2n) => O(n)
 * space: O(2n) 
 * because of storing right running product in a separate array
 * 
 * Three line explanation of solution in plain english:
 * 1. Store a running product from left in result array
 * 2. Store a running product from right in runningProductR array
 * 3. Multiply elements from the above both arrays to get the product of array except self
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if(nums == null || nums.length == 0) return result;
        result[0] = 1;
        
        // store running product left
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        // store running product right
        int[] runningProductR = new int[nums.length];
        runningProductR[nums.length-1] = 1;
        for(int i = nums.length-2; i>=0; i--){
            runningProductR[i] = runningProductR[i+1] * nums[i+1];
        }
        
        for(int i = 0; i < nums.length ; i++){
            result[i] *= runningProductR[i];
        }
        
        return result;
    }
}

/**
 * https://leetcode.com/problems/product-of-array-except-self/submissions/
 * 
 * time: O(2n) => O(n)
 * space: O(n) because of taking the right running product 
 * as a variable instead of storing it in a separate array
 * Three line explanation of solution in plain english:
 * 1. Store a running product from left in result array
 * 2. Store running product from right in a variable
 * 3. Multiply elements from the above arrays to get the product of array except self
 */
class Problem26 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if(nums == null || nums.length == 0) return result;
        result[0] = 1;
        
        // store running product left
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        // multiply in place by the running product right
        int runningProductR = 1;
        for(int i = nums.length-1; i >=0 ; i--){
            result[i] *= runningProductR;
            runningProductR *= nums[i];
        }
        
        return result;
    }
}