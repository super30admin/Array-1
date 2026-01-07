class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rp=1;
        int n= nums.length;
        // forward pass left to right
        int [] result = new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            result[i]=rp;
        }

        //backward pass right to left
        rp=1;
         for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i]=rp*result[i];
         }
         return result;
    }
}