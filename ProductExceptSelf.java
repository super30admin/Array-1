/**
## Problem 1
Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of 
all the elements of nums except nums[i].
 
Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (238. Product of Array Except Self)
Any problem you faced while coding this :       No
 */

 // Logic: Calculate left elements product and right elements product and then multiply them
 class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        
        // calculate left elements product and store
        int running_product = 1;
        res[0] = 1;
        for(int i= 1; i<len; i++){
            running_product = running_product * nums[i-1];
            res[i] = running_product;
        }
        
        // calculate right elements product and multiply with left product
        running_product = 1;
        for(int i= len-2; i>=0; i--){
            running_product = running_product * nums[i+1];
            res[i] = res[i] * running_product;
        }
        return res;
    }
    
    public static void main(String args[]) 
    { 
        ProductExceptSelf obj = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        int[] res = obj.productExceptSelf(nums);

        // print result
        for(int num: res){
            System.out.print(num +" ");
        }
    }
}