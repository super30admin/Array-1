// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//We check for running product to the left elements of the array i.e 
// excluding the element itself. Then we do a second pass for checking running product
// to the right of the array. Multiplying both of these results yields us the desired output.

// Your code here along with comments explaining your approach
import java.util.Arrays;

public class Problem1 {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int runningProduct = 1;
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            runningProduct *= nums[i-1];
            result[i] = runningProduct;
        }
        runningProduct = 1;
        for(int i = nums.length-1; i >= 0; i--){
            if(i != nums.length-1)
                runningProduct*=nums[i+ 1];
            result[i] *= runningProduct;
        }
        
        return result;
        
        
        
    }
}
