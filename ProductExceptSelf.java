//running product(rp) from left and right ; storing in same array
//Note: Forgot to calculate running product
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        // res[nums.length] = 1 * res[nums.length];
        int rp = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i+1];
            res[i] = res[i] * rp;

            //0,1,2,3
        }
        return res;
    }
}


//1,2,3,4
//1,1,2,6

//res[3] == 6 * 1 == 6
//res[2] == left[2] * nums[3]; == 8
//res[1] == left[1] * nums[2]*nums[1] ==  