//TC: O(n), n:length of nums[]
//SC: O(1), no auxilliary space

//Approach:
//1. We calculate the running product of array elements from left to right and then from right to left, where we exclude the current element. 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;
        int temp = 1;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }
        rp = 1; temp = 1;
        for(int i = nums.length-1; i >= 0; i--){
            rp = rp * temp;
            result[i] *= rp;
            temp = nums[i];
        }
        return result;
    }
}
