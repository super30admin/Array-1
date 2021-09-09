# Time COmplexity: O(n)
# Space Complexity: O(1)
# Is this problem on leetcode: Yes
# Approach to solve this problem:

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)                       # result is initailized list
        
        prefix = 1
        
        
        for i in range(len(nums)):                    # We are taking left product and right product
            result[i] = prefix
            prefix = prefix * nums[i]
        
        postfix = 1
        for i in range(len(nums)-1,-1,-1):
            result[i] = result[i] * postfix
            postfix = postfix * nums[i]
        return result
        