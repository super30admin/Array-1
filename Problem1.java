class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        if(nums == null || n == 0)
            return result;
        
        int rp=1; result[0] = 1;
        //left pass
        for(int i=1; i<n; i++){
            rp *= nums[i-1];
            result[i] = rp;
        }
        
        //right pass
        rp=1;
        for(int i=n-2; i>=0; i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}
//time - O(N)
//space - O(1)