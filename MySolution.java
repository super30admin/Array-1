class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] leftArr = new int[nums.length];
        leftArr[0] = 1;
        int rp = 1;
        for (int i = 1; i < leftArr.length; i++){
            rp = rp * nums[i-1];
            leftArr[i] = rp;
        }

        rp = 1;
        for (int i = leftArr.length-2; i >= 0; i--){
            rp = rp * nums[i+1];
            leftArr[i] = rp * leftArr[i];
        }
        return leftArr;
    }
}