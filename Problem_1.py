
"""
Time Complexity : O(n)
Space Complexity : O(1) as we are returning the array
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach
As we cannot multiply all the values and then divide, what we can do is, we can calculate the leftproduct and the
rightproduct for every number. That is, if we have left product and right product for every number, we can
multiply it to get product of whole array except for that number. We can solve this problem in 2 pass. In
first pass, we can put in the values of left product in an array. In second pass, we can start from last positon
and find right running product and keep on multiplying with values in the array which we return in the ned.
"""


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        arr = [1 for i in range(len(nums))]
        runmul = 1
        for i in range(len(nums)-1):
            arr[i+1] = arr[i]*nums[i]
        for i in range(len(nums)-1, -1, -1):
            arr[i] *= runmul
            runmul *= nums[i]
        return(arr)
