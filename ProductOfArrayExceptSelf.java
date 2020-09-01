import java.util.*;

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int result[]=new int[nums.length];
        result[0]=1;
        int right=1;

        for(int i=1;i<nums.length;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        for(int i=nums.length-1;i>=0;i--){
            result[i] = result[i] * right;
            right*=nums[i];
        }

        return result;
    }
}
