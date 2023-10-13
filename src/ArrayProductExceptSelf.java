// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class ArrayProductExceptSelf {
    public int[] arrayProductExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        result[0] = 1;
        //left sub array
        for(int i=1; i<nums.length; i++){
            product = product * nums[i-1];
            result[i] = product;
        }
        //right sub array
        product = 1;
        for(int i=nums.length-2; i>=0; i--){
            product = product * nums[i+1];
            result[i] = result[i] * product;
        }

        return result;

    }
}