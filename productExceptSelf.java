class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        int prod =1;
        for(int i=0;i<n;i++){
            res[i]=prod;
            prod = prod*nums[i];
        }
        prod =1;
        for(int i=n-1;i>=0;i--){
            res[i]=prod*res[i];
            prod = prod*nums[i];
        }

        return res;
    }
}