//time - O(n)
//space - O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0) return nums;
        int[] result = new int[nums.length];
        int rp = 1;

        result[0] = 1;
        for(int i=1; i<result.length; i++){
            rp *= nums[i-1];
            result[i] = rp;
        }

        rp = 1;
        for(int i=result.length-2; i>=0; i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}