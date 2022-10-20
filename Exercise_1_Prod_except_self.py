class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        # time complexity: O(n)
        # space complexity: O(1)
        """
        n = len(nums)

        if nums == None or n == 0:
            return out

        # define the output array
        out = [1 for i in range(n)]

        # Initialise prefix prod to 1
        prefixProd = 1

        # Copy the prefixprod into output array and then update prefixproduct by multiplying it with current indexed number and iterate it from 1st element till last one.
        for i in range(n):
            out[i] = prefixProd
            prefixProd *= nums[i]
            
        # Initialise sufix prod to 1
        sufixProd = 1

        # Multiply the current sufixprod value to output array and then update sufixprod by multiplying it with current indexed number and iterate it from last element to first one.

        for i in range(n-1,-1,-1):
            out[i] *= sufixProd
            sufixProd *= nums[i]

        return out

        