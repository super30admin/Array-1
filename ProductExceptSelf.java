// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: storing product of left subarray and right subarray

class ProductExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rp = 1;
        result[0] = 1;
        for(int i=1; i<result.length; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp =1;
        for(int i=nums.length-2; i>=0; i--){
            rp = rp * nums[i +1];
            result[i] = result[i]*rp;
        }
        return result;
    }
}