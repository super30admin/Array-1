class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1,2,3,4]
        //left pass - [1,1,2,6]
        //right pass -[24,12,4,1]
        //result - [24,12,8,6]

        int rp = 1;
        int n = nums.length;
        int result[] = new int[n];
        result[0] = 1;

        //forward pass...
        for(int i = 1 ; i < n ; i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        //backward pass...
        rp  = 1;
        for(int i = n-2 ; i >= 0 ; i-- ) {
            rp = rp * nums[i+1];
            result[i] = rp * result[i];
        }
        return result;
    }
}