// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// 1. calculating prefix (product of all the elements to the left)
// 2. using running poduct to calculate the postfix (product of all the elements to the right)
// 3. finally multiplying both to get the result without using division operation.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        
        //null case
        if(nums.length == 0)
            return res;
                
        res[0] = 1;
        
        // calculate prefix
        for (int i = 1; i <= len-1; i++) {
            res[i] = nums[i-1] * res[i-1];            
        }
        //System.out.println("prefix: "+ Arrays.toString(res));
        
        // calculate postfix & start multiplying there itself to get the ans
        int rp = 1; // running product
        for (int i = len-2; i >= 0; i--) {
            rp *= nums[i+1];
            res[i] = rp * res[i];
        }
        //System.out.println("res: "+ Arrays.toString(res));
        
        return res;
    }
}
