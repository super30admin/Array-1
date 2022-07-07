class Solution {
    public int[] productExceptSelf(int[] nums) {
        //if(nums.length==0) return 0;
        int n = nums.length;
        int result[] = new int[n];
        int rsum=1;
        
        result[0] = 1;
        
        for(int i=1;i<n;i++){
            rsum = rsum*nums[i-1];
            result[i] = rsum;
        }
        rsum=1;
        for(int i=n-2;i>=0;i--){
            rsum = rsum*nums[i+1];
            result[i] = rsum*result[i];
        }
        return result;
    }
}