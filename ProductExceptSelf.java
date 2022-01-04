// Time Complexity : O(n) where n is size of input array
// Space Complexity : O(1) not using any additional space
// Did this code successfully run on Leetcode : yes

public class ProductExceptSelf{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int [] res = productExceptSelf(nums);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        if(nums == null){
            return new int[0];
        }
        int len = nums.length;
        int[] leftP = new int[len];
        int rp = 1;
        leftP[0] = 1;
        
        for(int i=1; i<len; i++){
            rp = rp * nums[i-1];
            leftP[i] = rp;
        }
        rp = 1;
        
        for(int i=len - 2; i>=0; i--){
            rp = rp * nums[i+1];
            leftP[i] = leftP[i] * rp;
        }
        
        return leftP;
    }
}