/*
    Time Complexity : O(N)
    Space Complexity : O(N)
    is worked on leetcode : YES
    
*/

public class Product_Of_Array_Except_Self{
    private static double log2(int N) 
    { 
        double result = (double)(Math.log(N) / Math.log(2)); 
        return result; 
    } 
    public int[] productExceptSelf_Constant_Space(int[] nums) {
        
        if (nums == null || nums.length == 0 ) return new int[nums.length];
        int n = nums.length;
        
        int product = 1;
        for(int num : nums){
            product *= num;
        }
        double log_product = log2(product);
       
        
        for(int i=0; i < nums.length; i++){
            double anti = log_product - log2(nums[i]);
            nums[i] = (int) Math.pow(2,anti);
            // System.out.print("AntiLog "+anti);
        }
        return nums;
    }

    public int[] productExceptSelf(int[] nums) {
        
        if (nums == null || nums.length == 0 ) return new int[nums.length];
        int n = nums.length;
        int [] result =  new int[n];
        for(int i=0;i< n ;i++){
            result[i] = 1;
        }
        
        int temp = 1;
        int i;
//         left product 
        for(i=0;i<n;i++){
            result[i] =  temp;
            temp *= nums[i];
        }
        
//         reinitialize temp
        temp = 1;
        
//         right product 
        for(i=n-1;i>=0;i--){
            result[i] *=  temp;
            System.out.println(result[i]);
            temp*= nums[i];
        }
     return result;   
    }
}