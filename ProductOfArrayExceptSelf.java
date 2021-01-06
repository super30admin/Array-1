// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Coming with logic of forward and backward pass

// Notes : Find running product of numbers except self in forward and backward pass, and finally multiply them together

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result  = new int[nums.length];
        
        if(nums == null || nums.length == 0 ) return result;
        
        result[0] = 1;
        
        //forward pass
        for(int i = 1; i < result.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        
        int runningProduct = 1;
        
        //backward pass
        for(int i = result.length - 2; i >= 0; i--){
            runningProduct = runningProduct * nums[i+1];
            result[i] = result[i] * runningProduct;
        }
        
        return result;
    }
}
