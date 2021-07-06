#https://leetcode.com/problems/product-of-array-except-self/submissions/
#time-o(n)
#space-o(1)
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        L=[0]*len(nums)
        #R=[0]*len(nums)
        #answer=[0]*len(nums)
        
        L[0]=1
        for i in range(1,len(nums)):
            L[i]=nums[i-1]*L[i-1]
        R=1
        for i in range(len(nums)-2,-1,-1):
            R*=nums[i+1]
            L[i]*=R
            
        return L
            