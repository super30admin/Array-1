// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Calculate left cumulative sum in the result array and then calculate the product right sum using the left array values
import java.util.*;
class ProductExceptSelfSolution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
            return new int[0];
        int temp = 1, rp=1;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            rp=rp*temp;
            result[i] = rp;
            temp = nums[i];
        }
        temp  = rp =1;
        for(int i=nums.length-1; i>=0; i--) {
            rp = rp*temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
    }
}