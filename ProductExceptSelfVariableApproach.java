// Time Complexity :O(N)
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


import java.util.Arrays;

public class ProductExceptSelfVariableApproach {
    public static int[] getProductExceptSelf(int [] nums)
    {
        if(nums == null || nums.length==0)
            return new int[0];

        int[] result = new int[nums.length];

        //calculate left product.using result array to calculate left product
        result[0]=1;
        for(int i =1; i < nums.length; i++)
            result[i] = result[i-1] * nums[i-1];

         //Right variable
        int right = 1;
        for( int i = nums.length-1; i >=0; i--) {
            //using same result array where we have the left product calculated to be used to calculate the product of left and right
            result[i] = result[i] * right;
            //Before iterating the next, calculating the new right
            right = right * nums[i];
        }
        return result;
    }

    public static void main(String [] args)
    {
        int [] arr ={1,2,3,4,5};
        System.out.println(Arrays.toString(getProductExceptSelf(arr)));;
    }
}