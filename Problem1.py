
"""

    Student : Shahreen Shahjahan Psyche
    Time Complexity : O(N^2)
    Space Complexity : O(1) [No use of Auxiliary memory space]

    Time limit exceeded in Leetcode.


"""

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # edge case
        if not nums:
            return []
        res = []
        # brute force solution. Iterating through the arrays in 2 loops and calculating the product for each index except the same indexes
        for i in range(len(nums)):
            temp = 1
            for j in range(len(nums)):
                if i == j:
                    continue
                temp = temp*nums[j]
            res.append(temp)
        
        return res
        
        
        