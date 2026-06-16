#TC = O(n) since we are using only one array to store leftpass and then reusing the same array to generate the rightpass and the solution
#SC = O(1)
#Did this code successfully run on Leetcode : Yes
#approach:First, we do a left-to-right pass storing running products before each index.
#Then, we do a right-to-left pass multiplying the existing results with right-side products.
#This way, each element gets the product of all other elements without using division.

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0]*n

        rp = 1
        result [0]=1 #for leftpass we need to multiply the left number of i so for index 0 the left is empty thats why we initialize with 1
        #for left pass
        for i in range(1,n):
            rp = rp* nums[i-1]
            result[i]=rp
        #right pass but to decrease the SC we will be storing it in the left pass itself
        rp = 1          #we again initilaize rp to 1
        for i in range (n-2,-1,-1):
            rp = rp * nums[i+1]
            result[i]=result[i]*rp
        return result