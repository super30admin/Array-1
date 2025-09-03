// TC: O(n) SC: O(1)
// Ran on Leetcode : Yes
/*
Calculate running product, one containing product of all the element left to the element and one right of the element and multiply them both to get product of all the elements except  self.
*/
class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        result[0] = 1;

        int rp = 1;

        // Calc running profit
        for(int i = 1; i < nums.length; i++){
            rp = rp * nums[i - 1];
            result[i] = rp;
        }

        rp = 1;
        // Calc running product 
        for(int i = nums.length - 2; i >= 0; i--){
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }

        return result;
    }
}