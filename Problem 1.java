// 238. Product of Array Except Self - Medium
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Get multiplication of all the array values, then replace each array value with the ( multiple / individual number)


class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0){
            return new int[0];
        }
        int mul = 1;
        int mulWithOutZero = 1;
        int moreThanOne = 0;
        for(int i = 0; i< nums.length; i++){
            if( nums[i] != 0){
                mulWithOutZero = mulWithOutZero * nums[i];
            }
            if( nums[i] == 0){
                moreThanOne++;
            }
            mul = mul * nums[i];
        }
        for(int i = 0; i< nums.length; i++){
            if (nums[i] == 0 && moreThanOne <= 1){
                nums [i] = mulWithOutZero;
            }else if (nums[i] == 0 && moreThanOne > 1){
                nums [i] = 0;
            }
            else{
                nums[i] = mul / nums[i];
            }
        }
        return nums;
    }
}