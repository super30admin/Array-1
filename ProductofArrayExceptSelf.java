//TC: O(n) 
//SC: O(1) 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        if(nums == null || nums.length == 0) return result; 
        int n = nums.length;
        result[0] = 1;
        int runningSumProduct = 1;
        //left pass
        for(int i=1; i<nums.length;i++){
            runningSumProduct *= nums[i-1];
            result[i] = runningSumProduct;
        }     
        //right pass
        runningSumProduct = 1;
        for(int i=n-2; i>=0; i--){
            runningSumProduct = runningSumProduct*nums[i+1];
            result[i] = runningSumProduct* result[i];
        }
        
        return result;
    }
}
