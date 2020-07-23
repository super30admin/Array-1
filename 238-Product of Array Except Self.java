//Time complexity=O(N)
//Space complexity=O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Here we are directly adding the element in our result array. We are doing the running in both the directions one after another and are multiplying the values of both the running sum.
//eg. i/p: [1,2,3,4]
//1st running sum has value=[1,1,2,6]
//2nd running sum has value=[24,12,4,1]
//And we are multiplying both the running sum =[24,12,8,6].Here the operation are done in the same array instead of two different array.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result= new int[nums.length];
        int temp=1;
        for(int i=0;i<nums.length;i++)
        {
            result[i]=temp;
            temp*=nums[i];
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]*=temp;
            temp*=nums[i];
        }
        return result;
    }
}