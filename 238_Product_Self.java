class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int [0];
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        
        //left product
        for(int i = 1; i<n; i++){
            result[i] = nums[i-1] * result[i-1];
        }
        
        //right product
        int right = 1;
        for(int i = n-1; i>=0;i--){
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    } 
}