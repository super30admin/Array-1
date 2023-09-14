// Time Complexity : O(n) as it is is looping through all elements in nums two times
// Space Complexity : O(1) as we are using the same array to store and return
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0 || nums == null){
            return new int[]{};
        }

        int[] res = new int[nums.length];
        res[0] = 1;
        int product = 1;

        for(int i = 1; i < nums.length; i++){
            product = product * nums[i-1];
            res[i] = product;
            //System.out.print(res[i] + " ");
        }

        product = 1;
        for(int i = nums.length-2; i >= 0; i--){
            product = product * nums[i+1];
            res[i] = res[i] * product;
        }

        return res;
    }
}
