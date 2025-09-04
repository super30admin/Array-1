# Time Complexity : O(N)
# Space Complexity : O(N)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using two arrays to keep track of the product of all elements to the left and right of the current index. 
# I am running a for loop to fill the left array with the product of all elements to the left of the current index. 
# Then I am using a variable to keep track of the product of all elements to the right of the current index and filling the 
# answer array with the product of the left and right arrays.

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [0]*len(nums)
        right = 1
        left[0] = 1
        ans = [0]*len(nums)
        for i in range(1,len(nums)):
            left[i] = left[i - 1] * nums[i - 1]
        for i in range(len(nums)-1,-1,-1):
            ans[i] = left[i] * right
            right *= nums[i]
        return ans


        