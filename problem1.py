 #Time Complexity :O(n)
 #Space Complexity :O(n)
 #Did this code successfully run on Leetcode :Yes
 #Any problem you faced while coding this :No

class Solution(object):
    def productExceptSelf(self, nums):
        
        l=len(nums)
        arr1=[0]*l
        arr1[0]=1
        rp=1
        for i in range(1,l):
            rp=rp*nums[i-1]
            arr1[i]=rp
        rp=1
        for j in range(l-2,-1,-1):
            rp=rp*nums[j+1] 
            arr1[j]=arr1[j]*rp
        return arr1
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        