class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        result[1] = nums[0];
        int rightProd = 1;
        for(int i=2;i<result.length;i++){
            result[i] = result[i-1]*nums[i-1];
        }
        
        for(int i=nums.length-1;i>=0;i--){
            result[i] = result[i]*rightProd;
            rightProd = rightProd*nums[i];
        }

        return result;
}
}