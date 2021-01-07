//Time Complexity:O(N)
//Space Complexity:O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rProduct = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
        if(nums == null || nums.length == 0)return new int[0];
      
        for(int i = 1;i<nums.length; i++){
            rProduct = rProduct * nums[i-1];
            result[i] = rProduct; 
        }
        rProduct = 1;   //resetting running product to 1
        
        for(int i = nums.length-2;i>=0;i--){
            rProduct = rProduct * nums[i+1];
            result[i] = result[i] * rProduct;
        }
        return result;
    }
}