// Time Complexity : O(n)), 
// Space Complexity : O(1), no extra space taken,array which is declared is result to be returned,so wont get counted
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package array1;

/**
 *
 * @author shilpa
 */
public class ArrayProduct {
 public int[] productExceptSelf(int[] nums) {
      
        int [] arr = new int [nums.length];
        if(nums.length == 0 || nums == null) return arr;
        int rp = 1; arr[0] = 1;
        //left side 
        for(int i = 1 ; i < nums.length; i++){
            rp = rp * nums[i - 1];
            arr[i] = rp;
        }
        rp = 1;
        //right side
        for(int i = nums.length -2; i >= 0; i--){
            rp = rp * nums[i + 1];
            arr[i] = rp * arr[i];
        }
        return arr;
    }    
}
