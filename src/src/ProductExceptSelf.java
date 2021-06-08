public class ProductExceptSelf {


    /*
    TC : O(n) where n is the length of the input array
    SC :O(n)
     Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No
     */

    /*
     We create two arrays where we store  the product of all the numbers to the left and all the numbers to the right of the index.
     */
    class Solution {
        public int[] productExceptSelf(int[] nums) {

            int length = nums.length;

            int[] L = new int[length];
            int[] R = new int[length];


            int[] answer = new int[length];

            // L[i] contains the product of all the elements to the left
            // for the element at index '0', there are no elements to the left,
            // so L[0] would be 1
            // L[i - 1] already contains the product of elements to the left of element at index i - 1
            // multiplying it with nums[i - 1] would give the product of all elements to the left of index i
            L[0] = 1;
            for (int i = 1; i < length; i++) {


                L[i] = nums[i - 1] * L[i - 1];
            }

            // R[i] contains the product of all the elements to the right
            // for the element at index length - 1, there are no elements to the right, so the R[length - 1] would be 1
            // R[i + 1] already contains the product of elements to the right of element at index i + 1
            //multiplying it with nums[i + 1] would give the product of all elements to the right of index i
            R[length - 1] = 1;
            for (int i = length - 2; i >= 0; i--) {


                R[i] = nums[i + 1] * R[i + 1];
            }


            for (int i = 0; i < length; i++) {
                // For the first element, R[i] would be product except self
                // For the last element of the array, product except self would be L[i]
                // Else, multiple product of all elements to the left and to the right
                answer[i] = L[i] * R[i];
            }

            return answer;
        }

        /*
    TC : O(n) where n is the length of the input array
    SC :O(n)
     Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No
     */

        /**
         * This approach uses the same logic just that we are storing the answer in the output array.
         * @param nums
         * @return
         */
        public int[] productExceptSelf_approach_two(int[] nums) {

            int[] output = new int[nums.length];
            int left =1;
            int right=1;

            for(int i=0; i<nums.length;i++)
            {
                output[i] = left;
                left *= nums[i];
            }

            for(int j=nums.length-1;j>=0;j--)
            {
                output[j] *= right;
                right *= nums[j];
            }

            return output;

        }
    }
}
