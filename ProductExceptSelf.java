// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        
        if(nums == null || nums.length == 0){
            return result;
        }
        
        int p = 1; 
        result[0] = 1;
        
        for(int i=1; i<n; i++){
            p *= nums[i-1];
            result[i] = p;
        }
        
        p = 1;
        
        for(int i = n-2; i>=0; i--){
            p *= nums[i+1];
            result[i] *= p;
        }
        
        return result;
    }
}