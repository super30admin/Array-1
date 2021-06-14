// Time Complexity :O(n)
// Space Complexity :O(1)

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        //null
        if(nums == null|| nums.length == 0) return result;
        int rp = 1; result[0] = 1;
        //forward pass
        for (int i = 1; i< n ; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        //backward pass
        for (int i = n - 2; i >=0 ; i--){
            rp = rp * nums[i+1];
            result[i] = result[i]* rp;
        }
         return result;   
        }
}
