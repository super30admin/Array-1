import java.util.Arrays;

/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int product = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            product *= nums[j + 1];
            result[j] = result[j] * product;
        }

        return result;
    }
}

//Brute Force and second is divide methode
//public int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            int product=1;
//            for(int j=0;j<nums.length;j++){
//                if(i!=j)
//                    product*=nums[j];
//            }
//            result[i]=product;
//        }
//        return result;
//    }