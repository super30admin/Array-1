"""
Time Complexity :O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode :yes


Approach
we are doing to loops for counting all the value and store it in a seperate list
first left to right, we skip the first and put a 1 at index 0 and we calculate the running sum 
one the second pas we calculate everything right to left leaving the last element plus while doing this we also multiple the number
with value of the pervious pass at the particular index 
"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp = 1
        n = len(nums)
        print(n)
        result = [0 for i in range(0,n)]
        result[0] = 1
        for i in range (1,n):
            rp *= nums[i-1]
            result[i] = rp
        rp = 1
        for i in range(n-2,-1,-1):
            rp *=  nums[i+1]
            result[i] *= rp
        return result
