// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes. I have already seen this problem.
// I have two pass. I set the each elemnt  as pivot and compute the product of all the elements in each side. 
//Then I find  product at  side to get the output .

// Your code here along with comments explaining your approach
class Problem1
{
    public static int[] productExceptIteself(int[] nums)
    {
        int [] result = new int[nums.length];
        int temp = 1, rp=1;
        //first pass
        for(int i = 0; i <nums.length;i++)
        {
            rp = temp*rp;
            result[i]=rp;
            temp=nums[i];
        }
        //second pass
        rp=1;temp=1;
        for(int i = nums.length-1;i>=0;i--)
        {
            rp = temp*rp;
            result[i]= result[i] * rp;
            temp=nums[i];
        }
        return result;
    }
    public static void main(String [] args)
    {
        int [] output = productExceptIteself(new int[]{1,2,3,4});
        for(int i = 0;i < output.length;i++)
        {
            System.out.println(output[i]);
        }
    }
    
}