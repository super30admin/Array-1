// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rightProduct = 1;
        int N = nums.length;
        int[] result = new int[nums.length];
        result[0]=1;

        for(var i=1;i<N;i++){
            result[i] = result[i-1]*nums[i-1];
        }

        for(var i=N-1;i>=0;i--){
            result[i] = result[i]*rightProduct;
            rightProduct*= nums[i];
        }

        return result;
    }
}
