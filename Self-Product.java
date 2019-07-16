  /*1. First Calculate the left product by maintaining the array in which ith element denotes the product of elements till i-1
    2. Similarly calculate the right product. To save space, directly update the left product array of step1.
    Time Complexity: O(n)
     Space Complexity: O(1) excluding the space that output array takes
*/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int temp =1;
        
        //product of left side
        for(int i =0; i<nums.length; i++)
        {
            result[i] = temp;
            temp*= nums[i];

        }
        
        temp = 1;
        //product of right side
        
        for(int i = nums.length-1; i>=0; i--)
        {
            result[i]*=temp;
            temp*=nums[i];
        }
        
        return result;
    }
}
