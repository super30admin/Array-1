//TC : O(n)
//SC : O(1), since output array is not considered as extra space
//Did it successfully run on leetcode : Yes
//Approach:
//calculate left product and right product and multiply both to return the output

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length==0){
            return new int[0];
        }
        
        int[] left_product = new int[nums.length];
        
        //calculating left product
        left_product[0] = 1;    
        for(int i=1; i<nums.length; i++){
            left_product[i] = left_product[i-1]*nums[i-1];
        }
        
        //calculating right product 
        int cur_right_product = 1;
        left_product[left_product.length-1] *= cur_right_product;
            
        for(int i=left_product.length-2; i>=0; i--){
            cur_right_product *= nums[i+1];
            left_product[i] *= cur_right_product;
        }
        
        return left_product;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length==0){
            return new int[0];
        }
        
        int[] left_product = new int[nums.length];
        int[] right_product = new int[nums.length];
        
        //calculating left product
        left_product[0] = 1;    
        for(int i=1; i<nums.length; i++){
            left_product[i] = left_product[i-1]*nums[i-1];
        }
        
        //calculating right product 
        right_product[nums.length-1] = 1;    
        for(int i=nums.length-2; i>=0; i--){
            right_product[i] = right_product[i+1]*nums[i+1];
        }
        
        //output, calculated and stored in right_product array
        for(int i=0; i<right_product.length; i++){
            right_product[i] *= left_product[i];
        }
        
        return right_product;
    }
}