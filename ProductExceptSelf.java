// Time Complexity : O(N) - Since we are looping through the array of N elements
// Space Complexity : O(1) - No auxiliary space used
// Did this code successfully run on Leetcode : Yes
 // The intuition is to find the left product array and right product array; multiply both.

public class ProductExceptSelf {
   
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        int left=1;
        int right=1;
        for(int i=0;i<nums.length;i++){
            res[i]=left;
            left=left*nums[i]; // Finding products of all the elements to the left
        }
       
        for(int i=nums.length-1;i>=0;i--){
          res[i]=right*res[i];
            right=right*nums[i];  // Finding products of all the elements to the right
        }
        return res;
    }
    
}
