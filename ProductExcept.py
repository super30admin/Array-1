#TC: O(n)
#SC: O(1)
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        li=[0 for i in range(len(nums))]
        rp=1
        li[0]=1
        for i in range(1,len(nums)):
            rp=rp*nums[i-1]
            li[i]=rp
        
        rp=1
        for i in range(len(nums)-2,-1,-1):
            rp=rp*nums[i+1]
            li[i]=li[i]*rp
        
        return li
        