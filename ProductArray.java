// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Had little difficulty in finding right pass logic

class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return new int[0];

        int[] arr = new int[nums.length];

        arr[0] = 1;

        //left pass
        for(int i=1;i<nums.length;i++){
            arr[i] = arr[i-1] * nums[i-1];
        }

        //right pass
        int rp = 1;
        for(int i=nums.length-2;i>=0;i--){
            rp = rp * nums[i+1];
            arr[i] = arr[i] * rp;
        }

        return arr;

    }
}