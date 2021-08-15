//Time complexity: O(n), where n is the number of elements in the given array
//space complexity: O(1), only expected result array is used
//running on leetcode: yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums== null || nums.length==0)
        {
            return new int[] {};
        }
        //result array
        int[] result = new int[nums.length];
        //initialize the running product as 1
        int rp=1;
        //left side of the result array
        //assign the first element as 1, as there is no element on left of that
        result[0]=1;
        //populate result array with left pass
        for(int i=1; i<nums.length; i++)
        {
            result[i]=rp*nums[i-1];
            rp = rp*nums[i-1];
        }
        //initialize rp to 1 again for the right pass
        rp=1;
        //since last element has no right neighbor, value of last index does not change in the right pass. so start from the last second element
        for (int i=nums.length-2; i>=0; i--)
        {
            result[i]=rp*result[i]*nums[i+1];
            rp=rp*nums[i+1];
        }
        return result;
    }
}
