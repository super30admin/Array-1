# Time Complexity: O(N)
# Space Complexity: O(N)
# Leetcode all test cases passed: Yes
# Any Difficulties: No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p = 1
        n = len(nums)
        output = []
        for i in range(0,n):            # Left product
            output.append(p)
            p = p * nums[i]
        p = 1
        for i in range(n-1,-1,-1):      # Right Product in the same array
            output[i] = output[i] * p
            p = p * nums[i]
        return output
