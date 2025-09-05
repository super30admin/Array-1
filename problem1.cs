public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int length= nums.Length;
        int[] leftArray = new int[length];
        leftArray[0]=1;
        for(var i=0;i<length-1;i++)
        {
            leftArray[i+1] = leftArray[i]*nums[i];
        }
        int[] rightArray = new int[length];
        rightArray[length-1]=1;
        for(var j=length-1;j>0;j--)
        {
            rightArray[j-1] = rightArray[j]*nums[j];
            Console.WriteLine(rightArray[j-1]);
        }
        int[] result = new int[length];
        for(var k=0;k<length;k++)
        {
            result[k] = leftArray[k]*rightArray[k];
        }
        return result;
        
    }
}