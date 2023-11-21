//TC: O(2n) = O(n)
//SC: O(1) returned array does not increase space complexity
//## Problem 1
//
//        Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//        Example:
//
//        Input: [1,2,3,4]
//        Output: [24,12,8,6]
//        Note: Please solve it without division and in O(n).
//
//        Follow up:
//        Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
//

public class ProductExceptSelf {
    // Previously solved approach
//    public int[] productExceptSelf(int[] nums) {
//        int ans[] = new int[nums.length];
//        int pre = 1, post = 1;
//        for(int i=0;i<nums.length;i++){
//            ans[i] = pre;
//            pre*=nums[i];
//            System.out.println("after 1st Pass" +ans[i]);
//        }
//        for(int i=nums.length-1;i>=0;i--){
//            ans[i]*=post;
//            post*=nums[i];
//
//            System.out.println("after 2nd Pass" +ans[i]);
//        }
//
//        return ans;
//    }
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if(nums == null|| nums.length==0) return result;

        result[0] = 1;
        int rp = 1;
        for(int i = 1; i < nums.length; i++){
            rp = rp * nums[i-1]; // left pass i.e product of all the elements on the left
            result[i] = rp;
        }
        rp = 1;
        for(int i = nums.length-2; i>=0;i--){ // right pass
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}
