# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        rp = 1
        result = [0]*n
        result[0] = 1

        for i in range(1, n):
            rp = rp * nums[i-1]
            result[i] = rp
        
        rp = 1
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = rp * result[i]
        
        return result

sc = Solution()
nums = [1,2,3,4]
print(sc.productExceptSelf(nums))