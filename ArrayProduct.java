// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
1. Mataining a left running product and a right running product for each index and then multiplying them to get the product except the number itself
2. left running product for an index = last running product* (element before it)
3.  right running product for an index = last running product* (element after it)
*/

public class ArrayProduct {
    public static int[] productExceptSelf(int[] nums) {
        int leftP[] = new int[nums.length];
        leftP[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            leftP[i]=leftP[i-1]*nums[i-1];

        }
        int rightProduct=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            
            leftP[i]*=rightProduct;
            rightProduct*=nums[i];

        }


        return leftP;
    }
    public static void main(String[] args)
    {
       int[] nums = {1,2,3,4};
       int[] output= productExceptSelf(nums);
       for(int i=0;i<nums.length;i++)
       {
           System.out.println(output[i]);

       }
    }
}