// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Figuring out solutions using no division. 
// Your code here along with comments explaining your approach

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leng = nums.length;
        int[] ret = new int[leng];
        if(leng == 0)
            return ret;
        int runningprefix = 1;
        for(int i = 0; i < leng; i++){
            ret[i] = runningprefix;
            runningprefix*= nums[i];
        }
        int runningsufix = 1;
        for(int i = leng -1; i >= 0; i--){
            ret[i] *= runningsufix;
            runningsufix *= nums[i];
        }
        return ret;

    }
}