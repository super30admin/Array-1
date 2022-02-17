# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1]*len(nums)
        
        for i in range(1,len(nums)):
            result[i] = nums[i-1]*result[i-1]
            
        s = 1
        for i in range(len(nums)-1,-1,-1):
            result[i] = s * result[i]
            s = s * nums[i]
        return result