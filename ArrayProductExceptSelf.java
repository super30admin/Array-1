//time Complexity: O(N)
//Space Complexity O(1) Optimized part , for basic we can use left and right separate array which will take O(n) space as well
//Leetcode: yes.
public class ArrayProductExceptSelf {
        public int[] productExceptSelf(int[] nums) {

            if (nums == null || nums.length == 0) {
                return new int[] {};
            }

            int len = nums.length;
            int[] result = new int[len];

            result[0] = 1;
            //calculate the product of all the numbers to the left of the current index.
            for (int i = 1; i < len; i++) {
                result[i] = result[i-1] * nums[i-1];
            }
            //calculate the product of all the numbers to the right of the current index
            //and then combine it with the previous calculated product to give us left * right
            int r = 1;
            for (int i = len-1; i >= 0; i--) {
                result[i] = result[i] * r;
                r  = r * nums[i];
            }

            return result;
        }
}
