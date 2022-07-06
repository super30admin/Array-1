# Time Complexity = O(n) + O(n) = O(n), one for iterating the nums array from 0 to n to find the left(result) array, the other for iterating the nums array to find rp and then multiplying to left array to get the final result.

# Space Complexity = O(1), since no new/extra data structure is used for storing any result, except for variable


class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        if nums == None or len(nums) == 0:
            return 0
        
        n = len(nums)
        result = [0] * n        # Result array will be of the same size as input
        rp = 1
        result[0] = 1           # Initialising for the first index, since there is no element to its left, hence rp will be taken = 1
        
        # Iterating for first making the left array of rp of all the left elements
        for i in range(1, n):
            rp = rp * nums[i - 1]
            result[i] = rp

        rp = 1                  # Re setting the value to compute right rp
        
        # Iterating to find right rp and simultaneously multiplying corresponding elements with their corresponding rp values
        for i in range(n-2, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = rp * result[i]
            
        
        return result
        