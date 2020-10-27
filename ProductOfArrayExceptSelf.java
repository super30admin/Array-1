// Time Complexity : O(n) where  n = size of the array
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*Approach
 * Idea is to calculate the product of left array and save hat the index and then multiply the product of left array to
 * product of right array
 * */


public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        //edge
        if(nums==null || nums.length==0) return new int[]{0};

        int ans[] = new int[nums.length];
        //left array product of 1st element set to 1
        ans[0] = 1;
        //left array pass
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        //right array pass
        int temp = 1;
        for(int i=nums.length-1; i>=0; i--){
            ans[i] = temp*ans[i];
            temp = temp*nums[i];
        }
        return ans;
    }
}
