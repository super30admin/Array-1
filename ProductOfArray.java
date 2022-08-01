class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int rsum = 1;
        for(int i=1;i<nums.length;i++){
            rsum *= nums[i-1] ;
            result[i] = rsum;
        }
        rsum=1;
        for(int i=nums.length-2;i>=0;i--){
            rsum *= nums[i+1] ;
            result[i] *= rsum;
        }
        return result;
    }
}
