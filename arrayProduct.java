//Time complexity O(N)
//Space complexity O(1) - I am not using any extra space except the ouput array
//Succefully run in leetcode


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,temp;
        int [] result = new int [nums.length];
        temp=1;//intialising the left running sum temp = 1;
        for(i=0;i<nums.length;i++)
        {
            result[i] = temp;//placing the left running sum temp at every index;
            temp= temp*nums[i];//update the running sum temp by multiplying the val at cuurent index for next iteration.
        }
        temp=1;//right running sum temp=1;
        for(i=nums.length-1;i>=0;i--)
        {
            result[i] = temp*result[i];//multiply the right running sum with the exisiting value(left rsum) for the total product of left and right elements at an index.
            temp= temp*nums[i];//update the running sum temp by multiplying the val at cuurent index for next iteration
        }
        return result;//resturn the reuslt array
    }
}