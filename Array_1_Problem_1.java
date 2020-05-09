//Time Complexity : O(n)
//Space Complexity: O(n)
//Run successfully on leetcode
//Problem : No problem




public class Array_1_Problem_1 {
    public static int[] productExceptSelf(int[] nums)
    {
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] output = new int[length];

        left[0] = 1;
        for(int i=1;i<length;i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }

        right[length-1] = 1;
        for(int i= length-2;i>=0;i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i= 0 ;i < output.length;i++)
        {
            output[i]= left[i] * right[i];
        }
        return output;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] ans = productExceptSelf(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
