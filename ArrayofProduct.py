#Time Complexity: O(N)
#Space Complexity: O(N)

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        products_array = [1] * n

        # 1. Prefix product
        prefix = 1
        for i in range(n):
            products_array[i] = prefix
            prefix *= nums[i]

        # 2. Suffix product
        suffix = 1
        for i in range(n - 1, -1, -1):
            products_array[i] *= suffix
            suffix *= nums[i]

        return products_array
        
            



        
            