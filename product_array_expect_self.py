# Time Complexity : O(N)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        
        result = [0] * len(nums)
        result[0] = 1
        
        rp = 1
        # forward pass
        for i in range(1, length):
            rp = rp * nums[i-1]
            result[i] = rp
            
        rp = 1
        # backward pass
        for i in reversed(range(length - 1)):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp
            
        return result
