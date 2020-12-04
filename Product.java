/** Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
* Time complexity O(N). Space complexity O(1)
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        if (nums == null || nums.length ==0)
            return left;
        left[0] = 1;
        for (int i = 1; i< nums.length; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }
        int temp = 1, rp = 1;
        left[nums.length-1] = left[nums.length-1]  * 1;
        for (int i = nums.length-1; i>=0; i--) {
            rp = rp * temp;
            left[i] = left[i] * rp;
            temp = nums[i];
        }
        return left;
    }
}
