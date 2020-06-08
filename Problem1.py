"""
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

"""

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        """
        BRUTE FORCE (TLE)
        Time Complexity: o(n^2)
        space complexity: o(1)

        """
        """
        res = []
        for i in range(len(nums)): #iterating over all the values 
            prod = 1
            for j in range(len(nums)): #calculating product 
                if i != j: # if i==j we dont multiply it to the product
                    prod = prod * nums[j]
            
            res.append(prod)
                
        return res
        """
        
        """
        Left and right product arrays (and single array)
        Time complexity : o(n)
        Space complexity : o(n) for 2 arrays
                            o(1) for single array as it is the result
        """
        
        prod = 1
        
        left = [0] * len(nums)
        
        for i in range(len(nums)):
            left[i] = prod #storing the left running product for each element
            prod = prod * nums[i]
            
        #print left
        
        #right = [0] * len(nums) #to hold right products
        prod = 1
        for i in range(len(nums)-1,-1,-1):
            left[i] *= prod #multiplying the right product and 
            #right[i] = prod
            prod = prod * nums[i]
            
        return left# [r * l for r,l in zip(right, left)]