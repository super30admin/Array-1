// Time Complexity : O(N) where n is the number of elements
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];

        int rp = 1;
        result[0] = 1;
        for(int i=1; i<n; i++){ // one pass
            rp *= nums[i-1];
            result[i] = rp;
        }
        rp=1;

        for(int i=n-2; i>=0; i--){ // 2 pass
            rp *= nums[i+1];
            result[i] *= rp;
        }

        return result;
    }

}
