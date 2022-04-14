// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : We calculate two products prefixProduct and postfixProduct
// and then the result will be the product of both

class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[] {};
        }
        
        int[] res = new int[nums.length];
        int runningProduct = 1;
        
        for(int i = 0; i < nums.length; i++) {
            res[i] = runningProduct;
            runningProduct *= nums[i];
        }
        
        runningProduct = 1;
        
        for(int i = nums.length-1; i >= 0; i--) {
            res[i] *= runningProduct;
            runningProduct *= nums[i];
        }
        
        return res;
    }
}