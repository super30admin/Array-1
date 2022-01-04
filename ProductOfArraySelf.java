
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ProductOfArraySelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        productExceptSelf(nums);
    }

    // S.C - O(N)
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for(int i=1;i<nums.length;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int right = 1;

        for(int i=nums.length-1; i>=0; i--){
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }

    // S.C - 2*O(N)
//    public static int[] productExceptSelf(int[] nums) {
//        int[] left = new int[nums.length];  // S.C = O(N) + O(N)
//        int[] right = new int[nums.length];
//
//        left[0] = 1;
//
//        for(int i=1; i<nums.length; i++){
//            left[i] = nums[i-1] * left[i-1];
//        }
//
//        right[nums.length-1] = 1;
//
//        for(int i=nums.length-2; i>=0; i--){   // T.C - O(N)
//            right[i] = nums[i+1] * right[i+1];
//        }
//
//        for(int i=0; i<nums.length ; i++){
//            right[i] = left[i]*right[i];
//        }
//
//        return right;
//    }
}



