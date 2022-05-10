// Time Complexity : O(N) N=array length
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class ProducOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        leftSum[0] = 1;
        int[] rightSum = new int[len];
        rightSum[len-1] = 1;

        for(int i=1; i<len; i++){
            leftSum[i] = nums[i-1]* leftSum[i-1];
        }

        for(int i=len-2; i>=0; i--){
            rightSum[i] = nums[i+1]* rightSum[i+1];
        }

        int[] output = new int[len];

        for(int i=0; i<len; i++) {
            output[i] = leftSum[i]*rightSum[i];
        }
        return output;
    }
}
