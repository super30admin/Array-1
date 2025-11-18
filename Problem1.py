class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Time complexity: O(n)
        # Space complexity: O(1) (excluding the output array)
        #idea is to calculate the product from left to right
        #and then from right to left
        #eg: [1,2,3,4] : rightprod = [1,1,2,6], leftprod = [24,12,4,1] 
        n = len(nums)
        result = [1]* n
        result[0] = 1
        rightprod = 1
        for i in range(n):
            result[i] = rightprod
            rightprod *= nums[i]
            

        # Pass 2: right product
        rightprod = 1
        for i in range(n - 1, -1, -1):
            result[i] *= rightprod
            rightprod *= nums[i]

        return result