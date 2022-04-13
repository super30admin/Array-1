// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*

Since we are not allowed to use division, we calculate product till that element
and product after that element and multiply the both to give the final answer.

*/

public class ProductOfArrayExceptSelf
{
    public static int[] productExceptSelf(int[] nums)
    {

        if(nums== null || nums.length == 0)
        {
            return new int[]{};
        }

        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        
        int ans[] = new int[n];

        pre[0]=1;
        post[n-1]=1;

        for(int i =1;i<n;i++)
        {
            pre[i]=pre[i-1]*nums[i-1];
        }

        for(int i = n-2;i>=0;i--)
        {
            post[i]=post[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++)
        {
            ans[i]=pre[i]*post[i];
        }

        return ans;


    }

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf(arr);

        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
}