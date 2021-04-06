# Time Complexity is O(n)
# Space Complexity is O(1)
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        """
        [1,2,3,4]
        i=0
        rnProd = 1
        i=1
        rnProd=1
        i=2
        rnProd=2
        i=3
        rnProd=6
        
        """
        output = [1]*len(nums)
        rnProd = 1
        for i in range(1,len(nums)):
            rnProd = rnProd*nums[i-1]
            output[i] *= rnProd
        # output = [1,1,2,6]
        rnProd = 1
        for i in range(len(nums)-2,-1,-1):
            rnProd = rnProd*nums[i+1]
            output[i]*=rnProd
        #
        return output