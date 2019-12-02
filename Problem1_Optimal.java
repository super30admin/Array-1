/**
Leet Code Submitted : YES
Time Complexity : O(N)
Space Complexity : O(N)

The idea is to store the left and right product count and avoid additional space complexity which we saw in previous version of the code
**/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length < 1)
            return nums;
        
        /*int[] left   = new int[nums.length];
        int[] right  = new int[nums.length];*/
        
        int[] output = new int[nums.length]; 
        
        int runProduct = 1;
        output[0] = 1;
        
        //Left Array Products
        for(int i = 1; i<nums.length; i++){
            //runProduct = nums[i-1];
            output[i] = runProduct*nums[i-1];
            runProduct = output[i];
        }
        
        runProduct = 1;
        //output[nums.length - 1] = ;
        
        //Right Array Products
        for(int i = nums.length -2; i>=0; i--){
            //runProduct = nums[i-1];
            int temp   = runProduct*nums[i+1];
            output[i]  = output[i] * temp;
            runProduct = temp;
        }
        
        /*for(int i =0; i< nums.length;i++){
            output[i] = left[i]*right[i];
        }*/
        
        /*for(int i =0;i<nums.length; i++){
            System.out.println(left[i]);
            System.out.println(right[i]);
            System.out.println("hi");
            
        }*/
        
        
        return output;
    }
}
