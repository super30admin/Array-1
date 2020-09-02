# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# first iterate through the array and generate a product from the left hand side of the element
# next, generate the product from right hand side and keep multiplying in-place with the product obtained from left hand side array 

# // Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if not nums or len(nums)==0:
            return [0]
        
        res = [None]*len(nums)
        prod = 1
        
        # calculate product from left side
        for x in range(len(nums)):
            res[x] = prod
            prod = prod * nums[x]
            
        # calculate product from right and multiply with that of existing product from left
        prod=1
        for x in range(len(nums)-1, -1, -1):
            res[x] *= prod
            prod *= nums[x]
            
        return res
            