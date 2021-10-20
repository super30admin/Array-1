// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        int rightProd = 1;
        
        for(int i =0;i<nums.length;i++){
            result[i] = 1;
        }
        
        for(int i =1; i<nums.length; i++){
            result[i] =  result[i-1] * nums[i-1];
        }
        
        for(int i =nums.length-1; i>=0; i--){
            result[i] =  result[i] * rightProd;
            rightProd = rightProd * nums[i];
        }
        
        return result;
    }
}