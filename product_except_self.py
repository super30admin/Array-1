# Time Complexity : O(n)
# Space complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : It was hard to come up with prefix and suffix product solution.

# Your code here along with comments explaining your approach
# Build the result array by calculating the cumulative product of everything to the left of each index, starting with a base of 1 because the first element has no left neighbors.
# Loop backward and keep a running product of everything to the right, multiplying suffix directly into the prefix values in the result array.

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        rp = 1
        n = len(nums)
        result = [0] * n
        
        #forward pass left side product
        result[0] = 1
        for i in range(1,n):
            rp = rp * nums[i-1]
            result[i] = rp
        
        #backward pass ride product
        rp = 1
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = result[i] * rp 
        return result
