# APPROACH 1: BRUTE FORCE
# Time Complexity : O(n^2), n: length of nums
# Space Complexity : O(1), not considering the space for output array
# Did this code successfully run on Leetcode : NO (Time limit exceeded)
# Any problem you faced while coding this : None (Initially, just compared the numbers, but doesn't work for the duplicates)
#
#
# Your code here along with comments explaining your approach
# 1. For each element, go through the whole array
# 2. Take product of all those elements whose position is not same as the element
# 3. Save the product in the output array

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if nums is None:
            return -1
        
        result = []
        for main_pos in range(len(nums)):
            product = 1
            for other_pos in range(len(nums)):
                if main_pos != other_pos:
                    product *= nums[other_pos]
            result.append(product)
            
        return result
        
        

# APPROACH 2: Intermediate (Before class)  
# Time Complexity : O(n), n: length of nums
# Space Complexity : O(n), due to left_arr and right_arr
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. In left_arr, store the product of all elements before it (go from left to right) in one pass
# 2. In right_arr, store the product of all elements before it (go from right to left) in one pass 
# 3. In result, take the product of both left_arr and right_arr index-wise

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if nums is None:
            return -1
        
        left_arr, right_arr, result = [None] * len(nums), [None] * len(nums), [None] * len(nums)
        left_prod, right_prod = nums[0], nums[-1]
        
        for ind in range(1, len(nums)):
            left_arr[ind] = left_prod
            left_prod *= nums[ind]
            
        for ind in range(len(nums) - 2, -1, -1):
            right_arr[ind] = right_prod
            right_prod *= nums[ind]
        
        result[0] = right_arr[0]
        result[-1] = left_arr[-1]
        for ind in range(1, len(nums) - 1):
            result[ind] = left_arr[ind] * right_arr[ind]
            
        return result
        
        
        
 # APPROACH 3: OPTIMAL SOLUTION (Before class) -SAME APPROACH AS ABOVE BUT SAVING THE SPACE
# Time Complexity : O(n), n: lengh of nums
# Space Complexity : O(1), not considering the space of the ouput array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach 
# 1. In result, store the product of all elements before it (go from left to right) in one pass
# 2. In result, store the product of all elements before it (go from right to left) in one pass - start from the other end, multiply each element of the result with the previous
#     element.
# 3. Tke care of the first and last element (don't have left and right neighbors respectively).



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if nums is None:
            return -1
        
        result = [None] * len(nums)
        left_prod, right_prod = nums[0], nums[-1]
        
        for ind in range(1, len(nums)):
            result[ind] = left_prod
            left_prod *= nums[ind]
            
        for ind in range(len(nums) - 2, 0, -1):
            result[ind] *= right_prod
            right_prod *= nums[ind]
         
        result[0] = right_prod
        
        return result
        
