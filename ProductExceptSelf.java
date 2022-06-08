// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int[] res = new int[nums.length];
        
	  // Take left product
        res[0] = 1;
        for(int i=1;i<nums.length;i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        
	  // Take right product
        int mf = 1;
        for(int j=nums.length-1;j>=0;j--) {
            res[j] = res[j] * mf;
            mf = mf * nums[j];
        }
        
        return res;
    }
}
