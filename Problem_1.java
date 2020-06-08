// Time complexity = O(n)
// Space complexity - O(1)
// Applied running product from left side. Then applied running prouct from right side and updated the result array.


class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length] ;
        int rp = 1; int temp = 1;
        
        // from left
        for(int i =0;i<nums.length;i++){
            rp *= temp;
            result[i] = rp;
            temp = nums[i];
        }
        
        // from right
        rp = temp = 1;
        for(int i = nums.length-1;i>=0;i--){
            rp *= temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        
        return result;
    }
}
