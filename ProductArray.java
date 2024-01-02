import java.util.Arrays;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class ProductArray {
    
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int rp = 1;
        int n = nums.length;
        result[0] = 1;
        for(int i=1; i< nums.length; i++)
        {
            rp = rp*nums[i-1];
            result[i] = rp; 
        }
        rp =1;
         for(int i=n-2; i >=0; i--)
        {
            rp = rp*nums[i+1];
          
            result[i] = result[i]*rp; 
        }
        return result;
    }

    public static void main(String[] args)
    {
        ProductArray p = new ProductArray();
        int [] productArray = p.productExceptSelf(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(productArray));
    }
}
