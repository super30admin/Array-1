/*
Leet Code Problem 238
Product of Array Except Self
Language Used : Java
Link: https://leetcode.com/problems/product-of-array-except-self/
Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
Memory Usage: 49.9 MB, less than 43.46% of Java online submissions for Product of Array Except Self.

Logic: One traversal fetches product from left and that is mulplied with product right
[1,2,3,4]
Left  : [1,1,2,6]
Right : [24,12,4,1]
Result is product of both

*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ResArr = new int[nums.length];
        int rp = 1;
        if(nums.length==0||nums==null) return ResArr;
        ResArr[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            rp=rp*nums[i-1];
            ResArr[i]=rp;
        }
        rp=1;
        ResArr[0]*=rp;
        for(int i=nums.length-2;i>=0;i--)
        {
            rp=rp*nums[i+1];
            ResArr[i]*=rp;
        }
        return ResArr;
    }
    
}