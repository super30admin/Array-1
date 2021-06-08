from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return 0
        result = [0] * len(nums)
        rP = 1
        result[0] = 1
        for i in range(1, len(nums)):
            rP = rP * nums[i-1]
            result[i] = rP
        rP = 1
        for i in range(len(nums)-2,-1,-1):
            rP = rP * nums[i+1]
            result[i] = result[i] * rP
        return result

obj = Solution()
print(obj.productExceptSelf([1,2,3,4]))
print(obj.productExceptSelf([-1,1,0,-3,3]))

# Time Complexity : O(n)
# Space Complexity : O(1)