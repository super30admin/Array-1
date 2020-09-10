//time complexity O(2n) => O(n)
//space complexity O(1)
//APPROACH: find the left running product and store them in the result array
//then find the right running product and update the result array by multiplying current values with right running product. This will ensure left and right running products are multiplied but not the number itself

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] result = new int[nums.length];
        //left pass
        int lTemp = 1;
        int lRp = 1;
        for(int i = 0; i < nums.length; i++){
            lRp = lRp * lTemp;
            result[i] = lRp;
            lTemp = nums[i];
        }
        //right pass
        int rTemp = 1;
        int rp = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            rp = rp * rTemp;
            result[i] *= rp;
            rTemp = nums[i];
        }
        return result;
    }
}
