class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] data = new int[nums.length];

        data[0] = 1;
        for(int i=1;i<nums.length;i++){
            data[i] = data[i-1]*nums[i-1];
        }

        int right = 1;
        for(int i=nums.length-1;i>=0;i--){
            data[i] = data[i]*right;
            right*=nums[i];
        }

        return data;
    }
}