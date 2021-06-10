"""
Approach:

At each element, find the product of all elements to its left, then all elements to its right.

"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Approach 1: using 2 arrays
        """n = len(nums)
        left = [1]*(n)
        right = [1]*(n)
        result = [1]*n
        for i in range(1, n):
            left[i] = left[i-1] * nums[i-1]

        for j in range(n-2, -1, -1):
            right[j] = right[j+1] * nums[j+1]

        for k in range(n):
            result[k] =  left[k] * right[k]
        return result"""

        # Apporach 2: using 1 array
        n = len(nums)
        out = [1] * n
        r_pro = 1
        for i in range(n):
            out[i] = out[i] * r_pro
            r_pro = r_pro * nums[i]
        r_pro = 1
        for i in range(n - 1, -1, -1):
            out[i] = out[i] * r_pro
            r_pro = r_pro * nums[i]
        return out


"""
TC: O(n)
SC: O(1)
"""