'''
Time Complexity - O(n)
Space Complexity - O(n)
'''


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        r_prod = 1
        result = [1] * n
        for i in range(1, n):
            r_prod *= nums[i-1]
            result[i] = r_prod
        r_prod = 1
        for i in range(n-2, -1, -1):
            r_prod *= nums[i+1]
            result[i] *= r_prod
        return result
