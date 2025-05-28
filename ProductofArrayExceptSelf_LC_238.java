/*Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No

Approach 1 - Brute force  - Traverse every element in nested loop and disregard current element from product
 - O(N^2), SC- O(1)


Approach 2 - Prefix Sum
SC - O(1)
TC - O(N) */
public class ProductofArrayExceptSelf_LC_238 {
    public int[] productExceptSelf(int[] nums) {

        int output[] = new int[nums.length];
        output[0] =1;
        for(int i =1; i< nums.length; i++){
            output[i] = output[i-1] * nums[i-1];
        }
        int R = 1;
        for(int i = nums.length-1; i>=0;i--){
            output[i] = R * output[i];
            R = R* nums[i];
        }
        return output;
    }
}