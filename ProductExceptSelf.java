/* Time Complexity : O(n) 
 * 	n - length of the input array - nums */
/* Space Complexity : O(1)*/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp = 1;
        int[] result = new int[n];
        result[0] = 1;
        //left array
        for(int i = 1; i < n; i++){
        	//rp * value on the left
            rp *= nums[i-1];
            result[i] = rp;
        }
        //right array
        rp = 1;
        for(int i = n-2; i >= 0; i--){
        	//rp * value on the right
            rp *= nums[i + 1];
            //value at curr. index in result * rp
            result[i] *= rp;
        }
        return result;
    }
}
