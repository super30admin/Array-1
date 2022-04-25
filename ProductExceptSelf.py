# Time complexity: O(n) where n is the number of nodes in the linked list.
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return []
        n = len(nums)
        rp = 1                      # Running Product
        result = [1] * n
        for i in range(1, n):       # result[0] = 1
            rp = rp * nums[i - 1]
            result[i] = rp          # Storing the left product of each element
        rp = 1
        for i in reversed(range(n - 1)):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp      # Right product * Left product
            
        return result    