class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int ptr = 1;
        for (int i =0;i<nums.length;i++){
            if (i==0){
                left[i] = 1;
            }
            else{
                left[i] = left[i-1]*nums[i-1];
            }
        }
        for (int i =nums.length-1;i>=0;i--){
            left[i] = left[i] * ptr;
            ptr = nums[i] * ptr;
        }
    return left;   
    }
}