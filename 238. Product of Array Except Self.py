#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result=[0]*len(nums)
        rp=nums[0]
        result[0]=1
        for i in range(1,len(nums)):
            result[i]=rp
            rp=rp*nums[i]
        rp=1
        for i in range(len(result)-1,0,-1):
            rp=rp*nums[i]
            result[i-1]=result[i-1]*rp
        return result
