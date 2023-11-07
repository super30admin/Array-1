class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int p = 1;
        result[0] = 1;
        for(int i=1 ; i<n; i++){
            result[i] = nums[i-1] * p;
            p = result[i];
        }
        p = 1;
        for(int i=n-2 ; i>=0 ; i--){
            p = p * nums[i+1];
            result[i] = p * result[i];
        }
        return result;

    }
}
