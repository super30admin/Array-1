// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
/*
So we create left array and store the multiplication of elements from left
We store mulitiplication of right element with left array in the same left array
* */

// Your code here along with comments explaining your approach

class SolutionOne {
    public int[] productExceptSelf(int[] nums) {

        if(nums==null||nums.length==0)
            return nums;

        int leftArray[]=new int[nums.length];
        int rightArray[]=new int[nums.length];
        int temp=1,rp=1;

        for(int i=0;i<nums.length;i++)
        {
            rp=rp*temp;
            leftArray[i]=rp;
            temp=nums[i];
        }
        rp=1;
        temp=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            rp=rp*temp;
            leftArray[i]=leftArray[i]*rp;
            System.out.println(leftArray[i]);
            temp=nums[i];
        }

        return leftArray;
    }
}