// Time Complexity : O (n)  where m is number of houses
// Space Complexity : O (n) using 2 arrays for left and right product, O(1) using runningProduct, 
// as output array is not considered as extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.Arrays;

public class selfProduct {

    public static int[] productExceptSelf(int[] nums){
        if(nums == null || nums.length == 0) return new int[nums.length];
        int[] leftProduct = new int[nums.length];
        Arrays.fill(leftProduct, 1);
        for(int i = 1; i < nums.length; i++){
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }
        
    
        // int[] rightProduct = new int[nums.length];
        // Arrays.fill(rightProduct, 1);
        int runningProduct = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            runningProduct *= nums[i+1];
            leftProduct[i] *= runningProduct ;
        }
        // int[] res = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
            // res[i] = leftProduct[i] * rightProduct[i];
        // }

        // return res;
        return leftProduct;
    }

    public static void main(String[] args) {
        
        int[] nums = new int[]{1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        

        
    }
    
}
