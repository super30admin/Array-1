class Solution(object):
    def productExceptSelf(self, nums):
        product = 1
        result = [1]*(len(nums))
        #print (result)
        for i in range(1,len(nums)):
            result[i] = result[i-1]*nums[i-1]
        for i in range(len(nums)-1,-1,-1):
            result[i] = result[i]*product
            product = product * nums[i]
        return (result)
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        