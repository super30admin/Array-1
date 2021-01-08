// Time Complexity :O(n)
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Compute values except for nums[i] from left and then from right, and then multiply the left and right arrays at i
//and output the result.

// Your code here along with comments explaining your approach

public class ProductOfArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int N = nums.length;

            int[] leftProducts = new int[N];
            int[] rightProducts = new int[N];

            int[] outputArray = new int[N];

            leftProducts[0]=1;
            rightProducts[N-1]=1;

            //loop left to right and compute
            for (int i = 1; i < N; i++) {
                leftProducts[i] = nums[i-1] * leftProducts[i-1];
            }

            //loop from right to left and compute
            for(int j = N-2; j >= 0; j--){
                rightProducts[j] = nums[j+1] * rightProducts[j+1];
            }

            ////compute products by multiplying left and right arrays
            for (int y = 0; y < N; y++) {
                outputArray[y] = leftProducts[y] * rightProducts[y];
            }

            return outputArray;
        }
    }
}
