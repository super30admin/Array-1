class Solution {
    public int[] productExceptSelf(int[] nums) {
        int narr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j)
                {
                    mul=mul*nums[j];
                }
            }
            narr[i]=mul;
        }
        return narr;
    }
}
//TC O(n^2)
//SC O(n)
//Traverse the array and multiply the value other than the given index and store in the new array
//Leetcode: 16/17 accepted . One test case time limit exceeded
