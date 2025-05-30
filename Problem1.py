class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result_array = [1] * len(nums)
        n = len(result_array)-1
        rp = 1
        for i in range(0,n):
            rp = rp*nums[i]
            result_array[i+1] = rp
        
        rp = 1
        for j in range(n,0,-1):
            rp *= nums[j]
            result_array[j-1] = rp * result_array[j-1]

        return result_array