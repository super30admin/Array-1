// Time Complexity : O(n)
// Space Complexity : O(1)
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return new int[]{};
        
        int result[] = new int [nums.length];
        int rp = 1;
        result[0] = rp;
        // left to right
        for(int i = 1 ; i < nums.length; i ++)
        {
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        // right to left
        for(int i = nums.length-2 ; i >=0; i--)
        {
            rp = rp * nums[i+1];
            result[i] = rp * result[i];
        }
        return result;
    }
}