# Time Complexity : O(n)
# Space Complexity : O(2n)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        leftProduct = [0]*n
        RightProduct = [0]*n
        Result = [0]*n
        leftProduct[0] = 1
        RightProduct[n-1] = 1
        for i in range(1,n):
            leftProduct[i]=leftProduct[i-1]*nums[i-1]
        for i in range(n-2,-1,-1):
            RightProduct[i] = RightProduct[i+1]*nums[i+1]
        for i in range(n):
            Result[i] = leftProduct[i]*RightProduct[i]
        return Result
        
        