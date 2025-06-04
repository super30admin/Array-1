//Time Complexiy : O(n)
//Space Complexity : O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp = 1;
        int[] result = new int[n];
        result[0] =1;
        for(int i=1; i < n; i++){
            rp= rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for(int i=n-2; i >=0;i--){
            rp= rp * nums[i+1];
            result[i] = rp * result[i];
        }
        return result;
    }
}
