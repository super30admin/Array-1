# Time Complexity: O(N), N is the number of elements in nums list
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

# I have used a array to store the product results from left
# and modified the same array to store the product result from right and product result from left


from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        final = [None] * len(nums)

        running_product = 1
        for index in range(len(nums)):
            if index != 0:
                running_product *= nums[index - 1]

            final[index] = running_product
        
        running_product = 1

        for index in range(len(nums) - 1, -1, -1):
            if index != len(nums) - 1:
                running_product *= nums[index + 1]
            
            final[index] = final[index] * running_product
        
        return final

            
                