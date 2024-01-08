/*
* Approach:
*  1. Take resultant array and construct suffix Prod in it.
* 
*  2. Take running prod and 
        multiply the running prod with suffixProd[i+1] in resultant array. 
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/
public class ProductofArray {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[nums.length - 1] = nums[nums.length - 1];

        for (int index = nums.length - 2; index >= 0; index--)
            result[index] = nums[index] * result[index + 1];

        int runningProd = 1;

        for (int index = 0; index < nums.length; index++) {
            if (index + 1 < nums.length)
                result[index] = runningProd * result[index + 1];
            else
                result[index] = runningProd;
            runningProd *= nums[index];
        }

        return result;
    }
}
