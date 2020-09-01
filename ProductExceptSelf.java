// Time Complexity : O(N) where is the length of the input array
// Space Complexity : O(1) since we are not using any auxillary space.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english :
        //Just traverse through the array from left to right and generating/
        //left products of each element.
        //then multiply right product by iterating from right to left

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length];
        
        int product = 1;
        
        for(int i = 0; i < nums.length ; i++) {
            result[i] = product;
            product *= nums[i];
        }
        
        product = 1;
        
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i]*product;
            product *= nums[i];
        }
        
        return result;
    }
}