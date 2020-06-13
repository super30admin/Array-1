class Solution {
    public int[] productExceptSelf(int[] nums) {
    //edge case
        if(nums== null || nums.length == 0 ) return new int[0];
        int rp = 1; int temp = 1;
        int n = nums.length;
        int[] result = new int [n];
        //left product
        for (int i = 0;i < n ; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }
        //right product
        rp = 1;temp = 1;
        for(int i= n-1 ; i >= 0 ; i--){
            rp = rp * temp;
            result[i] = result[i] * rp; //existing with right product to get result
            temp = nums[i];
        }
        return result;
    }
}

/*
Time complexity : O(n) (each value in array is touched)
Space complexity : O(n) (result array to store)
*/
