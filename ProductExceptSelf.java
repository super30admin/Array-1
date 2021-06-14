// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int temp = 1;
        //left product
        for(int i = 0;i < nums.length - 1;i++){
            temp = temp * nums[i];
            result[i + 1] = temp;
        }
        temp = 1;
        //calculate right product and multiply with the left product calculated
        for(int i = nums.length - 2;i >= 0;i--){
            temp = temp * nums[i + 1];
            result[i] = result[i] * temp;
        }
        return result;
    }
}