# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1]
        runningProd = 1
        for i in range(1,len(nums)):
            runningProd *= nums[i-1]
            res.append(runningProd)

        runningProd = 1
        for i in range(len(nums)-2,-1,-1):
            runningProd *= nums[i+1]
            res[i] *= runningProd

        return res 
        