# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
#I use two auxillary arrays to store the left products and the right products respectively.
#I then update the final product array by multiplying the individual elements of the two auxillary arrays.
# Your code here along with comments explaining your approach

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Edge case of empty matrix or null matrix
        if nums == None or len(nums) == 0:
            return []
        
        n = len(nums)
        leftproduct = [0] * n
        rightproduct = [0] * n
        
        product = [0] * n
        
        x = 1
        # Populate the left products 
        for i in range(n):
            if i == 0:
                leftproduct[i] = x
                
            else:
                leftproduct[i] = x*nums[i-1]
                x = leftproduct[i]
                
        x = 1
        # Populate the right products 
        for i in range(n-1,-1,-1):
            if i == n-1:
                rightproduct[i] = x
                
            else:
                rightproduct[i] = x*nums[i+1]
                x = rightproduct[i]
        
        #Combine the left and right products into the final product array
        for i in range(n):
            product[i] = leftproduct[i] * rightproduct[i]
            
        return product