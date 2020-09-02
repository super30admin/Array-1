# Leetcode problem link : https://leetcode.com/problems/product-of-array-except-self
# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
       Basic approach => Traverse from left to right first and store product of element to left for each index in an array. Traverse from right to left in next loop and save the product of elements to the right for each index in another array. Take product of the two arrays to get the answer array and return as response. This will take extra space O(n).
       
       Optimized approach => Traverse from left to right and take a temperay variable intialized to 1. Add temp variable to the array. Multiply temp variable to current nums (to maintain product to the left for next element). Add the new product to next index and again multiply current product with current nums.
       Start traversing from right to left and intialize the temp variable to 1 again. Multiply the current product with the currentindex of output array (output array will have product of elements to the right on first traversal).
       Multiply product with current nums ( to maintain product to the right for next element while traversing to the left).
      At the end output array will contain at each index the product of all elements except self
  
 '''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # edge case when nums is empty
        if not nums or len(nums) == 0:
            return [0]
        # initialize temp product variable
        product = 1
        # intialize output array
        output = [None] * len(nums)
        
        # traverse through the array for calculating the left product 
        for i,num in enumerate(nums):
            # add product calculated so far to the next index
            output[i] = product
            # multiply current num for the product to the left for next element
            product *= num
        # intialize temp variable again for product to the right
        product = 1
        # traverse from right to left
        for i in range(len(nums)-1,-1,-1):
            # multiplying with existing value of output array will give product of all elements to the right of current element with all elements to the left
            output[i] = output[i] * product
            # multiply current element for the next index
            product *= nums[i]
        # final result is multiplication of left and right computations
        return output
        