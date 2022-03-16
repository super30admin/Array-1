# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# For every index we will calculate the products of all elements that came before it first and store it's prefix in that position.
# Then, we will start from the end of the array and calculate the product of all element s that come after it.
# During this traversal from back, we are not only calculating postfix but also multiplying it with the prefix which
# was calculated during first traversal, giving us the product of the array except that index. i.e it's prefix and postfix

from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[1]*(len(nums))
        
        prefix=1
        for i in range(len(nums)):
            res[i]=prefix
            prefix*=nums[i]
        
        postfix=1
        for i in range(len(nums)-1,-1,-1):
            res[i]*=postfix
            postfix*=nums[i]
        return res