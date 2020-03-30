// Time Complexity : O(n)
// Space Complexity : O(2n)=> O(n)
// Did this code successfully run on Leetcode : Yes. I have already seen this problem.
// I have two pass. I set the each elemnt  as pivot and compute the product of all the elements in each side. 
//Then I find  product at  side to get the output .

// Your code here along with comments explaining your approach
class Problem1
{
    public static int[] productExceptIteself(int[] nums)
    {
        int [] arr1 = new int [nums.length];
        int [] arr2 = new int [nums.length];
        
        arr1[0]=1;
        arr2[nums.length-1]=1;
        
        // first pass
        int i = 1;
        while(i <nums.length)
        {
            arr1[i]= nums[i-1]*arr1[i-1];
            i++;
        }
        i = nums.length-2;
        //second pass
        while(i >=0)
        {
            arr2[i]=nums[i+1]*arr2[i+1];
            i--;
        }
        for(int j = 0 ; j < nums.length;j++)
        {
            arr1[j]=arr1[j]*arr2[j];
        }
        return arr1;
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