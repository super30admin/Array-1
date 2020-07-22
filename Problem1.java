// Time Complexity :O(n)
// Space Complexity : O(1) not considering the result array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

1. Value at index i is product of index (0....i-1)*(i+1 ... nums.length-1)
2. We evalute product from left side.
3. then we calculate product from right simultaneously multipying it with product of left side.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        
        res[0] = 1;
        
        // left pass
        for(int i=1; i<res.length; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        
        
        int right = 1;
        // right pass
        for(int i=res.length-1; i>=0; i--){
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        
        return res;
    }
}