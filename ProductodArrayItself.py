
"""
First, we do a left-to-right pass storing running products before each index.
Then, we do a right-to-left pass multiplying the existing results with right-side products.
This way, each element gets the product of all other elements without using division

"""

#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0]*len(nums)
        result[0] = 1
        lp = 1
        for i in range(1,len(nums)):  
            lp = lp * nums[i-1]
            result[i] = lp
        rp = 1
        for i in reversed(range(len(nums)-1)):
            rp = rp * nums[i+1]
            result[i]= result[i] * rp 
        return result