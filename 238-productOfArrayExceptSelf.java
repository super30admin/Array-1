/**LC-238
 * Time Complexity : O(N)
 * Space Complexity : O(1) since we are returning the result array...it is not considered as an auxiliary space
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 *
 Algorithm:
 1. Here we create a new array(left array) which stores the left running product for each input element.
 Running product = product of all numbers BEFORE that element.
 2. Then we create another array(right array) storing the right running product of each input element
 3. The resultant array has the product of left[i]*right[i]
 Here to save space: I have not created a right array. Instead the right running products are directly
 multiplied to the left array. This reduces space complexity from O(N) to O(1)
 */
package Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

            int rProd = 1, temp = 1;
            int[] result = new int[nums.length];
            for(int i = 0; i < nums.length; i++){

                rProd = rProd * temp;
                result[i] = rProd;
                temp = nums[i];
            }
            rProd = 1;
            temp = 1;
            for(int i = nums.length - 1; i >= 0; i--){
                rProd = rProd * temp;
                result[i] = result[i] * rProd;
                temp = nums[i];
            }
            return result;
        }

    public static void main(String args[]){

        int[] arr = new int[]{1,2,3,4};
        for(int i:productExceptSelf(arr)){
            System.out.print(i + " ");
        }

    }
}
