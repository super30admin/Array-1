// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
here we are trying to map left product of an index and right product of an index.
Result array has the left product of numbers
nums array has right product of numbers
at a particular index o/p is nums[i+1] * result[i-1];
 */
// Your code here along with comments explaining your approach
public class ProductOfAllNumbersExceptSelf {
        public int[] productExceptSelf(int[] nums) {
            int result[] = new int[nums.length];
            result[0] = nums[0];
            for(int i=1; i<nums.length; i++) {
                result[i] = result[i-1]* nums[i];
                // System.out.println(result[i]);
            }

            for(int i=nums.length-2; i>=0; i--) {
                nums[i] = nums[i] * nums[i+1];
                // System.out.println(nums[i]);
            }
            nums[0] = nums[1];

            for(int i=1; i+1<nums.length; i++) {
                nums[i] = nums[i+1] * result[i-1];
                // System.out.println(nums[i]);
            }
            nums[nums.length-1] = result[nums.length-2];
            return nums;
        }
}
