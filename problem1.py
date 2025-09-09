"""
Space Complexity: O(1)
Time Complexity: O(N)
"""


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        N = len(nums)

        lp = 1

        result = [0] * N 
        result[0] = 1

        for i in range(1, N): 
            lp = lp * nums[i-1]

            result[i] = lp

        rp = 1

        for i in range(N-2, -1, -1): 
            rp = rp * nums[i+1]

            result[i] = result[i] * rp

        return result
