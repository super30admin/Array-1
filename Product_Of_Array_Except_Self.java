/*
    Time Complexity : O(N)
    Space Complexity : O(N)
    is worked on leetcode : YES
    
*/

public class Product_Of_Array_Except_Self{
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