// Time Complexity : O(n)
// Space Complexity : O(1) because we're updating in the same result array
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Maintaing a left running product and a right running product

import java.util.Arrays;

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        if(nums == null || nums.length==0) return result;
        result[0]=1;
        int rp = 1;
        //left side
        for(int i=1;i<n;i++){
            rp = rp*nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        //right side
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i] *= rp;
        }

        return result;
    }

    public static void main(String [] args){
        int [] nums = new int[]{1,2,3,4};
        ProductExceptSelf pe = new ProductExceptSelf();
        System.out.println(Arrays.toString(pe.productExceptSelf(nums)));
    }
}