package src;

public class ProductExceptSelf {
    public static void main(String[] args) {
        ProductExceptSelf pes = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        int[] ans = pes.productExceptSelf(nums);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
    public int[] productExceptSelf(int[] nums) {

        int[] out = new int[nums.length];
        out[0] = 1;
        int suff = 1;

        for(int i=1; i<out.length; i++)
        {
            out[i] = out[i-1]*nums[i-1];
        }

        for(int i=nums.length-1; i>0; i--)
        {
            suff *= nums[i];
            out[i-1] = out[i-1]*suff;
        }
        return out;
    }
}
