"""
Intuition:  For each and every element, its product is equal to the product of the elemets to its right and to its left.
These left and right products can be stored in 2 arrays.
Further they can be reduced into a single array
#####################################################################
Time Complexity : O(2N)  N = number of elements
Space Complexity : O(1) 
#####################################################################
"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] * len(nums)
        runningProduct = 1
        for index in range(1, len(nums)):
            
            num = nums[index]
            output[index] = runningProduct  * nums[index -1]
            runningProduct = output[index]
        print(output)
        runningProduct = 1
        for index in range(len(nums)-2, -1, -1): 
            runningProduct = runningProduct *  nums[index + 1]

            output[index]  = output[index] * runningProduct
        print(output)
        return output
        
        
        