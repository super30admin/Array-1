/*
Time Comlexity - O(n)
Space Complexity - O(1) 
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int rlProduct = 1;
        int rrProduct = 1;
        output[0] = 1;
        for(int i=1;i<nums.length;i++){
            rlProduct = rlProduct * nums[i-1];
            output[i] = rlProduct;
        }
        
        for(int j=nums.length-2;j>=0;j--){
            rrProduct = rrProduct * nums[j+1];
            output[j] = rrProduct * output[j];
        }
        
        return output;
        
    }
}
