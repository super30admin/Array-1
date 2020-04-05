
/**
*  Time Complexity - O(2n) ~ O(n)
*  Space Complexity - O(n)
*/


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int num1[] = new int[nums.length];


        num1[0] = 1;
        int temp = 1;
        for(int i = 1 ; i < nums.length; i++){
            num1[i] = nums[i-1] * num1[i-1];
        }

        for(int i = nums.length-1 ; i >=0; i--){

            int value = nums[i];
            nums[i] = num1[i] * temp;
            temp = value * temp;

        }


        return nums;
    }
}