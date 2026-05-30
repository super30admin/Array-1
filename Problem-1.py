# Time Complexity : O(2n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
"""1. Optimizing brute force approach of O(n^2) buy calculating running product from left to right and right to left
2. In this solution the time complexity O(n) can be achived by using extra array of space O(n)
3. we use one for loop to find the running product from left to right and store in the res[] array then multiply this array with running product from right to left"""

# Your code here along with comments explaining your approach
class Solution(object):
    def productExceptSelf(self, nums):
        #initializing a result array with 1's 
        res=[1]*len(nums)
        #variable to count running product at each iteration
        #rp will store the running products of integers in the array so far
        rp=1
        #first for loop to calculate a running product of the given array from left to right
        for i in range(1,len(nums)):
            rp=rp*nums[i-1]
            res[i]=rp
        print(res)
        #now resetting the running product variable for right running product
        rp=1
        #iterating from right to left to calculate running product from teh right 
        for j in range(len(nums)-2,-1,-1):
            rp=rp*nums[j+1]
            #product of current running product with the number in resultant i.e left running product
            res[j]=rp*res[j]
        return res