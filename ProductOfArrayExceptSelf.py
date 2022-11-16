#Time Complexity: O(n)
#Space Complexity: O(n)
#Successfully ran on leetcode

class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        leftSum = []
        leftSum.append(1)
        n = len(nums)
        for i in range(1,n):
            leftSum.append(nums[i-1]*leftSum[i-1])
        rp = 1
        for i in range(n-2,-1,-1):
            rp*=nums[i+1]
            leftSum[i]*=rp
        return leftSum