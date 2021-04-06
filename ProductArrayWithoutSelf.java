/**Leetcode Question - 238 */
/**Algorithm
 * Take a running product = 1
 * Make a left array and start filling it with the running product and then update the rp with rp*nums[i]
 * Start from the end in the left array and fill with running product * left[i] and update running product with rp*nums[i];
 * Return the left array
 */
/**TC- O(N) 
 * SC- O(1)
 */
public class ProductArrayWithoutSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            //int[] result = new int[nums.length];
            int[] left = new int[nums.length];
            int rp =1;
            for(int i =0; i< nums.length; i++){
                left[i] = rp;
                rp = rp * nums[i];
            }
            rp =1;
            for(int i =nums.length-1; i>=0; i--){
                left[i] = rp*left[i];
                rp = rp * nums[i];
            }
            return left;
        }
    }
}
