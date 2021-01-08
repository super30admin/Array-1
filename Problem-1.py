#Time Complexity :o(n)
#Space Complexity :o(n)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if(len(nums)==0 or nums==None):
            return []
        
        rp=1
        rarr=[1]
        
        for i in range(1,len(nums)):
            rp=rp*nums[i-1]
            rarr.append(rp)
        
        rp=1
        
        for i in range(len(nums)-2,-1,-1):
            rp=rp*nums[i+1]
            rarr[i]=rarr[i]*rp
        return rarr
            
            
        
        
        
        