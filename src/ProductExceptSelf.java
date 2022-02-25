// Time Complexity:           O(n)
// Space Complexity:          O(n)
// where n is length of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

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
        out[0] = 1;                                             // first element is set to 1 which will help in multiplication
        int suff = 1;                                           // declaring suffix

        for(int i=1; i<out.length; i++)
        {
            out[i] = out[i-1]*nums[i-1];                        // getting prefixes in "out" array
        }

        for(int i=nums.length-1; i>0; i--)
        {
            suff *= nums[i];                                    // updating suffix
            out[i-1] = out[i-1]*suff;                           // updating "out" array
        }
        return out;
    }
}
