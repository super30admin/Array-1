import java.util.Arrays;

class arrayExceptItself{
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length ==0) return new int[] {};
        
        int[] res = new int[nums.length];
        int rp = 1;
        res[0] = 1;

        for(int i=1;i<nums.length;i++){
            rp = rp * nums[i-1];
            res[i] = rp;
        }
        
        rp = 1;
        for(int i = nums.length-2;i>=0;i--){
            rp = rp * nums[i+1];
            res[i] = rp * res[i];
        }
        return res;
    }

    public static void main(String[] args) {
        arrayExceptItself ae = new arrayExceptItself();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(ae.productExceptSelf(nums)));
    }
}