/**
Leet Code Submitted : YES
Time Complexity : O(N)
Space Complexity : O(2N)

The idea is to store the left and right sub arrays runnin product so that we know at each index whats the current product excluding that element. This requires 2 arrays which can be made efficient. 
**/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length < 1)
            return nums;
        
        int[] left   = new int[nums.length];
        int[] right  = new int[nums.length];
        int[] output = new int[nums.length]; 
        
        int runProduct = 1;
        left[0] = 1;
        
        //Left Array Products
        for(int i = 1; i<nums.length; i++){
            //runProduct = nums[i-1];
            left[i] = runProduct*nums[i-1];
            runProduct = left[i];
        }
        
        runProduct = 1;
        right[nums.length - 1] = 1;
        
        //Right Array Products
        for(int i = nums.length -2; i>=0; i--){
            //runProduct = nums[i-1];
            right[i] = runProduct*nums[i+1];
            runProduct = right[i];
        }
        
        for(int i =0; i< nums.length;i++){
            output[i] = left[i]*right[i];
        }
        
        /*for(int i =0;i<nums.length; i++){
            System.out.println(left[i]);
            System.out.println(right[i]);
            System.out.println("hi");
            
        }*/
        
        
        return output;
    }
}
